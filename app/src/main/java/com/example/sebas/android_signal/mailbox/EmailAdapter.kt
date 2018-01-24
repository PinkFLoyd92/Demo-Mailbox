package com.example.sebas.android_signal.mailbox

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.sebas.android_signal.DB.models.Mail
import com.example.sebas.android_signal.R
import com.example.sebas.android_signal.mailbox.holders.MailHolder
import com.example.sebas.android_signal.mailbox.holders.ThreadHolder

/**
 * Created by sebas on 1/23/18.
 */

class EmailAdapter(private val mails : ArrayList<Mail>): RecyclerView.Adapter<MailHolder>() {
    override fun onBindViewHolder(holder: MailHolder?, position: Int) {
        val mail = mails[position]
        holder?.bindMail(mail)
    }

    override fun getItemCount(): Int {
        return mails.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MailHolder {
        val inflatedView = LayoutInflater.from(parent!!.context).inflate(R.layout.mail_item, parent, false)
        return MailHolder(inflatedView)
    }

}
