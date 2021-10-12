package com.example.apirest.repository;

import com.example.apirest.entity.Domicilio;
import com.example.apirest.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DomicilioRepository extends BaseRepository<Domicilio,Long> {
}
