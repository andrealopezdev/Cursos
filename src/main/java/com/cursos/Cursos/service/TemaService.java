package com.cursos.Cursos.service;

import com.cursos.Cursos.dto.temaDTO;
import com.cursos.Cursos.model.Tema;
import com.cursos.Cursos.repository.TemaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TemaService implements ITemaService{

    @Autowired
    private TemaRepository repo;

    @Override
    public temaDTO crearTema(Tema tema) {
        return null;
    }

    @Override
    public List<temaDTO> traerTemas(Long id_curso) {
        return List.of();
    }

    @Override
    public temaDTO editarTema(Long id_tema, Tema tema) {
        return null;
    }
}
