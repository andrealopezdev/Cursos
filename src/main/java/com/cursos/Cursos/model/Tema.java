package com.cursos.Cursos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
}
