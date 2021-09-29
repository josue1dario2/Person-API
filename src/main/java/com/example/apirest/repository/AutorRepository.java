package com.example.apirest.repository;

import com.example.apirest.entity.Autor;
import com.example.apirest.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends BaseRepository<Autor,Long> {
}
