package com.gestionalePanificio.gestionalePanificio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@Entity

@NoArgsConstructor
@AllArgsConstructor

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private Pane pane;

    private double kg;

    private OrderType tipoOrdine;
    @OneToOne
    private User user;

}
