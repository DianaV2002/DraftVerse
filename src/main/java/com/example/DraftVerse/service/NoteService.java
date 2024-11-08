package com.example.DraftVerse.service;

import com.example.DraftVerse.persistence.Note;
import com.example.DraftVerse.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoteService{

    @Autowired
    private NoteRepository noteRepository;

    public Note addNote(String title, String content, Integer workspaceId) {
        Note note = new Note();
        note.setTitle(title);
        note.setContent(content);
        note.setWorkspaceId(workspaceId);
        note.setCreatedAt(new java.sql.Timestamp(System.currentTimeMillis()));
        note.setUpdatedAt(new java.sql.Timestamp(System.currentTimeMillis()));

        return noteRepository.save(note);
    }
}
