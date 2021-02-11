package com.hemanth.multipleroomtables.entites.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.hemanth.multipleroomtables.entites.Student
import com.hemanth.multipleroomtables.entites.Subject

data class StudentWithSubjects(

    @Embedded
    val student: Student,

    @Relation(
        parentColumn = "studentName",
        entityColumn = "subjectName",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )
    val subjects: List<Subject>
)
