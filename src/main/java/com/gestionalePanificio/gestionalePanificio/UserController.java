package com.gestionalePanificio.gestionalePanificio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping(value = "/login")
    public UserDTO login( @RequestBody LoginDTO loginDTO ) {
        return service.findByUsernameAndPassword(loginDTO.getUsername(), loginDTO.getPassword());
    }

}
