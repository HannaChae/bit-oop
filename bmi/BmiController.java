package bmi;

import user.UserDTO;

public class BmiController {
	public String getBmi(UserDTO user, BmiDTO bmi) {
		return String.format("%s님의 BMI 지수는 %f", user.getName(), 
				new BmiServiceImpl().calc(bmi));	
		// BmiService bmiService = new BmiServiceImpl();
		// bmiService.calc(bmi)
	}
}
