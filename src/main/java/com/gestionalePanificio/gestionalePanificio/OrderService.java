package com.gestionalePanificio.gestionalePanificio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    protected OrderDAO repository;
    @Autowired
    protected OrderConverter converter;

    public OrderDTO insert(OrderDTO dto) {
        return converter.toDTO(repository.save(converter.toEntity(dto)));
    }


    public Iterable<OrderDTO> getAll() {
        return converter.toDTOList(repository.findAll());
    }


    public OrderDTO read(long id) {
        return converter.toDTO(repository.findById(id).get());
    }


    public OrderDTO update(OrderDTO dto) {
        return converter.toDTO(repository.save(converter.toEntity(dto)));
    }


    public void delete(long id) {
        repository.deleteById(id);
    }
}
