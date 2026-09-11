package com.cursos.Cursos.repository;

import com.cursos.Cursos.dto.cursoDTO;
import com.cursos.Cursos.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CursoRepository extends JpaRepository<Curso, Long>{

    Optional<cursoDTO> traerCursoQueContenga(String nombre);
}
