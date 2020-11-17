package day01;

import day01.Operator;
import day01.Variable;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Operator op = new Operator();
		
		System.out.println("연산하려는 숫자를 입력하세요.");
		op.setMyNumber1(scanner.nextInt());
		op.setMyNumber2(scanner.nextInt());
		
		
		
		System.out.println(op.getMyNumber1()+" + "+op.getMyNumber2()+" = "
		+(op.getMyNumber1()+op.getMyNumber2()));
		System.out.println(op.getMyNumber1()+" - "+op.getMyNumber2()+" = "
				+(op.getMyNumber1()-op.getMyNumber2()));
		System.out.println(op.getMyNumber1()+" * "+op.getMyNumber2()+" = "
				+(op.getMyNumber1()*op.getMyNumber2()));
		System.out.println(op.getMyNumber1()+" / "+op.getMyNumber2()+" = "
				+(op.getMyNumber1()/op.getMyNumber2()));
		
	
	}
}
