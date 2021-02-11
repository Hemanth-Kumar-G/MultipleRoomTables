package com.hemanth.multipleroomtables

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.hemanth.multipleroomtables.entites.Director
import com.hemanth.multipleroomtables.entites.School
import com.hemanth.multipleroomtables.entites.Student
import com.hemanth.multipleroomtables.entites.Subject
import com.hemanth.multipleroomtables.entites.relations.StudentSubjectCrossRef

@Database(
    entities = [
        School::class,
        Student::class,
        Director::class,
        Subject::class,
        StudentSubjectCrossRef::class
    ],
    version = 1
)
abstract class SchoolDatabase : RoomDatabase() {

    abstract val schoolDao: SchoolDao

    companion object {
        @Volatile
        private var INSTANCE: SchoolDatabase? = null

        fun getInstance(context: Context): SchoolDatabase {
            synchronized(this) {
                return INSTANCE ?: Room.databaseBuilder(
                    context.applicationContext,
                    SchoolDatabase::class.java,
                    "school_db"
                ).build().also {
                    INSTANCE = it
                }
            }
        }
    }
}