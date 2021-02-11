package com.hemanth.multipleroomtables.entites.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.hemanth.multipleroomtables.entites.School
import com.hemanth.multipleroomtables.entites.Student

// it is 1 to n relationship , it is represented with "with"
data class SchoolWithStudents(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val students: List<Student>
)
