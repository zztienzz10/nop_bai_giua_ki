package com.example.ghi_chu

import android.annotation.SuppressLint
import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class MyListAdapter(private val context: Activity, private val id: Array<String>, private val name: Array<String>, private val email: Array<String>)
    : ArrayAdapter<String>(context, R.layout.custom_list, name) {

    @SuppressLint("InflateParams", "ViewHolder", "SetTextI18n")
    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.custom_list, null, true)

        val idText = rowView.findViewById(R.id.textViewId) as TextView
        val nameText = rowView.findViewById(R.id.textViewName) as TextView
        val emailText = rowView.findViewById(R.id.textViewEmail) as TextView

        idText.text = "ID: ${id[position]}"
        nameText.text = "Tên đăng nhập: ${name[position]}"
        emailText.text = "Mật khẩu: ${email[position]}"
        return rowView
    }
}