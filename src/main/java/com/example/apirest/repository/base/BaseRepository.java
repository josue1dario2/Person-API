package com.example.apirest.repository.base;

import com.example.apirest.entity.base.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean//De este repositorio no se van a poder crear instancias
public interface BaseRepository <T extends Base, ID extends Serializable> extends JpaRepository<T,ID> {

}
