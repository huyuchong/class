package main;

import overload.Plural;

public class Main {	
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")			//�� Ҳ��֪���������������ֵĶ���
		Plural plural = new Plural();
		
		//int a,b,c,d;
		/*Scanner a =new Scanner(System.in);
		Scanner b =new Scanner(System.in);
		Scanner c =new Scanner(System.in);
		Scanner d =new Scanner(System.in);*/
		//?��ô���밡
		
		System.out.println("����1:-------------------------");  // һ�����
		Plural.talk("5", "4i", "3", "6i", "+");
		Plural.talk("5", "4i", "3", "6i", "-");
		Plural.talk("5", "4i", "3", "6i", "*");
		Plural.talk("5", "4i", "3", "6i", "/");
		
		System.out.println("\n����2:-------------------------"); // ������������
	    Plural.talk("-2","4i", "5", "-8i","+");
	    Plural.talk("-2","4i", "5", "-8i","-");
	    Plural.talk("-2","4i", "5", "-8i","*");
	    Plural.talk("-2","4i", "5", "-8i","/");
	    
	    System.out.println("\n����3:-------------------------"); // ����С������
	    Plural.talk("-1.2","3.1i","4.3","-6.5i","+");
	    Plural.talk("-1.2","3.1i","4.3","-6.5i","-");
	    Plural.talk("-1.2","3.1i","4.3","-6.5i","*");
	    Plural.talk("-1.2","3.1i","4.3","-6.5i","/");
	    
	    System.out.println("\n����4:-------------------------"); // ��������Ϊ0����
	    Plural.talk("5", "4i", "0", "0i", "+");
	    Plural.talk("5", "4i", "0", "0i", "-");
	    Plural.talk("5", "4i", "0", "0i", "*");
	    Plural.talk("5", "4i", "0", "0i", "/");
	
	}
}
