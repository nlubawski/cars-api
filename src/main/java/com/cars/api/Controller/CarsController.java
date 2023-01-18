package com.cars.api.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cars.api.dto.CarsDTO;

@RestController
@RequestMapping("/api/cars")
public class CarsController {
  
  @PostMapping
  public void createCars(@RequestBody CarsDTO car){
    System.out.println("O modelo é " + car.modelo());
    System.out.println("e o valor é R$ " + car.valor());
  }
}
