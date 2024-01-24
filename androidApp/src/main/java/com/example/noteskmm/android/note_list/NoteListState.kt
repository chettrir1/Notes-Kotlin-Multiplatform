package com.example.noteskmm.android.note_list

import com.example.noteskmm.domain.note.Note


data class NoteListState(
    val notes: List<Note> = emptyList(),
    val searchText: String = "",
    val isSearchActive: Boolean = false
)
