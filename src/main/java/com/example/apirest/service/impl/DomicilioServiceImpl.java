package com.example.apirest.service.impl;

import com.example.apirest.entity.Domicilio;
import com.example.apirest.repository.DomicilioRepository;
import com.example.apirest.service.DomicilioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomicilioServiceImpl extends BaseServiceImpl<Domicilio,Long> implements DomicilioServicio {

    @Autowired
    private DomicilioRepository domicilioRepository;
}
