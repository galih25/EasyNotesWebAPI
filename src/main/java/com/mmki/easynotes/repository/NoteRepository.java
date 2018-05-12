package com.mmki.easynotes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mmki.easynotes.model.Note;

public interface NoteRepository extends JpaRepository<Note, Long> {

}
