package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
	
	@Autowired
	CalculatorService calculatorService;
	
	@RequestMapping("/calculate")
	public Integer calculate(@RequestParam("value") String value) {
		
		return calculatorService.calculate(value);
	}

}
