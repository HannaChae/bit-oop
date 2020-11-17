package day04;

public class CalculatorService {
	int execute(CalculatorDTO dto) {
		int n1 = dto.getNum1();
		int n2 = dto.getNum2();
		String op = dto.getOpcode();
		int res = 0;
		if (op.equals("+")) {
			res = n1 + n2;
		} else if (op.equals("-")) {
			res = n1 - n2;
		} else if (op.equals("*")) {
			res = n1 * n2;
		} else if (op.equals("/")) {
			res = n1 / n2;
		} else if (op.equals("%")) {
			res = n1 % n2;
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		return res;
	}

}
