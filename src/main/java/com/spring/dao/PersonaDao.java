package com.spring.dao;

import com.spring.test.domain.*;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDao extends CrudRepository<Persona, Long> {

}
