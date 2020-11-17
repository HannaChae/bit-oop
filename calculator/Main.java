package calculator;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CalculatorDTO dto = new CalculatorDTO();
		
		System.out.println("계산기 시작");
		
		System.out.print("숫자1 입력: ");
		dto.setNum1(scanner.nextInt());
		
		System.out.print("연산자(+, -, *, /, %) 입력: ");
		dto.setOpcode(scanner.next());
		
		System.out.print("숫자2 입력: ");
		dto.setNum2(scanner.nextInt());
		
		if(dto.getOpcode().equals("+")) {
			dto.setResult(dto.getNum1()+dto.getNum2());
			System.out.println("답: "+dto.getResult());
		}else if(dto.getOpcode().equals("-")) {
			dto.setResult(dto.getNum1()-dto.getNum2());
			System.out.println("답: "+dto.getResult());
		}else if(dto.getOpcode().equals("*")) {
			dto.setResult(dto.getNum1()*dto.getNum2());
			System.out.println("답: "+dto.getResult());
		}else if(dto.getOpcode().equals("/")) {
			dto.setResult(dto.getNum1()/dto.getNum2());
			System.out.println("답: "+dto.getResult());			
		}else if(dto.getOpcode().equals("%")) {
			dto.setResult(dto.getNum1()%dto.getNum2());
			System.out.println("답: "+dto.getResult());			
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
}















