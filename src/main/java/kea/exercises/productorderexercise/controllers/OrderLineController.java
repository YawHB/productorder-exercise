package kea.exercises.productorderexercise.controllers;

import kea.exercises.productorderexercise.models.OrderLine;
import kea.exercises.productorderexercise.repositories.OrderLineReposity;
import org.aspectj.weaver.ast.Or;
import org.hibernate.query.Order;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public OrderLine createOrderLine(@RequestBody OrderLine orderLine) {
        return orderLineReposity.save(orderLine);
    }
}
