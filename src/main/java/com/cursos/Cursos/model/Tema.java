package com.cursos.Cursos.model;

import com.cursos.Cursos.dto.temaDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Tema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id_tema;
    public String nombre_tema;
    public String descripcion;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="cursoId")
    public Curso curso;

    public temaDTO toDTOTema (Tema tema) {
        temaDTO temadto = new temaDTO();
        temadto.setCurso(tema.getCurso());
        temadto.setId_tema(tema.getId_tema());
        temadto.setNombre_tema(tema.getNombre_tema());
        return temadto;
    };

};
