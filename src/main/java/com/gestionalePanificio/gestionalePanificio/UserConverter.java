package com.gestionalePanificio.gestionalePanificio;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserConverter {

    public User toEntity(UserDTO userDTO) {
        User user = null;
        if (userDTO != null) {
            user = new User(userDTO.getId(),userDTO.getUsername(),userDTO.getPassword(),userDTO.getUsertype());
        }
        return user;
    }


    public UserDTO toDTO(User user) {
        UserDTO userDTO = null;
        if (user != null) {
            userDTO = new UserDTO(user.getId(),user.getUsername(),user.getPassword(),user.getUsertype());

        }
        return userDTO;
    }

    public List<User> toEntityList (Iterable<UserDTO> listDTO) {
        List<User> list = new ArrayList<User>();

        if(listDTO != null) {
            for (UserDTO dto:listDTO) {
                User entity = toEntity(dto);
                list.add(entity);
            }
        }
        return list;
    }

    public List<UserDTO> toDTOList (Iterable<User> listEntity) {
        List<UserDTO> list = new ArrayList<UserDTO>();

        if(listEntity != null) {
            for (User entity:listEntity) {
                UserDTO dto = toDTO(entity);
                list.add(dto);
            }
        }
        return list;
    }
}
