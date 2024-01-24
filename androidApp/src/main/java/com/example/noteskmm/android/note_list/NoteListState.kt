package com.example.noteskmm.android.note_list

import android.provider.ContactsContract.CommonDataKinds.Note

data class NoteListState(
    val notes: List<Note> = emptyList(),
    val searchText: String = "",
    val isSearchActive: Boolean = false
)
