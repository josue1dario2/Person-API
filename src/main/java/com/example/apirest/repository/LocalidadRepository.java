package com.example.apirest.repository;

import com.example.apirest.entity.Localidad;
import com.example.apirest.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalidadRepository extends BaseRepository<Localidad,Long> {
}
