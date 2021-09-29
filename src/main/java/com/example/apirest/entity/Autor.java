package com.example.apirest.entity;

import com.example.apirest.entity.base.Base;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "autor")
@Audited
public class Autor extends Base {

    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "biografia",length = 1500)
    private String biografia;


}
