package com.sayyed.softuser.model


private val studentsList = ArrayList<StudentModel>()

class StudentsList {

    fun addStudentInList(student: StudentModel) {
        studentsList.add(student)
    }

    fun printStudentList() {
        for (i in studentsList.indices) {
            println("============>list<==============")
            println(studentsList[i])
        }
    }

    fun getStudentList(): ArrayList<StudentModel> {
        return studentsList
    }



    fun preLoadData() {
        val students = StudentsList()

        students.addStudentInList(createStudentObject(
                "Pervez Akhtar",
                "Kalaiya",
                "Male",
                "35",
                "https://images.squarespace-cdn.com/content/v1/53fb0b8ee4b0eafa4732edde/1503324228242-6N150NP2CQ4FFUYEWP30/ke17ZwdGBToddI8pDm48kNKU_v8gJAcxDrmB-soKvj1Zw-zPPgdn4jUwVcJE1ZvWEtT5uBSRWt4vQZAgTJucoTqqXjS3CfNDSuuf31e0tVH7wdpQi_gwH_-rfgB8xc3aCDYU5QsKfHvKofLxtwAwA5XleA9PsoOHujT9UMkA80c/image-asset.jpeg?format=1000w"))

        students.addStudentInList(createStudentObject(
                "Sayyed Abrar Akhtar",
                "Kalaiya",
                "Male",
                "20",
                "https://media-exp1.licdn.com/dms/image/C5603AQF0t0kf_fNhMQ/profile-displayphoto-shrink_200_200/0/1599457270912?e=1614816000&v=beta&t=7tc-ywjzAJetE15dC0tLR2r9ukegtX27pKAD2jjKBKk"))

        students.addStudentInList(createStudentObject(
                "Nisha Khatun",
                "Gongabu",
                "Female",
                "18",
                "https://lh3.googleusercontent.com/proxy/ki15vM82D6DBc0q848a80Rtu9sHKECDzMxaqSfKeHLHBG7TkRolqiMISXgJD2akNSNw25r1WrUBAQz_Vi1GRJLYISNXtQ1ZW445sNC--BqmE1Bsy2QhMkg3djobUovvbO_G3Icw3fWmrm0lvuywlNzI"))

    }

    private fun createStudentObject(fullName:String, address:String, gender:String, age:String, dp:String) :StudentModel {
        return StudentModel(fullName, address, gender, age, dp)
    }

}

