package com.cursos.Cursos.service;

import com.cursos.Cursos.dto.cursoDTO;
import com.cursos.Cursos.dto.temaDTO;
import com.cursos.Cursos.model.Curso;
import com.cursos.Cursos.model.Tema;
import com.cursos.Cursos.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class CursoService implements ICursoService{

    @Autowired
    private CursoRepository repo;

    @Override
    public cursoDTO crearCurso(Curso curso) {
        Curso cur = repo.save(curso);
        cursoDTO cursodto = toDTO(cur);
        return cursodto;
    };

    @Override
    public List<cursoDTO> traerCursos() {
        return listaCursosDto(repo.findAll());
    }

    @Override
    public cursoDTO editarCurso(Long id_curso, Curso curso) {
        Curso cur = repo.findById(id_curso)
                .orElseThrow(() -> new RuntimeException("Curso no encontrado"));
        cur.setId_curso(curso.getId_curso());
        cur.setNombre(curso.getNombre());
        cur.setListaTemas(curso.getListaTemas());
        cur.setModalidad(curso.getModalidad());
        cur.setFecha_finalizacion(curso.getFecha_finalizacion());
        Curso curActualizado = repo.save(cur);
        cursoDTO cursodto = toDTO(curActualizado);
        return cursodto;
    }

    public cursoDTO toDTO (Curso curso) {
        cursoDTO cursodto = new cursoDTO();
        cursodto.setNombre(curso.getNombre());
        cursodto.setListaTemas(toDTOTemaLista(curso.getListaTemas()));
        cursodto.setId_curso(curso.getId_curso());
        return cursodto;
    };

    public temaDTO toDTOTema (Tema tema) {
        temaDTO temadto = new temaDTO();
        temadto.setCurso(tema.getCurso());
        temadto.setId_tema(tema.getId_tema());
        temadto.setNombre_tema(tema.getNombre_tema());
        return temadto;
    };

    public List<temaDTO> toDTOTemaLista (List<Tema> listadetemas) {
        List<temaDTO> listaTemasDto = new ArrayList<temaDTO>();
        for (Tema tema: listadetemas){
            temaDTO temadto = toDTOTema(tema);
            listaTemasDto.add(temadto);
        }
        return listaTemasDto;
    }

    public List<cursoDTO> listaCursosDto(List<Curso> listaCursos) {
        List<cursoDTO> listaDto = new ArrayList<cursoDTO>();
        for (Curso curso:listaCursos){
            cursoDTO cursodto = toDTO(curso);
            listaDto.add(cursodto);
        }
        return listaDto;
    }
}


