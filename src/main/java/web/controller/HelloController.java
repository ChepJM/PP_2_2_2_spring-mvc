package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	private final CarService carService;
	@Autowired
	protected HelloController(CarService carService) {
		this.carService = carService;
	}

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("I'm Spring MVC application");
		messages.add("5.2.0 version by sep'19 ");
		model.addAttribute("messages", messages);
		return "index";
	}

	@GetMapping(value = "/cars")
	public String showExactNumberOfCars(@RequestParam(value = "count", required = false, defaultValue = "5") int count, Model model) {
		if (count < 0) {
			count = 5;
		}
		List<Car> carsList = carService.getCarList(count);
		model.addAttribute("carsList", carsList);
		return "cars";
	}
	
}