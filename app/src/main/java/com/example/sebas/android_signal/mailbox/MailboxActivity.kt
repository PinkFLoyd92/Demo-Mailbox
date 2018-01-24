package com.example.sebas.android_signal.mailbox

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.sebas.android_signal.R
import com.example.sebas.android_signal.mailbox.data.MailboxData
import kotlinx.android.synthetic.main.activity_mailbox.view.*

/**
 * Created by sebas on 1/23/18.
 */
class MailboxActivity : AppCompatActivity() {

    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var recyclerView : RecyclerView
    private lateinit var recyclerAdapter: EmailAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_mailbox)
        recyclerView = findViewById(R.id.mailbox_recycler) as RecyclerView
        linearLayoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = linearLayoutManager
        recyclerAdapter = EmailAdapter(MailboxData.getEmailsFromJSON())
        recyclerView.adapter = recyclerAdapter
    }

}
