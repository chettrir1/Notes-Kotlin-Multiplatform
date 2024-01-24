package com.example.noteskmm.android.note_list

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.noteskmm.domain.note.Note
import com.example.noteskmm.domain.note.NoteDataSource
import com.example.noteskmm.domain.note.SearchNotes
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NoteListViewModel @Inject constructor(
    private val noteDataSource: NoteDataSource,
    savedStateHandle: SavedStateHandle
) : ViewModel() {
    private val searchNotes = SearchNotes()

    val notes = savedStateHandle.getStateFlow("notes", emptyList<Note>())
    val searchText = savedStateHandle.getStateFlow("searchText", "")
    val isSearchActive = savedStateHandle.getStateFlow("isSearchActive", false)

}