package java1104;

import java.util.Scanner;

public class guessnumber {
	int target;
	
	public guessnumber() {
		target = ((int) (Math.random()*100)+1)%100;
	}
	
	public void start() {
		Scanner scr = new Scanner(System.in);
		
		int count= 0;
		
		while(true) {
			System.out.println("请输入您猜的数字");
			System.out.print(">");
			int guess = scr.nextInt();
			count++;
			if(guess < target) {
				System.out.println("猜低了");
			}else if(guess>target) {
				System.out.println("猜高了");
			}else {
				System.out.println("猜对了！您一共猜了"+count+"次！");
				System.out.println("--------------------");
				return;
			}
			System.out.println("--------------------");
		}
	}
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("******************");
			System.out.println("*** 1. 开始游戏 ***");
			System.out.println("*** 2. 退出游戏 ***");
			System.out.println("******************");
			System.out.println("请输入您的选择");
			System.out.print(">");
			int choose = 0;
			Scanner scr = new Scanner(System.in);
			choose = scr.nextInt();
			switch(choose) {
			case 1: new guessnumber().start();	break;
			case 2: System.out.println("退出成功！"); return;
			default: break;
			}
		}
		
	}
}
