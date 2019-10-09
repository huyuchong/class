package main;

import overload.Plural;

public class Main {	
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")			//咱 也不知道，快速修正出现的东西
		Plural plural = new Plural();
		
		//int a,b,c,d;
		/*Scanner a =new Scanner(System.in);
		Scanner b =new Scanner(System.in);
		Scanner c =new Scanner(System.in);
		Scanner d =new Scanner(System.in);*/
		//?怎么输入啊
		
		System.out.println("测试1:-------------------------");  // 一般测试
		Plural.talk("5", "4i", "3", "6i", "+");
		Plural.talk("5", "4i", "3", "6i", "-");
		Plural.talk("5", "4i", "3", "6i", "*");
		Plural.talk("5", "4i", "3", "6i", "/");
		
		System.out.println("\n测试2:-------------------------"); // 包含负数测试
	    Plural.talk("-2","4i", "5", "-8i","+");
	    Plural.talk("-2","4i", "5", "-8i","-");
	    Plural.talk("-2","4i", "5", "-8i","*");
	    Plural.talk("-2","4i", "5", "-8i","/");
	    
	    System.out.println("\n测试3:-------------------------"); // 包含小数测试
	    Plural.talk("-1.2","3.1i","4.3","-6.5i","+");
	    Plural.talk("-1.2","3.1i","4.3","-6.5i","-");
	    Plural.talk("-1.2","3.1i","4.3","-6.5i","*");
	    Plural.talk("-1.2","3.1i","4.3","-6.5i","/");
	    
	    System.out.println("\n测试4:-------------------------"); // 包含除数为0测试
	    Plural.talk("5", "4i", "0", "0i", "+");
	    Plural.talk("5", "4i", "0", "0i", "-");
	    Plural.talk("5", "4i", "0", "0i", "*");
	    Plural.talk("5", "4i", "0", "0i", "/");
	
	}
}
