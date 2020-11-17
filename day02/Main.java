package day02;

import day02.BMI;
import day02.GradeBook;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BMI bmi = new BMI();

		System.out.print("몸무게: ");
		bmi.setWeight(scanner.nextInt());
		System.out.print("키: ");
		bmi.setHeight(scanner.nextInt());
	    
		GradeBook gb = new GradeBook();
		System.out.print("id: ");
		gb.setId(scanner.nextInt());
		System.out.print("name: ");
		gb.setName(scanner.next());
		System.out.print("korean: ");
		gb.setKorean(scanner.nextInt());
		System.out.print("english: ");
		gb.setEnglish(scanner.nextInt());
		System.out.print("math: ");
		gb.setMath(scanner.nextInt());
		
		System.out.println("BMI 수치: "
		+(bmi.getWeight() / bmi.getHeight() / bmi.getHeight()));
		
		System.out.println("번호: "+gb.getId()+" 이름: "+gb.getName());
		System.out.println("국어: "+gb.getKorean()+" 영어: "+gb.getEnglish()+" 수학: "+gb.getMath());
		System.out.println("총점: "+(gb.getKorean()+gb.getEnglish()+gb.getMath())+" 평균: "
		+(gb.getKorean()+gb.getEnglish()+gb.getMath())/3);
	
	
	
	
	}
}
