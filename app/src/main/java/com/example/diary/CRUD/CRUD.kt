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
            NameList.clear()
            for(doc in ref){
                val Title = doc.getString("Title")?:"Unknown"
                val note = doc.getString("note")?:"Unknown"
                NameList.add()
            }
        }
        .addOnFailureListener{e->
            println("Falure ${e}")
        }
}