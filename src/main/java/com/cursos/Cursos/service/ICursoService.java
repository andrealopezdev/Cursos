package com.cursos.Cursos.service;

import com.cursos.Cursos.dto.cursoDTO;
import com.cursos.Cursos.model.Curso;

import java.util.List;

public interface ICursoService {

    cursoDTO crearCurso(Curso curso);
    List<cursoDTO> traerCursos();
    cursoDTO editarCurso(Long id_curso, Curso curso);
}
