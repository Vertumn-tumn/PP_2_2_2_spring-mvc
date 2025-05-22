package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.sevice.CarService;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {
    CarService service;

    @Autowired
    public CarController(CarService service) {
        this.service = service;
    }

    @GetMapping
    public String getCars(@RequestParam(name = "count", required = false) Integer count, Model model) {
        List<Car> cars = service.getCars(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
