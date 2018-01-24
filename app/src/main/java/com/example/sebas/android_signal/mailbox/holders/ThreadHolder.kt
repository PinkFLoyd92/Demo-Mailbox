package com.example.sebas.android_signal.mailbox.holders

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.example.sebas.android_signal.R

/**
 * Created by sebas on 1/23/18.
 */
open class ThreadHolder(view: View) : RecyclerView.ViewHolder(view) {
    protected var headerView : TextView? = null
    protected var subjectView : TextView? = null
    protected var previewView : TextView? = null
    protected var dateView : TextView? = null
    protected var countView : TextView? = null
    protected var criptextAlert : ImageView? = null
    protected var attachAlert : ImageView? = null
    protected var multiselectIcon : ImageView? = null
    protected var timerAlert : ImageView? = null
    protected var criptextIconsLayout : View? = null
    protected var regularAttachIcon : View? = null
    protected var reFwIcon : ImageView? = null
    protected val context = view.context

    open fun fillFields(header: String, subject: String, preview: String, date: String){
        if(header.contains("Draft")){
/*            headerView?.text = colorDraftSubstringRed(header)*/
        }else{
            headerView?.text = header
        }

        if(subject == ""){
            subjectView?.text = "(No Subject)"
        }else{
            subjectView?.text = subject
        }
        if(preview == ""){
            previewView?.text = "(No Content)"
        }else{
/*            previewView?.text = colorNoContentGray(preview)*/
        }
        dateView?.text = date
    }


    init {
        headerView = view.findViewById(R.id.email_header) as TextView?
        subjectView = view.findViewById(R.id.email_subject) as TextView?
        previewView = view.findViewById(R.id.email_preview) as TextView?
        dateView = view.findViewById(R.id.email_date) as TextView?
        countView = view.findViewById(R.id.email_count) as TextView?
        multiselectIcon = view.findViewById(R.id.multi_icon) as ImageView?
        criptextIconsLayout = view.findViewById(R.id.criptext_icons_layout)
        regularAttachIcon = view.findViewById(R.id.regular_attach_icon)
        reFwIcon = view.findViewById(R.id.re_fw_icon) as ImageView?
    }
}
