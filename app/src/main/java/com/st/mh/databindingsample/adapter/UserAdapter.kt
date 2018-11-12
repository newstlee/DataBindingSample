package com.st.mh.databindingsample.adapter

import android.databinding.DataBindingUtil
import android.databinding.ObservableArrayList
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.st.mh.databindingsample.R
import com.st.mh.databindingsample.databinding.ItemListBinding
import com.st.mh.databindingsample.model.User

class UserAdapter(private val list: ObservableArrayList<User>): RecyclerView.Adapter<UserAdapter.UserHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserHolder {
        val binding: ItemListBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_list, parent, false)
        return UserHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: UserHolder, position: Int) {
        holder.binding.model = list[position]
    }

    class UserHolder(binding: ItemListBinding): RecyclerView.ViewHolder(binding.root) {
        var binding: ItemListBinding = binding
    }
}