package com.flowz.kotlinnotekeeperapp

import android.app.Person
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.testing.*
import kotlinx.android.synthetic.main.trial.*


class MyNoteActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.testing)

//        val list = listOf<String>("john", "mike", "victor")

//
//            fab.setOnClickListener { view ->
//            val activityIntent = Intent(this, MainActivity::class.java)
//            startActivity(activityIntent)
//        }


//        Toast.makeText(this, "helo"+list, Toast.LENGTH_LONG).show()
//
//        note_list.adapter = ArrayAdapter<NoteInfo>(this, android.R.layout.simple_list_item_1, DataManager.notes)
//        note_list.setOnItemClickListener { adapterView, view, i, l ->
//
//            val activityIntent = Intent(this, MainActivity::class.java)
//            activityIntent.putExtra(NOTE_POSITION, i)
//            startActivity(activityIntent)
//
//        }

//
//        myList.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, DataManager.notes)


        note_recycler.layoutManager = LinearLayoutManager(this)

        note_recycler.adapter = NoteRecyclerAdapter(this, DataManager.notes)


    }

    override fun onResume() {
        super.onResume()
        note_recycler.adapter?.notifyDataSetChanged()

    }
}
