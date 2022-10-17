package week1_1;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.println("정수를 입력하고 마지막에 0을 입력하세요");
		int i = 0;
		i = a.nextInt();
		
		int sum = 0;
		int n = 0;
		
		while(i != 0) {
			sum += i;
			n++;
			i = a.nextInt();
		}
		System.out.println("입력한 수의 개수: " +n);
		System.out.println("평균: "+(double)sum/n);
	}

}
