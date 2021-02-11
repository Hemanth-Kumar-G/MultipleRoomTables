package com.hemanth.multipleroomtables.entites.relations

import androidx.room.Entity

// this is n to M relationship ,represented by crossRef

@Entity(primaryKeys = ["studentName", "subjectName"])
data class StudentSubjectCrossRef(
    val studentName: String,
    val subjectName: String
)
