package kea.exercises.productorderexercise;

import kea.exercises.productorderexercise.models.Order;
import kea.exercises.productorderexercise.models.OrderLine;
import kea.exercises.productorderexercise.models.Product;
import kea.exercises.productorderexercise.repositories.OrderLineReposity;
import kea.exercises.productorderexercise.repositories.OrderRepository;
import kea.exercises.productorderexercise.repositories.ProductRepository;
import org.antlr.v4.runtime.atn.SemanticContext;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class InitData implements CommandLineRunner {

    //@Autowired
    private final ProductRepository productRepository;

    private final OrderLineReposity orderLineReposity;

    private final OrderRepository orderRepository;


    public InitData(ProductRepository productRepository, OrderLineReposity orderLineReposity, OrderRepository orderRepository) {
        this.productRepository = productRepository;
        this.orderLineReposity = orderLineReposity;
        this.orderRepository = orderRepository;

    }


    //"..." kaldes varargs og bruges i en metode til at modtage et vilkårligt antal argumenter
    public void run(String... args) {
        System.out.println("InitData is running ");


        //**************** PRODUCTS **********************//
        Product smartphone = new Product("iPhone 13", "Højtydende smartphone", 9000, "48457459");
        Product headphones = new Product("Sony WH-1000XM4", "Trådløse støjreducerende hovedtelefoner", 2500, "45495849");
        Product smartwatch = new Product("Apple Watch Series 7", "Smartwatch med avancerede sundhedsfunktioner", 5000, "34985458");
        Product camera = new Product("Sony A7 III", "Professionelt spejlreflekskamera", 15000, "3485858");
        Product tablet = new Product("iPad Pro", "Kraftfuld tablet med Retina-skærm", 8000, "343579349");
        Product gamingConsole = new Product("PlayStation 5", "Next-gen spillekonsol med høj ydeevne", 4500, "548978439");
        Product router = new Product("TP-Link Archer AX6000", "Dual-band Wi-Fi 6 router med avancerede funktioner", 3000, "54843978439");

        productRepository.save(smartphone);
        productRepository.save(headphones);
        productRepository.save(smartwatch);
        productRepository.save(camera);
        productRepository.save(tablet);
        productRepository.save(gamingConsole);
        productRepository.save(router);


        //**************** ORDERLINE **********************//

        OrderLine ol1 = new OrderLine(smartphone, 3);
        //orderLineReposity.save(ol1); Alle orderLineRepositoy.save kald er fjernet da vi bruger Cascade.ALL i Order Entiteten

        OrderLine ol2 = new OrderLine(smartphone, 1);

        OrderLine ol3 = new OrderLine(smartwatch, 4);

        OrderLine ol4 = new OrderLine(camera, 1);

        OrderLine ol5 = new OrderLine(gamingConsole, 7);

        OrderLine ol6 = new OrderLine(gamingConsole, 2);
        OrderLine ol7 = new OrderLine(camera, 1);

        //**************** ORDER **********************//

        Order order1 = new Order(LocalDate.now(), true, List.of( ol1, ol2, ol5) );
        orderRepository.save(order1);

        Order order2 = new Order(LocalDate.now(), false, List.of(ol6, ol7));
        orderRepository.save(order2);


    }

}
