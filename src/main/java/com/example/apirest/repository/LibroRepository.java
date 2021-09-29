package com.example.apirest.repository;

import com.example.apirest.entity.Libro;
import com.example.apirest.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends BaseRepository<Libro,Long> {
}
