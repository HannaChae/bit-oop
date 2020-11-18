package viewer;

import java.util.Scanner;

import bmi.*;
import calculator.CalculatorController;
import calculator.CalculatorDTO;
import user.*;
import gradeBook.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CalculatorDTO calculator = new CalculatorDTO();
		CalculatorController calculatorController = new CalculatorController();
		BmiController bmiController = new BmiController();
		BmiDTO bmi = new BmiDTO();
		UserDTO user = new UserDTO();
		GbDTO gb = new GbDTO();
		GbController gbController = new GbController();
		System.out.println("0. 종료 1. 계산기 2. BMI 3. GradeBook");
		switch(scanner.next()){
	case "1":
		System.out.println("계산기 시작");
        System.out.print("숫자1 입력: ");
		calculator.setNum1(scanner.nextInt());		
		System.out.print("연산자(+, -, *, /, %) 입력: ");
		calculator.setOpcode(scanner.next());		
		System.out.print("숫자2 입력: ");
		calculator.setNum2(scanner.nextInt());		
		System.out.println("답: "+calculatorController.execute(calculator));		
		break;
	case "2":
		System.out.println("bmi 계산 시작");		
		System.out.print("이름 입력: ");
		user.setName(scanner.next());		
		System.out.print("몸무게 입력: ");
		bmi.setWeight(scanner.nextDouble());		
		System.out.print("키 입력: ");
		bmi.setHeight(scanner.nextDouble());	
		System.out.println(bmiController.getBmi(user, bmi));
		break;
	case "3":
	    System.out.println("점수 계산 시작");
	    System.out.print("이름 입력: ");
	    user.setName(scanner.next());
	    System.out.print("국어 점수 입력: ");
	    gb.setKorean(scanner.nextInt());
	    System.out.print("영어 점수 입력: ");
	    gb.setEnglish(scanner.nextInt());
	    System.out.print("수학 점수 입력: ");
	    gb.setMath(scanner.nextInt());
	    System.out.println(gbController.result(user, gb));
	case "0":
				System.out.println("시스템 종료");
				break;
		}
		scanner.close();
	}
}
