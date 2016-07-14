package hello;

import org.springframework.stereotype.Component;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

@Component
public class CalculatorService {
	public Integer calculate(String value) {
		Expression exp = new ExpressionBuilder(value).build();
		return (int) exp.evaluate();
	}
}
