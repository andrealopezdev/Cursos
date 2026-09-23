package com.cursos.Cursos.service;

import com.cursos.Cursos.dto.cursoDTO;
import com.cursos.Cursos.dto.temaDTO;
import com.cursos.Cursos.model.Curso;
import com.cursos.Cursos.model.Tema;

import java.util.List;

public interface ITemaService {

    temaDTO crearTema(Tema tema);
    List<Tema> traerTemas();
    List<temaDTO> traerTemasByCurso(long id_curso);
}
