package day04;

import java.util.Scanner;
import day04.CalculatorDTO;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CalculatorDTO calculator = new CalculatorDTO();
		CalculatorController controller = new CalculatorController();
		// 타입 인스턴스 = new 생성자
		System.out.println("계산기 시작");

		System.out.print("숫자 1 입력: ");
		calculator.setNum1(scanner.nextInt());

		System.out.print("연산자를 입력하세요.(+, -, *, /, %): ");
		calculator.setOpcode(scanner.next());

		System.out.print("숫자 2 입력: ");
		calculator.setNum2(scanner.nextInt());
		
		System.out.println("답: "+controller.control(calculator));
		
		scanner.close();
	}
}
