package com.cursos.Cursos.service;

import com.cursos.Cursos.dto.temaDTO;
import com.cursos.Cursos.model.Tema;
import com.cursos.Cursos.repository.TemaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class TemaService implements ITemaService{

    @Autowired
    private TemaRepository repo;

    @Override
    public temaDTO crearTema(Tema tema) {
        Tema temaguardado = repo.save(tema);
        temaDTO temadto = temaguardado.toDTOTema(temaguardado);
        return temadto;
    }

    @Override
    public List<Tema> traerTemas() {
        return repo.findAll();
    }

    @Override
    public List<temaDTO> traerTemasByCurso(long id_curso) {
        List<Tema> listaTemas = traerTemas();
        List<temaDTO> listaTemasPorCurso = new ArrayList<temaDTO>();
        for (Tema tema: listaTemas) {
            if (tema.getCurso().getId_curso() == id_curso) {
                temaDTO temadto = tema.toDTOTema(tema);
                listaTemasPorCurso.add(temadto);
            }
        }
        return listaTemasPorCurso;
    }

}
