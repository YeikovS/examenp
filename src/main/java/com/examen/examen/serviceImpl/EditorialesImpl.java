package com.examen.examen.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.examen.entity.Editoriales;
import com.examen.examen.repository.EditorialesRepository;
import com.examen.examen.service.SEditoriales;


@Service
public class EditorialesImpl implements SEditoriales {
@Autowired
private EditorialesRepository editorialesRepository;
@Override
public Editoriales create(Editoriales editorial) {
	// TODO Auto-generated method stub
	return editorialesRepository.save(editorial);
}

@Override
public List<Editoriales> readAll() {
	// TODO Auto-generated method stub
	return editorialesRepository.findAll();
}

@Override
public Editoriales read(Long id) {
	// TODO Auto-generated method stub
	return editorialesRepository.findById(id).get();
}

@Override
public void delete(Long id) {
	// TODO Auto-generated method stub
	editorialesRepository.deleteById(id);
	
}

@Override
public Editoriales update(Editoriales editorial) {
	// TODO Auto-generated method stub
	return editorialesRepository.save(editorial);
}
}
