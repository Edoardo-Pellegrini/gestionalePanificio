package com.gestionalePanificio.gestionalePanificio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    @Autowired
    private UserService service;
    @GetMapping("/getall")
    public Iterable<UserDTO> getAll(){
        return service.getAll();
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam("id") long id) {
        service.delete(id);
    }

    @PutMapping("/update")
    public UserDTO update(@RequestBody UserDTO dto){
        service.update(dto);
        return dto;
    }

    @PostMapping("/insert")
    public UserDTO insert (@RequestBody UserDTO dto) {
        service.insert(dto);
        return dto;
    }

    @GetMapping("/read")
    public UserDTO read(long id) {
        return service.read(id);
    }
    @PostMapping(value = "/login")
    public UserDTO login( @RequestBody LoginDTO loginDTO ) {
        return service.findByUsernameAndPassword(loginDTO.getUsername(), loginDTO.getPassword());
    }

}
