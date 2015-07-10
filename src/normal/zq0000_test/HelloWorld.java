package normal.zq0000_test;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args){
		Scanner inSelection=new Scanner(System.in);
		System.out.println("选择一个数字：1/2/3/4;或者输入'N'关闭程序。");

		String strInSelection;
		do {
			System.out.print("请输入指令：");
			strInSelection=inSelection.next();

		switch (strInSelection) {
		case "1":
			System.out.println("大傻逼");
			break;
		case "2":
			System.out.println("二傻逼");
			break;
		case "3":
			System.out.println("三傻逼");
			break;
		case "4":
			System.out.println("四傻逼");
			break;
		case "n":
			System.out.println("大傻逼再见");
			break;
		case "N":
			System.out.println("小傻逼再见");
			break;

		default:
			System.out.println("傻逼去死");
			break;
			}
		} 
		while (!strInSelection.equals("N")&&!strInSelection.equals("n"));
		System.out.println("结束！");
		inSelection.close();
	}
}
