package com.o7services.shabnam

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

/**
 * @Author: 017
 * @Date: 03/03/23
 * @Time: 12:56 PM
 */
class UserAdapter(var array: ArrayList<String>, var clickInterface: ClickInterface) : BaseAdapter() {
    override fun getCount(): Int {
        return array.size
    }

    override fun getItem(position: Int): Any {
        return position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view = LayoutInflater.from(parent?.context).inflate(R.layout.item_adapter, parent, false)
        var tvName = view.findViewById<TextView>(R.id.tvName)
        tvName.setText(array[position])
        tvName.setOnClickListener {
            clickInterface.onClick(array[position])
        }
        return view
    }
}