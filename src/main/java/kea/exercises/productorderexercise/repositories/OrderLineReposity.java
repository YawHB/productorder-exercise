package kea.exercises.productorderexercise.repositories;

import kea.exercises.productorderexercise.models.OrderLine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderLineReposity extends JpaRepository<OrderLine, Integer> {
}
