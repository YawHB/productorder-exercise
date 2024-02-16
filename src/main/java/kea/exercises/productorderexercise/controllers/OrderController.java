package kea.exercises.productorderexercise.controllers;

import kea.exercises.productorderexercise.models.Order;
import kea.exercises.productorderexercise.repositories.OrderRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderRepository orderRepository;
    public OrderController(OrderRepository orderRepository) {
        this.orderRepository =  orderRepository;

    }

//*************** GET *************************//
    @GetMapping
    public List<Order> getAllOrders() {
       return orderRepository.findAll();
    }

//*************** POST *************************//
    @PostMapping
    public Order createOrder(@RequestBody Order order){
        return orderRepository.save(order);
    }


}
