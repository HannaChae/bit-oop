package day04;

public class CalculatorController {
	int control(CalculatorDTO dto) {
		CalculatorService service = new CalculatorService();
		return service.execute(dto);
	}

}
