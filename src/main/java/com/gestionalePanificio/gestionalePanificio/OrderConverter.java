package com.gestionalePanificio.gestionalePanificio;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderConverter {

    public Order toEntity(OrderDTO orderDTO) {
        Order order = null;
        if (orderDTO != null) {
            order = new Order(orderDTO.getId(),orderDTO.getPane(),orderDTO.getKg(),orderDTO.getTipoOrdine(),orderDTO.getUser());
        }
        return order;
    }


    public OrderDTO toDTO(Order order) {
        OrderDTO orderDTO = null;
        if (order != null) {
            orderDTO = new OrderDTO(order.getId(),order.getPane(),order.getKg(),order.getTipoOrdine(),order.getUser());

        }
        return orderDTO;
    }

    public List<Order> toEntityList (Iterable<OrderDTO> listDTO) {
        List<Order> list = new ArrayList<Order>();

        if(listDTO != null) {
            for (OrderDTO dto:listDTO) {
                Order entity = toEntity(dto);
                list.add(entity);
            }
        }
        return list;
    }

    public List<OrderDTO> toDTOList (Iterable<Order> listEntity) {
        List<OrderDTO> list = new ArrayList<OrderDTO>();

        if(listEntity != null) {
            for (Order entity:listEntity) {
                OrderDTO dto = toDTO(entity);
                list.add(dto);
            }
        }
        return list;
    }


}
