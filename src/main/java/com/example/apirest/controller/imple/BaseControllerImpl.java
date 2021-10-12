package com.example.apirest.controller.imple;

import com.example.apirest.entity.base.Base;
import com.example.apirest.service.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import static org.springframework.http.HttpStatus.*;

public abstract class BaseControllerImpl<T extends Base,S extends BaseServiceImpl<T,Long>> implements BaseController<T,Long> {

    @Autowired
    protected S service;

    @GetMapping
    public ResponseEntity<?> getAll(){
        try{
            return ResponseEntity.status(OK).body(service.findAll());
        }catch (Exception e){
            return ResponseEntity.status(NOT_FOUND)
                    .body("{\"error\":\"Error. Por favor intente más tarde.\"}");
        }
    }
    @GetMapping("/paged")
    public ResponseEntity<?> getAll(Pageable pageable){
        try{
            return ResponseEntity.status(OK).body(service.findAll(pageable));
        }catch (Exception e){
            return ResponseEntity.status(NOT_FOUND)
                    .body("{\"error\":\"Error. Por favor intente más tarde.\"}");
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id){
        try{
            return ResponseEntity.status(OK).body(service.findById(id));
        }catch (Exception e){
            return ResponseEntity.status(NOT_FOUND)
                    .body("{\"error\":\"Error. Por favor intente más tarde.\"}");
        }

    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody T t){
        try{
            return ResponseEntity.status(OK).body(service.save(t));
        }catch (Exception e){
            return ResponseEntity.status(BAD_REQUEST)
                    .body("{\"error\":\"Error. Por favor intente más tarde.\"}");
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id,@RequestBody T t){
        try{
            return ResponseEntity.status(OK).body(service.update(id,t));
        }catch (Exception e){
            return ResponseEntity.status(BAD_REQUEST)
                    .body("{\"error\":\"Error. Por favor intente más tarde.\"}");
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        try{
            return ResponseEntity.status(NO_CONTENT).body(service.delete(id));
        }catch (Exception e){
            return ResponseEntity.status(BAD_REQUEST)
                    .body("{\"error\":\"Error. Por favor intente más tarde.\"}");
        }
    }

}
