package com.example.apirest.controller.imple;

import com.example.apirest.entity.base.Base;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


import java.io.Serializable;

public interface  BaseController<T extends Base,ID extends Serializable> {

    public ResponseEntity<?> getAll();
    public ResponseEntity<?> getAll(Pageable pageable);
    public ResponseEntity<?> getOne(@PathVariable ID id);
    public ResponseEntity<?> save(@RequestBody T t);
    public ResponseEntity<?> update(@PathVariable ID id,@RequestBody T t);
    public ResponseEntity<?> delete(@PathVariable ID id);


}
