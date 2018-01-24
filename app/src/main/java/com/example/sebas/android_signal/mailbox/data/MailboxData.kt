package com.example.sebas.android_signal.mailbox.data

import com.example.sebas.android_signal.DB.models.Mail
import org.json.JSONObject
import org.json.JSONArray
import org.json.JSONException
import java.text.SimpleDateFormat
import java.util.*


/**
 * Created by sebas on 1/23/18.
 */

class MailboxData {

    companion object {
        fun getDummyJSONEmails(): JSONArray {
            val mail1 = JSONObject()
            try {
                mail1.put("id", 1)
                mail1.put("from", "blah@gmail.com")
                mail1.put("title", "Hello")
                mail1.put("body", "say hello to...")
                mail1.put("sent_in", "2018/05/07 12:33:12")

            } catch (e: JSONException) {
                e.printStackTrace()
            }


            val mail2 = JSONObject()
            try {
                mail2.put("id", 2)
                mail2.put("from", "blah2@gmail.com")
                mail2.put("title", "Hello2")
                mail2.put("body", "say hello to...2")
                mail2.put("sent_in", "2015/03/02 08:33:12")

            } catch (e: JSONException) {
                e.printStackTrace()
            }

            val jsonArray = JSONArray()

            jsonArray.put(mail1)
            jsonArray.put(mail2)

            return jsonArray
        }


        fun getEmailsFromJSON(): ArrayList<Mail> {
            var arrayMails : ArrayList<Mail> = arrayListOf()
            val jsonEmail:JSONArray = getDummyJSONEmails()
            val dateFormat = SimpleDateFormat("yyyy/MM/dd HH:mm:ss")
            for (i in 0..(jsonEmail.length() - 1)) {
                val item: JSONObject = jsonEmail.getJSONObject(i)
                    arrayMails.add(Mail(id = item.getInt("id"),
                            from = item.getString("from"),
                            body = item.getString("body"),
                            title = item.getString("title"),
                            sent_in = dateFormat.parse(item.getString("sent_in"))
                    ))
            }
            return arrayMails
        }
    }
}