package com.example.noteskmm.domain.note

import com.example.noteskmm.presentation.BabyBlueHex
import com.example.noteskmm.presentation.LightGreenHex
import com.example.noteskmm.presentation.RedOrangeHex
import com.example.noteskmm.presentation.RedPinkHex
import com.example.noteskmm.presentation.VioletHex
import kotlinx.datetime.LocalDateTime

data class Note(
    val id: Long? = null,
    val title: String,
    val content: String,
    val colorHex: Long,
    val created: LocalDateTime
) {
    companion object {
        private val colors = listOf(
            RedOrangeHex,
            RedPinkHex,
            BabyBlueHex,
            VioletHex,
            LightGreenHex
        )

        fun generateRandomColor() {
            colors.random()
        }
    }
}
