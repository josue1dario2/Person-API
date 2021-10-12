package com.example.apirest.service.impl;

import com.example.apirest.entity.Persona;
import com.example.apirest.repository.PersonaRepository;
import com.example.apirest.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona,Long> implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public List<Persona> search(String filtro) throws Exception {
        try{
            List<Persona> personas = personaRepository.findByNombreContainingOrApellidoContaining(filtro,filtro);
            return personas;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Persona> search(String filtro, Pageable pageable) throws Exception {
        try{
            Page<Persona> personas = personaRepository.searchNativo(filtro,pageable);
            return personas;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
