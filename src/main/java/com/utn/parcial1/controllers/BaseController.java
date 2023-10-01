package com.utn.parcial1.controllers;

import com.utn.parcial1.entities.Base;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.Serializable;

public interface BaseController <E extends Base,Id extends Serializable>{
    public ResponseEntity<?> getAll();
    public ResponseEntity<?> getOne(@PathVariable Id id);
    public ResponseEntity<?> save(@RequestBody E entity);
    public ResponseEntity<?> update(@PathVariable Id id, @RequestBody E entity);
    public ResponseEntity<?> delete(@PathVariable Id id);
}
