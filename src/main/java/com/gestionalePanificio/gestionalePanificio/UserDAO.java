package com.gestionalePanificio.gestionalePanificio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface UserDAO extends CrudRepository<User, Long> {
    User findByUsernameAndPassword(String username,String password);
}
