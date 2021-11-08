package com.examen.examen.service;

import java.util.List;

import com.examen.examen.entity.Editoriales;

public interface SEditoriales {
	Editoriales create(Editoriales editorial);
    List<Editoriales> readAll();
    Editoriales read(Long id);
    void delete(Long id);
    Editoriales update(Editoriales editorial);
}

