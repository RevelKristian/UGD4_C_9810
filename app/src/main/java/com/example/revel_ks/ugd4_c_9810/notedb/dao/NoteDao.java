package com.example.revel_ks.ugd4_c_9810.notedb.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.revel_ks.ugd4_c_9810.notedb.model.Note;
import com.example.revel_ks.ugd4_c_9810.util.Constants;

import java.util.List;

@Dao
public interface NoteDao {

    @Query("SELECT * FROM " + Constants.TABLE_NAME_NOTE)
    List<Note> getNotes();

    @Insert
    long insertNote(Note note);

    @Update
    void updateNote(Note repos);

    @Delete
    void deleteNote(Note note);

    @Delete
    void deleteNotes(Note... note);

}
