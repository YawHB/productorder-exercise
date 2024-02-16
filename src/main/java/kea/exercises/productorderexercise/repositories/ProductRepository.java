package kea.exercises.productorderexercise.repositories;

import kea.exercises.productorderexercise.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
