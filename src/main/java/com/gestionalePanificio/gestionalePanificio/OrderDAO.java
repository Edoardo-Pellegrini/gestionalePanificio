package com.gestionalePanificio.gestionalePanificio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface OrderDAO extends CrudRepository<Order,Long> {



}
