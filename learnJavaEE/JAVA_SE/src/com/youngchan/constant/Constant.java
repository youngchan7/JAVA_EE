package com.youngchan.constant;

import java.util.Scanner;

/**
 * @author admin
 * @version V1.0
 * @Package com.youngchan
 * @date 2022/11/12 12:39
 * @Description // 常量  变量 数据类型 数据类型转换 运算符 ASCII码表 异或 短路 三目
 */
public class Constant
{
	public static void main(String[] args)
	{
		System.out.println("*****************常量***************");
		constantMethod();

		System.out.println("*****************变量***************");
		variableMethod();
		/*		System.out.println(d2);*/
//		scannerTest();
		System.out.println("*****************数据类型转换***************");
		travelType();
		System.out.println("*****************数据类型***************");
		dataType();

		System.out.println("*****************运算符***************");

		operationMethod();

		System.out.println("*****************ascii 码表 ***************");
		ASCIIMethod();
		//		拆分数字
		/*while (true){
			if (scannerTest2())break;
		}
		System.out.println("输入完成");*/

		int tempA = 2;
		tempA *=tempA++;
		System.out.println(tempA);

		System.out.println("***************** 异或使用 ***************");
		exclusiveMethod();

		System.out.println("*****************短路或 || ***************");
		shortCircuitMethod();
		System.out.println("*****************三目运算符 ***************");
		threeOrderOperator();

	}

	private static void threeOrderOperator() {
		boolean h1 = true ;
		boolean h2 = false;
		boolean h31 = 1==1 ? h1 : h2 ;
		boolean h3 = h1 && h2 ? h1 :h2;
		System.out.println(h31);

		int h4 =1 ,h5 =2 ,hMax ;
		hMax = h4>h5? h4:h5;

		System.out.println(hMax);

		double hh1  = 177 ,hh2 =178  ,hh3=177.5  ;
		double hHeighter = (hh1 > hh2 ? hh1 : hh2) > hh3 ? (hh1 > hh2 ? hh1 : hh2) : hh3;
		System.out.println(hHeighter);

		int yxrs = 24 ,yxrs2 = 16 , peanut =8 ,rice =3 ;
		double resultT1 , resultT2;
		resultT1 = yxrs+peanut+rice>30?(yxrs+peanut+rice)*0.8:yxrs+peanut+rice;
		resultT2 = yxrs2+peanut+rice;
		String cheap = resultT1 > resultT2 ? "方式2":"方式1";
		double cheapPrice = resultT1 > resultT2 ? resultT2:resultT1;
		System.out.println(cheap+":"+cheapPrice);
	}

	private static void shortCircuitMethod() {
		int g1 =1 ,g2 = 2 ;
		if(g1==1 || ++g2 != 0 ){
			System.out.println(g1);
			System.out.println(g2);
		}
	}

	private static void exclusiveMethod() {
		System.out.println(false^true);
		System.out.println(false^false);
		System.out.println(true^false);
		System.out.println(true^true);
	}

	private static void ASCIIMethod() {
		byte f1 = 97 ;
		char f2 = (char)f1 ;
		System.out.println(f2);
	}

	private static void operationMethod() {
		System.out.println(10 + 20);
		System.out.println(10 - 20);
		System.out.println(10 * 20);
		System.out.println(10.0 / 3);
		System.out.println(10 % 20);
	}

	private static void dataType() {
		byte age = 28;
		boolean ms = false;
		char sex = '男';
		short age2 = 28;
		int age3 = 28;
		float height = 178.5f;
		long age4 = 29L;
		double height2 = 178.5;

		System.out.println(age);
		System.out.println(ms);
		System.out.println(sex);
		System.out.println(age2);
		System.out.println(age3);
		System.out.println(height);
		System.out.println(age4);
		System.out.println(height2);
	}

	private static void travelType() {
		long a3 = 100L;
		float b3 = a3;
		System.out.println(b3);
		float b4 = 100.6f;
		int a4 = (int) b4;
		System.out.println(a4);
		byte c4 = (byte) 129;
		System.out.println(c4);

		char a5 = 'a';
		System.out.println(a5 - 1);
		byte b5 = 1, c5 = 1;
		byte d5 = (byte) (b5 + c5);
		System.out.println(b5 + c5);
		//		byte e5 = 127 +1;
		String name = "张三";
	}

	private static void variableMethod() {
		int b = 1, c, d = 1;
		int b1 = 1, c1 = 2, d1 = 3;
		float b2 = 1f;
		long c2 = 1L;
		System.out.println(b2);
		System.out.println(c2);

		int d2 = 2;
		if (b == b1)
		{
			d2 = 1;
		}
	}

	private static void constantMethod() {
		// 字符常量
		System.out.println("字符常量");
		// 整型常量
		System.out.println(277);
		System.out.println(100 % 3);
		// 浮点型常量
		System.out.println(12.12);
		System.out.println(100 % 3.0);
		// 字符型常量
		System.out.println('s');
		// 布尔常量
		System.out.println(true);
		System.out.println("ab" == "a" + new StringBuffer("b"));
		System.out.println("ab" == "a" + "b");
		Integer a = null;
		// null 常量
		System.out.println(a);
	}

	/**
	 * @Author youngchan
	 * @Description //控制台输入打印
	 * @Date 15:55 2022/11/12
	 * @param
	 * @return void
	**/
	public static void scannerTest()
	{
		System.out.println("*****************输入***************");
		System.out.println("请输入");
		Scanner sc = new Scanner(System.in);
		String inData = sc.next();
		System.out.println(inData);
	}


	/**
	 * @Author youngchan
	 * @Description //根据输入的数字 按照位上的数字进行拆分
	 * @Date 16:07 2022/11/12
	 * @param		
	 * @return boolean
	**/
	public static boolean scannerTest2()
	{
		System.out.println("*****************输入数字位数***************");
		System.out.println("请输入一个数字");
		Scanner sc = new Scanner(System.in);
		String inData = sc.next();
		Integer numData = 0;
		try
		{
			numData = Integer.parseInt(inData);
		/*	if(numData>999 || numData<100){
				System.out.println("输入错误：请输入一个百位数字！");
				return false;
			}*/
			int digits = 1;
			int tempData = numData;
			while (true){
				if(tempData/10 == 0){
					break;
				}else {
					tempData = tempData/10;
					digits++;
				}
			}
			int num =1 ;
			for (int i = 1; i < digits+1; i++)
			{
				if (i==1){
					System.out.println("第"+i+"位为"+numData%10);
				}else {
					num = 10*num;
					System.out.println("第"+i+"位为"+(numData%(num*10)/num));
				}
			}
			return true;
		} catch (NumberFormatException e)
		{
			System.out.println("输入错误：请输入一个数字!");
			return false;
		}

	/*	System.out.println("百位上的数字为"+numData%1000/100);
		System.out.println("十位上的数字为"+numData%100/10);
		System.out.println("个位上的数字为"+numData%10);
		return  true;*
			 */
	}
}
