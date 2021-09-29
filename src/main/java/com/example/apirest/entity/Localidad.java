package com.example.apirest.entity;

import com.example.apirest.entity.base.Base;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "localidad")
@Audited
public class Localidad extends Base {

    @Column(name = "denominacion")
    private String denominacion;

}
