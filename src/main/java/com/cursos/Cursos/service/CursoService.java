package com.cursos.Cursos.service;

import com.cursos.Cursos.dto.cursoDTO;
import com.cursos.Cursos.model.Curso;
import com.cursos.Cursos.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CursoService implements ICursoService{

    @Autowired
    private CursoRepository repo;

    @Override
    public cursoDTO crearCurso(Curso curso) {
        return null;
    }

    @Override
    public List<cursoDTO> traerCursos() {
        return List.of();
    }

    @Override
    public cursoDTO editarCurso(Long id_curso, Curso curso) {
        return null;
    }
}
