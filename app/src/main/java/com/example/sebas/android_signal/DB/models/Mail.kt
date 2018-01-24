package com.example.sebas.android_signal.DB.models

import java.util.*

/**
 * Created by sebas on 1/24/18.
 */

class Mail {
    var id: Int? = null
    var from : String? = null
    var title: String? = null
    var body: String? = null
    var sent_in: Date? = null

    constructor(id: Int, from: String, title: String, body: String, sent_in: Date) {
        this.id = id
        this.from = from
        this.body = body
        this.sent_in = sent_in
    }
}