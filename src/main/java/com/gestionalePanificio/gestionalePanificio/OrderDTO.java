package com.gestionalePanificio.gestionalePanificio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
    private long id;
    private Pane pane;
    private double kg;
    private OrderType tipoOrdine;
    private User user;

}
