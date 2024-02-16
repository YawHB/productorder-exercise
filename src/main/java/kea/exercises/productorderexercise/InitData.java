package kea.exercises.productorderexercise;

import kea.exercises.productorderexercise.models.Product;
import kea.exercises.productorderexercise.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component

public class InitData implements CommandLineRunner {

    //@Autowired
    private final ProductRepository productRepository;


    public InitData(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


//"..." kaldes varargs og bruges i en metode til at modtage et vilkårligt antal argumenter
    public void run(String ...args) {
        System.out.println("InitData is running ");

        Product smartphone = new Product("iPhone 13", "Højtydende smartphone", 9000, "48457459");
        Product headphones = new Product("Sony WH-1000XM4", "Trådløse støjreducerende hovedtelefoner", 2500, "45495849");
        Product smartwatch = new Product("Apple Watch Series 7", "Smartwatch med avancerede sundhedsfunktioner", 5000, "34985458");
        Product camera = new Product("Sony A7 III", "Professionelt spejlreflekskamera", 15000, "3485858");
        Product tablet = new Product("iPad Pro", "Kraftfuld tablet med Retina-skærm", 8000, "343579349");
        Product gamingConsole = new Product("PlayStation 5", "Next-gen spillekonsol med høj ydeevne", 4500, "548978439") ;
        Product router = new Product("TP-Link Archer AX6000", "Dual-band Wi-Fi 6 router med avancerede funktioner", 3000, "54843978439");

        productRepository.save(smartphone);
        productRepository.save(headphones);
        productRepository.save(smartwatch);
        productRepository.save(camera);
        productRepository.save(tablet);
        productRepository.save(gamingConsole);
        productRepository.save(router);



    }

}
