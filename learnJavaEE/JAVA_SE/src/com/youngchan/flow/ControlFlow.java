package com.youngchan.flow;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan
 * @date 2022/11/12 20:03
 * @Description // 跳出循环 go  break go  条件语句switch语句 循环语句while语句 do while语句
 */
public class ControlFlow {
  /*  public static void main(String[] args) {
*//*		System.out.println("*****************go  break go 语句 ***************");
		goBreakGo(getScannerNum());
		System.out.println("*****************go  break go 语句 ***************");*//*


*//*		System.out.println("***************** switch语句 ***************");
//		switchTry(getScannerNum());
//		switchTry(getScannerString());
		getDayType(getScannerNum());
		System.out.println("***************** switch语句 ***************");*//*


		*//*System.out.println("***************** while语句 ***************");
		whileTry(getScannerNum());
		System.out.println("***************** while语句 ***************");*//*


		*//*System.out.println("*****************do while语句 ***************");
		doWhileTry(getScannerNum());
		System.out.println("*****************do while语句 ***************");*//*



		*//*System.out.println("***************** 获取随机数集合 ***************");
		List<Integer> numArray = getNumArray(getScannerNum());
		System.out.println("***************** 获取随机数集合 ***************");


		System.out.println("***************** forEach循环 ***************");
		numArray.forEach(System.out::println);
		System.out.println("***************** forEach循环 ***************");
		System.out.println("***************** 增强for循环 ***************");
		for (Integer integer : numArray)
		{
			System.out.println(integer);
		}
		System.out.println("***************** 增强for循环 ***************");
		System.out.println("***************** fori循环 ***************");
		for (int i = 0; i < numArray.size(); i++)
		{
			System.out.println(numArray.get(i));
		}
		System.out.println("***************** fori循环 ***************");*//*
*//*		System.out.println("***************** 循环 ***************");
//		oneToFive();
//		whileTryTwo();
		System.out.println("***************** 循环 ***************");*//*

		*//*System.out.println("***************** if else if  else ***************");
		ifTry(getScannerNum());
		System.out.println("***************** if else if  else ***************");*//*



		*//*System.out.println("***************** 练习题 ***************");
		coursewareOne();
		coursewareTwo();
		System.out.println("***************** 练习题 ***************");*//*
        System.out.println("***************** 循环联系练习题 ***************");
        //		coursewareThree();
        //		coursewareFour();
        coursewareFive();
        System.out.println("***************** 循环联系练习题 ***************");

    }*/

    /**
     * @param
     * @return void
     * @Author youngchan
     * @Description //猜数字游戏
     * @Date 23:02 2022/11/12
     **/
    private static void coursewareFive() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个 1 -100 之间的数字 ");
        Random rd = new Random();
        int num = rd.nextInt(99) + 1;
        System.out.println(num);
        while (true) {
            int guessNum = sc.nextInt();
            if (guessNum == num) {
                System.out.println("恭喜你猜对了！~");
                break;
            } else if (guessNum > num) {
                System.out.println("猜大了 请重新输入");
                continue;
            } else {
                System.out.println("猜小了 请重新输入");
                continue;
            }
        }
    }

    /**
     * @param
     * @return void
     * @Author youngchan
     * @Description //已知2019年是猪年，请在控制台输出从1949年到2019年中所有是猪年的年份。
     * @Date 22:47 2022/11/12
     **/
    private static void coursewareFour() {
        for (int i = 1949; i <= 2019; i++) {
            if ((2019 - i) % 12 == 0) {
                System.out.println(i);
            }
        }
    }

    /**
     * @param
     * @return void
     * @Author youngchan
     * @Description //循环系统 1-7 对应工作日和休息日 输入查看
     * @Date 23:02 2022/11/12
     **/
    private static void coursewareThree() {
        for (; ; ) {
            System.out.println("欢迎光临  1-7 查询 0 退出");
            Integer num = getScannerNum();
            if (num == 0) {
                System.out.println("感谢使用  ");
                return;
            }
            if (num <= 0 || num >= 8) {
                System.out.println("输入有误，请重新输入");
                continue;
            }
            getDayType(num);
        }
    }

    private static void whileTryTwo() {
        double height = 8844430;
        int time = 0;
        double thickness = 0.1;
        while (8844430 >= thickness) {
            time++;
            thickness *= 2;
        }
        System.out.println(time);
    }

    /**
     * @param
     * @return void
     * @Author youngchan
     * @Description //1-5 打印  break continue  100 内偶数和  水仙花数打印   个位立方 +十位立方 + 百位立方 = 数
     * @Date 22:14 2022/11/12
     **/
    private static void oneToFive() {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
            sum += i;
        }
        System.out.println(sum);
        sum = 0;
        for (int i = 5; i >= 1; i--) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
            sum += i;
        }
        System.out.println(sum);
        sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);

