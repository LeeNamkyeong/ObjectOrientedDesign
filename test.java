package week1_1;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.println("������ �Է��ϰ� �������� 0�� �Է��ϼ���");
		int i = 0;
		i = a.nextInt();
		
		int sum = 0;
		int n = 0;
		
		while(i != 0) {
			sum += i;
			n++;
			i = a.nextInt();
		}
		System.out.println("�Է��� ���� ����: " +n);
		System.out.println("���: "+(double)sum/n);
	}

}
