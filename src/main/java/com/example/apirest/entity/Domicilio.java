package com.example.apirest.entity;

import com.example.apirest.entity.base.Base;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "domicilio")
@Audited
@NoArgsConstructor
public class Domicilio extends Base {

    @Column(name = "calle")
    private String calle;

    @Column(name = "numero")
    private Integer numero;

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_localidad")
    private Localidad localidad;

}
