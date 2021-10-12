package com.example.apirest.service.impl;

import com.example.apirest.entity.Libro;
import com.example.apirest.repository.LibroRepository;
import com.example.apirest.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServiceImpl extends BaseServiceImpl<Libro,Long> implements LibroService {

    @Autowired
    private LibroRepository libroRepository;
}
