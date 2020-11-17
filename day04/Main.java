package day04;

import day04.Calculator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Calculator cal = new Calculator();
	
	cal.setNumber1(scanner.nextInt());
	cal.setNumber2(scanner.nextInt());
	
	System.out.println("add: "+add(cal.getNumber1(), cal.getNumber2()));
	}
}
