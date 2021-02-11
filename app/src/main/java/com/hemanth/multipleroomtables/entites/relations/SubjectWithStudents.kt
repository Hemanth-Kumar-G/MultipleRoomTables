package com.hemanth.multipleroomtables.entites.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.hemanth.multipleroomtables.entites.Student
import com.hemanth.multipleroomtables.entites.Subject

data class SubjectWithStudents(
    @Embedded val subject: Subject,
    @Relation(
        parentColumn = "subjectName",
        entityColumn = "studentName",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )
    val students: List<Student>
)