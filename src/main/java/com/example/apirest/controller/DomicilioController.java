package com.example.apirest.controller;

import com.example.apirest.controller.imple.BaseControllerImpl;
import com.example.apirest.entity.Domicilio;
import com.example.apirest.service.impl.DomicilioServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/domicilios")
public class DomicilioController extends BaseControllerImpl<Domicilio, DomicilioServiceImpl> {
}
