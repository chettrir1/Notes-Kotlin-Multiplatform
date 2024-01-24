package com.example.noteskmm.data.local

import com.squareup.sqldelight.db.SqlDriver

/**
 * expect is KMM keyword
 * it tells us there needs to be an
 * actual implementation of the class
 */

expect class DatabaseDriverFactory {
    fun createDriver(): SqlDriver
}