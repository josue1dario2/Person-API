package com.example.apirest.service.impl;

import com.example.apirest.entity.Localidad;
import com.example.apirest.repository.LocalidadRepository;
import com.example.apirest.service.LocalidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad,Long> implements LocalidadService {

    @Autowired
    private LocalidadRepository localidadRepository;

}
