package com.example.apirest.controller;

import com.example.apirest.controller.imple.BaseControllerImpl;
import com.example.apirest.entity.Persona;
import com.example.apirest.service.impl.PersonaServiceImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl<Persona,PersonaServiceImpl> {

    @GetMapping("/search")
    public ResponseEntity<?> search(@RequestParam String filtro){
        try{
            return ResponseEntity.status(OK).body(service.search(filtro));
        }catch (Exception e){
            return ResponseEntity.status(NOT_FOUND).body("{\"error\":\""+e.getMessage()+"\"}");

        }
    }
    @GetMapping("/searchPaged")
    public ResponseEntity<?> search(@RequestParam String filtro, Pageable pageable){
        try{
            return ResponseEntity.status(OK).body(service.search(filtro,pageable));
        }catch (Exception e){
            return ResponseEntity.status(NOT_FOUND).body("{\"error\":\""+e.getMessage()+"\"}");

        }
    }
}
