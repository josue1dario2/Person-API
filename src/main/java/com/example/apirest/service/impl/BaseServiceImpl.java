package com.example.apirest.service.impl;

import com.example.apirest.entity.base.Base;
import com.example.apirest.repository.base.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class BaseServiceImpl<T extends Base, ID extends Serializable> implements BaseService<T, ID> {
    @Autowired
    protected BaseRepository<T,ID> baseRepository;


    @Override
    @Transactional
    public List<T> findAll() throws Exception {
        try{
            List<T> entities  = baseRepository.findAll();
            return entities;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    @Override
    @Transactional
    public Page<T> findAll(Pageable pageable) throws Exception {
        try{
            Page<T> entities  = baseRepository.findAll(pageable);
            return entities;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public T findById(ID id) throws Exception {
        try{
            Optional<T> entityOptional = baseRepository.findById(id);
            return entityOptional.get();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public T save(T entity) throws Exception {
        try{
            entity = baseRepository.save(entity);
            return entity;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public T update(ID id, T entity) throws Exception {
        try{
            Optional<T> personaOptional = baseRepository.findById(id);
            T t = personaOptional.get();
            t = baseRepository.save(entity);
            return t;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(ID id) throws Exception {
        try{
            if(baseRepository.existsById(id)){
                baseRepository.deleteById(id);
                return true;
            }else{
                throw new Exception();
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

}
