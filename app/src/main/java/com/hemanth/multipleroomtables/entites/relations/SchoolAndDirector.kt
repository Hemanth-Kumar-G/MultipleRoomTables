package com.hemanth.multipleroomtables.entites.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.hemanth.multipleroomtables.entites.Director
import com.hemanth.multipleroomtables.entites.School


// it 1 to 1 relationship  , it is represented by "And" as per google doc
data class SchoolAndDirector(
    @Embedded
    val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val director: Director
)