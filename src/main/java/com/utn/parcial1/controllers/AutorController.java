package com.utn.parcial1.controllers;

import com.utn.parcial1.entities.Autor;
import com.utn.parcial1.entities.Persona;
import com.utn.parcial1.services.AutorServiceImpl;
import com.utn.parcial1.services.PersonaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/autores")
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl> {

}
