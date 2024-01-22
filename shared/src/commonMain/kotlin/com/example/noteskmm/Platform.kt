package com.example.noteskmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform