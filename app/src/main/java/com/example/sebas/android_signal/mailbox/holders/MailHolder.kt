package com.example.sebas.android_signal.mailbox.holders

import android.support.v7.view.menu.ActionMenuItemView
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.example.sebas.android_signal.DB.models.Mail
import com.example.sebas.android_signal.R

/**
 * Created by sebas on 1/24/18.
 */

class MailHolder(view: View) : RecyclerView.ViewHolder(view), View.OnClickListener {

    private var mail : Mail? = null
    protected var headerView : TextView? = null
    protected var subjectView : TextView? = null
    protected var previewView : TextView? = null
    protected var dateView : TextView? = null
    protected var countView : TextView? = null
    protected var attachAlert : ImageView? = null
    protected var multiselectIcon : ImageView? = null
    protected var timerAlert : ImageView? = null
    protected var criptextIconsLayout : View? = null
    protected var regularAttachIcon : View? = null
    protected var reFwIcon : ImageView? = null
    protected val context = view.context

//    protected var criptextAlert : ImageView? = null
    init {
        view.setOnClickListener(this)
    }
    override fun onClick(p0: View?) {
        Log.d("RECYCLER VIEW", "click")
    }


    fun bindMail(mail: Mail) {
        previewView!!.text = mail.body
        dateView!!.text = mail.sent_in.toString()
    }




    init {
        headerView = view.findViewById(R.id.email_header) as TextView?
        subjectView = view.findViewById(R.id.email_subject) as TextView?
        previewView = view.findViewById(R.id.email_preview) as TextView?
        dateView = view.findViewById(R.id.email_date) as TextView?
        // criptextAlert = view.findViewById(R.id.email_lock_icon) as ImageView?
        attachAlert = view.findViewById(R.id.email_attach_icon) as ImageView?
        timerAlert = view.findViewById(R.id.email_timer_icon) as ImageView?
        countView = view.findViewById(R.id.email_count) as TextView?
        multiselectIcon = view.findViewById(R.id.multi_icon) as ImageView?
        criptextIconsLayout = view.findViewById(R.id.criptext_icons_layout)
        regularAttachIcon = view.findViewById(R.id.regular_attach_icon)
        reFwIcon = view.findViewById(R.id.re_fw_icon) as ImageView?
    }
}
