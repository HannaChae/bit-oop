package gradeBook;

import bmi.BmiServiceImpl;
import user.UserDTO;

public class GbController {
	public String result(UserDTO user, GbDTO gb) {
		return String.format("%s님의 총점은 %d, 평균은 %f입니다."
				, user.getName(), new GbServiceImpl().total(gb), new GbServiceImpl().average(gb));	
	}

}
