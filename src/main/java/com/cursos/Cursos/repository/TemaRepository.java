package com.cursos.Cursos.repository;

import com.cursos.Cursos.dto.temaDTO;
import com.cursos.Cursos.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TemaRepository extends JpaRepository<Tema, Long>{
}
