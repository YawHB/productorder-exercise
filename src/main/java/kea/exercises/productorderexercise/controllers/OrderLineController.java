package kea.exercises.productorderexercise.controllers;

import kea.exercises.productorderexercise.models.OrderLine;
import kea.exercises.productorderexercise.repositories.OrderLineReposity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orderlines")
public class OrderLineController {

    private final OrderLineReposity orderLineReposity;

    public OrderLineController(OrderLineReposity orderLineReposity) {
        this.orderLineReposity = orderLineReposity;
    }

    @GetMapping
    public List<OrderLine> getAllOrderlines() {
       return orderLineReposity.findAll();

    }
}
