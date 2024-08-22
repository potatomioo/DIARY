package com.example.diary.CRUD

import android.provider.ContactsContract.CommonDataKinds.Note
import com.example.diary.Notes
import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore
import org.w3c.dom.NameList
import java.util.jar.Attributes.Name

private val db = Firebase.firestore

fun addNote(note: Notes){
    val thisnote = hashMapOf(
        "Title" to note.Title,
        "note" to note.note
    )
    db.collection("notes")
        .add(thisnote)
        .addOnSuccessListener { documentRef ->
            println("Added with id ${documentRef}")
        }
        .addOnFailureListener{e->
            println("Falure ${e}")
        }
}

fun getList(
    NameList : MutableList<Notes>
){
    db.collection("notes")
        .get()
        .addOnSuccessListener { ref->
            for(doc in ref){
                val Title = doc.getString("Title")?:"Unknown"
                val note = doc.getString("note")?:"Unknown"
                val noteId = doc.id
                val notes = Notes(noteId,Title,note)
                NameList.add(notes)
            }
        }
        .addOnFailureListener{e->
            println("Falure ${e}")
        }
}

fun deleteNote(id : String){
    val ref = db.collection("notes").document(id)
    ref.delete()
        .addOnSuccessListener {
            println("Note deleted successfully")
        }
        .addOnFailureListener { e ->
            println("Error deleting note: $e")
        }
}