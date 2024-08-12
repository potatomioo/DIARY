package com.example.diary.CRUD

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
    NameList : MutableList<String>
){
    db.collection("notes")
        .get()
        .addOnSuccessListener { ref->
            NameList.clear()
            for(doc in ref){
                val Fname = doc.getString("first")?:"Unknown"
                val Lname = doc.getString("last")?:"Unknown"
                NameList.add("${Fname} ${Lname}")
            }
        }
        .addOnFailureListener{e->
            println("Falure ${e}")
        }
}