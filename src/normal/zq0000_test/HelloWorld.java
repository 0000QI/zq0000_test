package normal.zq0000_test;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args){
		Scanner inSelection=new Scanner(System.in);
		System.out.println("ѡ��һ�����֣�1/2/3/4;��������'N'�رճ���");

		String strInSelection;
		do {
			System.out.print("������ָ�");
			strInSelection=inSelection.next();

		switch (strInSelection) {
		case "1":
			System.out.println("��ɵ��");
			break;
		case "2":
			System.out.println("��ɵ��");
			break;
		case "3":
			System.out.println("��ɵ��");
			break;
		case "4":
			System.out.println("��ɵ��");
			break;
		case "n":
			System.out.println("��ɵ���ټ�");
			break;
		case "N":
			System.out.println("Сɵ���ټ�");
			break;

		default:
			System.out.println("ɵ��ȥ��");
			break;
			}
		} 
		while (!strInSelection.equals("N")&&!strInSelection.equals("n"));
		System.out.println("������");
		inSelection.close();
	}
}
