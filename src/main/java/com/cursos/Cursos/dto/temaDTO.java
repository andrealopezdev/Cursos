package com.cursos.Cursos.dto;

import com.cursos.Cursos.model.Curso;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class temaDTO {

    public long id_tema;
    public String nombre_tema;
    public Curso curso;

}
