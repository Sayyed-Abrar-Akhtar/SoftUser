package com.sayyed.softuser.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import com.sayyed.softuser.R
import com.sayyed.softuser.model.StudentModel
import com.sayyed.softuser.model.StudentsList

class StudentFragment : Fragment() {

    private lateinit var etFullName : EditText
    private lateinit var etAge : EditText
    private lateinit var rdoMale : RadioButton
    private lateinit var rdoFemale : RadioButton
    private lateinit var rdoOthers : RadioButton
    private lateinit var etAddress : EditText
    private lateinit var btnSave : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_student, container, false)

        etFullName = view.findViewById(R.id.etFullName)
        etAge = view.findViewById(R.id.etAge)
        rdoMale = view.findViewById(R.id.rdoMale)
        rdoFemale = view.findViewById(R.id.rdoFemale)
        rdoOthers = view.findViewById(R.id.rdoOthers)
        etAddress = view.findViewById(R.id.etAddress)
        btnSave = view.findViewById(R.id.btnSave)

        btnSave.setOnClickListener {
            createStudent()
        }

        return view
    }

    private fun createStudent() {
        val fullname = etFullName.text.toString()
        val age = etAge.text.toString()
        var gender = ""
        val address = etAddress.text.toString()

        when {
            rdoMale.isChecked -> {
                gender = "Male"
            }
            rdoFemale.isChecked -> {
                gender = "Female"
            }
            rdoOthers.isChecked -> {
                gender = "Others"
            }

        }

        val student = StudentModel(fullname, address, gender, age)

        val studentToList = StudentsList()

        studentToList.addStudentInList(student)

        studentToList.printStudentList()
    }


}