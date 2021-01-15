package com.sayyed.softuser.adapter

import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sayyed.softuser.R
import com.sayyed.softuser.model.StudentModel
import de.hdodenhof.circleimageview.CircleImageView

class StudentAdapter (

    val list : ArrayList<StudentModel>,
    val context: Context
) : RecyclerView.Adapter<StudentAdapter.StudentViewHolder>() {
    class StudentViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val studentImage : CircleImageView
        val tvFullName: TextView
        val tvAge: TextView
        val tvAddress: TextView
        val delStudent: ImageView
        val tvGender: TextView

        init {
            studentImage = view.findViewById(R.id.studentImage)
            tvFullName = view.findViewById(R.id.tvFullName)
            tvAge = view.findViewById(R.id.tvAge)
            tvAddress = view.findViewById(R.id.tvAddress)
            delStudent = view.findViewById(R.id.delStudent)
            tvGender = view.findViewById(R.id.tvGender)
        }
    }

}