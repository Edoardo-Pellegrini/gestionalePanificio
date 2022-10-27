package com.gestionalePanificio.gestionalePanificio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    protected UserDAO repository;
    @Autowired
    protected UserConverter converter;


    public UserDTO insert(UserDTO dto) {
        return converter.toDTO(repository.save(converter.toEntity(dto)));
    }


    public Iterable<UserDTO> getAll() {
        return converter.toDTOList(repository.findAll());
    }


    public UserDTO read(long id) {
        return converter.toDTO(repository.findById(id).get());
    }


    public UserDTO update(UserDTO dto) {
        return converter.toDTO(repository.save(converter.toEntity(dto)));
    }


    public void delete(long id) {
        repository.deleteById(id);
    }

    public UserDTO findByUsernameAndPassword(String username, String password){
        return converter.toDTO(repository.findByUsernameAndPassword(username, password));
    }
}
