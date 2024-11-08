package com.example.DraftVerse.controller;

import com.example.DraftVerse.persistence.Note;
import com.example.DraftVerse.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notes")
public class NoteController {

    @Autowired
    private NoteService noteService;

    @PostMapping("/add")
    public Note addNote(@RequestBody Note note) {
        return noteService.addNote(note.getTitle(), note.getContent(), note.getWorkspaceId());
    }

}