/*
		int column = 0 ;
		for(int i=100 ; i<=999 ; i++ ){
			int bits , ten , hundred;
			bits = i%10 ;
			ten =  i%100/10 ;
			hundred = i%1000/100;
			if(bits*bits*bits + ten*ten*ten + hundred*hundred*hundred == i){

				System.out.print("  "+i+"  ");
				column++;
				if(column % 2 == 0 ){
					System.out.println();

				}

				sum+=i;
			}
		}
		System.out.println(sum);*/

    }

    /**
     * @param
     * @return void
     * @Author youngchan
     * @Description //
     * 某银行推出了整存整取定期储蓄业务，其存期分为一年、两年、三年、五年，到期凭存单支取本息。存款年利率表如下：
     * 存期        年利率（%）
     * 一年        2.25
     * 两年        2.7
     * 三年        3.25
     * 五年        3.6
     * 请存入一定金额（1000起存），存一定年限（四选一），计算到期后得到的本息总额。
     * 本息计算方式：本金+本金×年利率×年限
     * @Date 21:35 2022/11/12
     **/
    private static void coursewareTwo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入存入金额");
        double amount = Double.parseDouble(sc.next());
        System.out.println("请输入存入年限");
        int year = sc.nextInt();
        switch (year) {
            case 1:
                System.out.println("收益为" + (amount + amount * 0.0225 * year));
                break;
            case 2:
                System.out.println("收益为" + (amount + amount * 0.027 * year));
                break;
            case 3:
                System.out.println("收益为" + (amount + amount * 0.0325 * year));
                break;
            case 5:
                System.out.println("收益为" + (amount + amount * 0.036 * year));
                break;
            default:
                System.out.println("输入年限不合法");
                break;
        }

        double interestRate = 0;
        if (year == 1) {
            interestRate = 2.25;
        } else if (year == 2) {
            interestRate = 2.7;
        } else if (year == 3) {
            interestRate = 3.25;
        } else if (year == 5) {
            interestRate = 3.6;
        } else {
            System.out.println("输入年限不合法");
            return;
        }
        System.out.println("收益为" + (amount + amount * interestRate * year / 100));
    }

    /**
     * @param
     * @return void
     * @Author youngchan
     * @Description //李雷想买一个价值7988元的新手机，她的旧手机在二手市场能卖1500元，而手机专卖店推出以旧换新的优惠，
     * 把她的旧手机交给店家，新手机就能够打8折优惠。为了更省钱，李雷要不要以旧换新？请在控制台输出。
     * @Date 21:32 2022/11/12
     **/
    private static void coursewareOne() {
        double newPhone = 7988, oldPhone = 1500;
        String result = newPhone * 0.8 > 7988 - 1500 ? "打八折" : "以旧换新";
        System.out.println(result);
    }

    /**
     * @param day 1-7中的数字
     * @return void
     * @Author youngchan
     * @Description //根据输入数字判断是休息日还是工作日
     * @Date 21:27 2022/11/12
     **/
    private static void getDayType(Integer day) {
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日");
                break;
            case 6:
            case 7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("请输入1-7中的数字");
                break;
        }
    }

    /**
     * @param scannerNum
     * @return void
     * @Author youngchan
     * @Description //if else if   else 用法
     * @Date 20:58 2022/11/12
     **/
    private static void ifTry(Integer scannerNum) {
        if (scannerNum > 100 || scannerNum < 0) {
            System.out.println("成绩不合法");
        } else if (scannerNum >= 90) {
            System.out.println("优秀");
        } else if (scannerNum >= 80) {
            System.out.println("良好");
        } else if (scannerNum >= 70) {
            System.out.println("中等");
        } else if (scannerNum >= 60) {
            System.out.println("需要努力");
        } else {
            System.out.println("危险！！");
        }
    }

    /**
     * @param scannerNum
     * @return void
     * @Author youngchan
     * @Description //至少执行一次
     * @Date 20:37 2022/11/12
     **/
    private static void doWhileTry(Integer scannerNum) {
        int i = 0;
        do {
            System.out.println(i++);
        } while (i < scannerNum);
    }

    /**
     * @param scannerNum
     * @return void
     * @Author youngchan
     * @Description //while 用法
     * @Date 20:33 2022/11/12
     **/
    private static void whileTry(Integer scannerNum) {
        int i = 0;
        while (i < scannerNum) {
            System.out.println(i++);
        }
    }

    /**
     * @param scannerNum
     * @return void
     * @Author youngchan
     * @Description //switch 用法
     * @Date 20:33 2022/11/12
     **/
    private static void switchTry(Integer scannerNum) {
        switch (scannerNum) {
            case 1:
                System.out.println("输入的是1 ");
                break;
            case 2:
                System.out.println("输入的是2 ");
                break;
            case 3:
                System.out.println("输入的是3 ");
                break;
            case 4:
                System.out.println("输入的是4 ");
                break;
            case 5:
                System.out.println("输入的是5 ");
                break;
            default:
                System.out.println("输入的不是12345 中的数字");
                break;
        }
    }

    private static void switchTry(String scannerString) {
        switch (scannerString) {
            case "a":
                System.out.println("输入的是a ");
                break;
            case "b":
                System.out.println("输入的是b ");
                break;
            case "aa":
                System.out.println("输入的是aa ");
                break;
            case "bb":
                System.out.println("输入的是bb ");
                break;
            case "ab":
                System.out.println("输入的是ab ");
                break;
            default:
                System.out.println("输入的不是a,b,aa,bb,ab 中的字符");
                break;
        }
    }

    /**
     * @param num 控制台输入的数
     * @return void
     * @Author youngchan
     * @Description //break go 用法
     * @Date 20:18 2022/11/12
     **/
    public static void goBreakGo(Integer num) {

        Go:
        {
            System.out.println("执行go内语句开始");
            for (int i = 0; i < num; i++) {
                if (i == 5) {
                    System.out.println("输入的数大于5");
                    break Go;
                }
            }
            System.out.println("执行go内语句结束");
        }
        System.out.println("执行go语句外语句");

    }

    /**
     * @param
     * @return java.lang.Integer
     * @Author youngchan
     * @Description //在控制台获取一个整数
     * @Date 20:18 2022/11/12
     **/
    public static Integer getScannerNum() {
        System.out.println("请输入一个整数");
        Scanner sc = new Scanner(System.in);
        int userInNum = 0;
        try {
            userInNum = Integer.parseInt(sc.next());
        } catch (NumberFormatException e) {
            System.out.println("请输入数字！");
            return getScannerNum();
        }
        return userInNum;
    }

    public static String getScannerString() {
        System.out.println("请输入一个字符串");
        Scanner sc = new Scanner(System.in);

        return sc.next();
    }

    /**
     * @param size
     * @return java.util.List<java.lang.Integer>
     * @Author youngchan
     * @Description //获取随机数集合   集合大小为控制台输入   集合内子元素 取值范围为 [0,控制台输入) 随机数
     * @Date 20:45 2022/11/12
     **/
    public static List<Integer> getNumArray(Integer size) {
        List<Integer> numArray = new ArrayList<Integer>();
        if (size <= 0) {
            System.out.println("输入的数字必须大于0");
            return getNumArray(getScannerNum());
        }
        for (Integer i = 0; i < size; i++) {
            numArray.add(new Random().nextInt(size));
        }
        return numArray;
    }
}
