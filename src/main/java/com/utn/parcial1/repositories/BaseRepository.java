package com.utn.parcial1.repositories;

import com.utn.parcial1.entities.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.yaml.snakeyaml.events.Event;
import org.yaml.snakeyaml.tokens.Token;

import java.io.Serializable;

@NoRepositoryBean
public interface BaseRepository<E extends Base, Id extends Serializable> extends JpaRepository<E,Id> {
}
