package kea.exercises.productorderexercise.repositories;

import kea.exercises.productorderexercise.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
