package com.utn.parcial1.services;

import com.utn.parcial1.entities.Localidad;
import com.utn.parcial1.entities.Persona;
import com.utn.parcial1.repositories.BaseRepository;
import com.utn.parcial1.repositories.LocalidadRepository;
import com.utn.parcial1.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad,Long> implements LocalidadService {
    @Autowired
    private LocalidadRepository localidadRepository;

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository, LocalidadRepository localidadRepository) {
        super(baseRepository);
        this.localidadRepository = localidadRepository;
    }

}
