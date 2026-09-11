package com.cursos.Cursos.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class cursoDTO {

    public long id_curso;
    public String nombre;
    private List<temaDTO> listaTemas;
}
