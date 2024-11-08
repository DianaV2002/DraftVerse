package com.example.DraftVerse.repository;

import com.example.DraftVerse.persistence.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Integer> {
}
