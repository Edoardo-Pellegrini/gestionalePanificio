package com.gestionalePanificio.gestionalePanificio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/order")
@CrossOrigin(origins = "http://localhost:4200")
public class OrderController {


    @Autowired
    private OrderService service;

    @GetMapping("/getall")
    public Iterable<OrderDTO> getAll() {
        return service.getAll();
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam("id") long id) {
        service.delete(id);
    }

    @PutMapping("/update")
    public OrderDTO update(@RequestBody OrderDTO dto) {
        service.update(dto);
        return dto;
    }

    @PostMapping("/insert")
    public OrderDTO insert(@RequestBody OrderDTO dto) {
        service.insert(dto);
        return dto;
    }

    @GetMapping("/read")
    public OrderDTO read(long id) {
        return service.read(id);
    }


}
