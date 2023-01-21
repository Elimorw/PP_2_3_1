package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.ServiceCar;

@Controller
@RequestMapping("/cars")
public class CarContriller {
    private  final ServiceCar car;

    @Autowired
    public CarContriller(ServiceCar car) {
        this.car = car;
    }

    @GetMapping()
    public String getCar(@RequestParam(value = "count", defaultValue = "5") int count,
                         ModelMap model) {
        model.addAttribute("car", car.getCarList(count));
        return "cars";
    }
}
