package com.youngchan.array;

import com.youngchan.flow.ControlFlow;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan
 * @date 2022/11/13 14:59
 * @Description //数组 操作  遍历  变量的初始值  地址引用 获取最大值  进制转换 位运算  二位数组 二分法查找有序数组 递归快速排序
 */
public class ArrayReview {
    public static void main(String[] args) {
        System.out.println("*****************定义数组并遍历查看***************");
//                traverseArray();
        System.out.println("*****************初始值查看***************");
//                initialValueViewing();
        System.out.println("*****************赋予变量 地址值 后改变内容***************");
                listAddress();
        System.out.println("*****************获取最大值***************");
        //        getMaxByFor();
        System.out.println("*****************课后习题***************");
//                coursewareOne();
//        System.out.println(coursewareTwo(123, 456, 234));
        System.out.println("*****************进制转换 和位运算  异或运算***************");
//        intoSystem();
        System.out.println("*****************二位数组***************");
//        twoPositionArray();
        System.out.println("*****************二分查找法***************");
//        binarySearchMethod();
        System.out.println("*****************快速排序***************");
//        fastFowMethod();
    }

    private static void fastFowMethod() {
        int[] arr = {6,1,2,7,9,3,4,5,10,8};
        fastFowMethodComplase(arr,0,arr.length-1);
        for (int i : arr) {
            System.out.print(i+",");
        }
    }

    private static void fastFowMethodComplase(int[] arr,int leftPoint,int rightPoint) {
        if(rightPoint<leftPoint){
            return;
        }
        int min = leftPoint;
        int max = rightPoint;
        int temp = arr[leftPoint];
        while (min!=max){
     /*       if(arr[min]>temp && max>min){
                if(arr[max] < temp){
                    if(arr[min]!=arr[max]){
                        arr[min]= arr[min]^ arr[max];
                        arr[max] = arr[min]^ arr[max];
                        arr[min] = arr[min]^ arr[max];
                    }
                }else {
                    max--;
                }
            }else {
                min++;
            }*/
            while (temp<=arr[max] && max>min){
                max--;
            }

            while (temp>=arr[min] && max>min){
                min++;
            }
//            int changeNum =  arr[min];
////            arr[min] =arr[max];
////            arr[max]=changeNum
             if(arr[min]!=arr[max]){
                arr[min]= arr[min]^ arr[max];
                arr[max] = arr[min]^ arr[max];
                arr[min] = arr[min]^ arr[max];
             }
        }
//        int changeNum = arr[max];
//        arr[max] = arr[leftPoint];
//        arr[leftPoint]=changeNum;
        if(arr[leftPoint]!=arr[max]) {
            arr[leftPoint] = arr[leftPoint] ^ arr[max];
            arr[max] = arr[leftPoint] ^ arr[max];
            arr[leftPoint] = arr[leftPoint] ^ arr[max];
        }

        fastFowMethodComplase(arr,leftPoint,max-1);
        fastFowMethodComplase(arr,max+1,rightPoint);
    }

    /**
 * @Author youngchan
 * @Description //有序的数组中快速  找到元素的位置
 * @Date 19:19 2022/11/17
 * @param
 * @return
**/
    private static void binarySearchMethod() {
        int[] iArray = {1,2,3,4,5,8,7,9,10};
//        sorting(iArray);
        int value =6;
//        Integer index =binarySearchIndex(iArray,value);
        Integer index = Arrays.binarySearch(iArray,value);
        System.out.println(index);

    }

    private static void sorting(int[] iArray) {
        for (int i = 0; i < iArray.length; i++) {
            for (int j = iArray.length - 1; j >i; j--) {
                if (iArray[i]<iArray[j]) {
                    iArray[i]=iArray[i]^iArray[j];
                    iArray[j]=iArray[i]^iArray[j];
                    iArray[i]=iArray[i]^iArray[j];
                }
            }
        }
        for (int i : iArray) {
            System.out.println(i);
        }

    }

    private static Integer binarySearchIndex(int[] iArray, int value) {
        int min = 0;
        int max =iArray.length-1;
        while (min<=max){
            int point=(max+min)>>1;
            if(iArray[point]<value){
                min = point+1;
            }else if (iArray[point]>value){
                max = point-1 ;
            }else {
                return point;
            }
        }
        return -1;
    }

    private static void twoPositionArray() {
        int[][] iPArray = new int[3][3];
        System.out.println(iPArray);
        int[][] iPArray2 = {{1,2,3},{2,3,4},{3,4,5},{4,5,6},{5,6,7,8,9}};
        int[][] iPArray3 = {{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
        int sum = 0 ;
        for (int i1= 0 ; i1<iPArray2.length; i1++) {
            for (int i = 0; i < iPArray2[i1].length; i++) {
                sum+=iPArray2[i1][i];
                System.out.println(i1+"-"+i+":"+iPArray2[i1][i]);
            }
        }
        System.out.println(sum);
        sum = 0 ;
        for (int[] ints : iPArray3) {
            for (int anInt : ints) {
                sum+=anInt;
            }
        }
        System.out.println(sum);
    }

    /**
 * @Author youngchan
 * @Description //2,8,16 进制的输入  位运算的乘法  异或运算 （指针的使用）
 * @Date 23:23 2022/11/13
 * @param
 * @return void
**/
    private static void intoSystem() {
        System.out.println("*******************进制转换为10进制打印*****************");
        System.out.println("8————0+:"+0173);
        System.out.println("2————0b+:"+0b1001101);
        System.out.println("16————0x+:"+0x3c);

        System.out.println("*******************左移一位 等同于乘以2   右移一位等同于除以2*****************");
        System.out.println(5<<1);
        System.out.println(5>>1);

        System.out.println("*******************异或运算 两变量交换值   即一个数被异或两遍值不变 *****************");
        int a = 5 , b = 6;
        a= a ^ b;
        b= a ^ b;
        a= a ^ b;
        System.out.println(a+""+b);

        System.out.println("****************** 数组进行翻转 写法1*****************");
        int[] iArray = new int[]{1,2,3,4,5};
        int[] iArray2 = new int[iArray.length];
        for (int i = 0; i < iArray.length; i++) {
            iArray2[iArray.length-1-i] = iArray[i];
        }
        Arrays.stream(iArray2).forEach(System.out::println);
        System.out.println("*******************数组进行翻转 写法2*****************");
        List<Integer> collect = Arrays.stream(iArray).boxed().collect(Collectors.toList());
        Collections.reverse(collect);
        System.out.println("*******************数组进行翻转 写法3*****************");
        String[]  testArray  =  new String[]{"a","b"};
        Collections.reverse(Arrays.stream(testArray).collect(Collectors.toList()));
        Arrays.stream( collect.toArray()).forEach(System.out::println);


        System.out.println("*******************异或运算 + 指针对数组进行翻转 写法1*****************");
        for(int pointOne=0 ;pointOne < iArray.length-1 -pointOne ;pointOne++){
            int pointTwo = iArray.length-1-pointOne;
            iArray[pointOne]  = iArray[pointOne] ^iArray[pointTwo];
            iArray[pointTwo]  = iArray[pointOne] ^iArray[pointTwo];
            iArray[pointOne]  = iArray[pointOne] ^iArray[pointTwo];
        }
        Arrays.stream(iArray).forEach(System.out::println);
        System.out.println("*******************异或运算 + 指针对数组进行翻转 写法2*****************");
        for(int pointOne = 0 , pointTwo = iArray.length-1 ; pointOne<pointTwo ;pointOne++,pointTwo--){
            iArray[pointOne]  = iArray[pointOne] ^iArray[pointTwo];
            iArray[pointTwo]  = iArray[pointOne] ^iArray[pointTwo];
            iArray[pointOne]  = iArray[pointOne] ^iArray[pointTwo];
        }
        Arrays.stream(iArray).forEach(System.out::println);
        System.out.println("*******************异或运算 + 指针对数组进行翻转 写法3*****************");
        int pointOne = 0 , pointTwo = iArray.length-1;
        for(; pointOne<pointTwo ;pointOne++,pointTwo--){
            iArray[pointOne]  = iArray[pointOne] ^iArray[pointTwo];
            iArray[pointTwo]  = iArray[pointOne] ^iArray[pointTwo];
            iArray[pointOne]  = iArray[pointOne] ^iArray[pointTwo];
        }
        Arrays.stream(iArray).forEach(System.out::println);



    }

    private static Integer coursewareTwo(int one ,int two ,int three) {
       one = one>two?one:two;
       one = one>three?one:three;
       return one;
    }

    private static void coursewareOne() {
        double[] dArray = new double[] {12.9, 53.54, 75.0, 99.1, 3.14};
        OptionalDouble min = Arrays.stream(dArray).min();
        System.out.println(min.getAsDouble());
        double minValue = dArray[0];
        for (double dValue : dArray) {
            minValue = minValue < dValue ? minValue : dValue;
        }
        System.out.println(minValue);

        double[] dArray2 = new double[] {10.4, -3, -6.2, 1.2, -6.1, -19, -3.8, 0.9, -4.5, 5.5};
        long makeMoney = Arrays.stream(dArray2).filter(a -> a > 0).count();
        long loseMoney = Arrays.stream(dArray2).filter(a -> a < 0).count();
        System.out.println("赚钱：" + makeMoney);
        System.out.println("赔钱：" + loseMoney);

    }

    private static void getMaxByForm() {
        Random rd = new Random();
        Integer[] iArray = new Integer[6];
        for (int i = 0; i < iArray.length; i++) {
            iArray[i] = rd.nextInt(100);
            System.out.print("  " + iArray[i]);
        }
        System.out.println();
        //        获取最大值
        //        Optional<Integer> max = Arrays.stream(iArray).max((a, b) -> a-b );
        //        System.out.println(max.get());
        //        过滤
        //        Arrays.stream(iArray).filter((a)->a>50).collect(Collectors.toList()).forEach(System.out::println);
        //        排序
//                Arrays.stream(iArray).sorted((a,b)->a-b).forEach((System.out::println));  a-b 升序
        //        求和
        //        Optional<Integer> reduce = Arrays.stream(iArray).reduce((a, b) -> Integer.sum(a, b));
        //        System.out.println(reduce.get());
        //        获取最大值
//        Optional<Integer> reduce = Arrays.stream(iArray).reduce((a, b) -> Integer.sum(a, b));
//        System.out.println("平均分为：" + (reduce.get() - maxNum - minNum) / 4.0);
        int maxNum = iArray[0];
        int minNum = iArray[0];
        for (int i = 1; i < iArray.length; i++) {
            maxNum = maxNum > iArray[i] ? maxNum : iArray[i];
            minNum = minNum < iArray[i] ? minNum : iArray[i];
        }
        System.out.println(maxNum);
        System.out.println(minNum);
        System.out.println(1 + 6 >>> 2);
        int i = Arrays.binarySearch(iArray, maxNum);
        System.out.println(i);

    }

    private static void listAddress() {
        List<String> listOne = new ArrayList<String>();
        listOne.add("aaa");
        listOne.add("bbb");
        List<String> listTwo = new ArrayList<String>();
        listTwo = listOne;
        listTwo.remove("aaa");
        System.out.println("-------------------------");
        listOne.add("张三");
        listOne.add("张三");
        listOne.add("张三");
        listOne.add("李四");
        listOne.add("王五");
        listOne.add("赵六");
        listOne.add("孙七");
        for (int i = 0; i < listOne.size(); i++) {
            if(listOne.get(i).equals("张三")){
                listOne.remove(i);
                i--;
            }
        }
      /*  while (true){
            if (!listOne.remove("张三")) {
                break;
            }
        }*/
        System.out.println(listOne);
        System.out.println(listTwo);
        System.out.println("-------------------------");
    }

    private static void initialValueViewing() {
        Object[] oArray = new Object[2];

        System.out.println(oArray);
        System.out.println(oArray[1]);
        String[] sArray = new String[2];
        System.out.println(sArray);
        System.out.println(sArray[0]);
        int[] iArray = new int[5];
        System.out.println(iArray);
        System.out.println(iArray[3]);
        boolean[] bArray = new boolean[3];
        System.out.println(bArray);
        System.out.println(bArray[1]);
        char[] cArray = new char[3];
        System.out.println(cArray);
        System.out.println(cArray[1]);
        double[] dArray = new double[6];
        System.out.println(dArray);
        System.out.println(dArray[5]);
    }

    private static void traverseArray() {
        Integer type = ControlFlow.getScannerNum();
        Integer length = ControlFlow.getScannerNum();
        Object[] oArray = new Object[length];
        switch (type) {
            case 1:
                oArray = defineArray(length, 1);
                break;
            case 2:
                oArray = defineArray(length, "true");
                break;
            case 3:
                oArray = defineArray(length, 'a');
                break;
            case 4:
                oArray = defineArray(length, true);
                break;
            case 5:
                oArray = defineArray(length, 1.0);
                break;
            default:
                oArray = defineArray(length, new int[1]);
                break;
        }
        if (type <= 5) {
            for (int i = 0; i < oArray.length; i++) {
                System.out.println(oArray[i]);
            }
        } else {
       /*    for (Object o : oArray) {
               System.out.println(o);
           }*/

            for (int i = 0; i < oArray.length; i++) {
                Object[] oArrArr = (Object[])oArray[i];
                for (Object o : oArrArr) {
                    System.out.println(o);
                }
            }
        }

    }

    private static Integer[] defineArray(Integer lenth, Integer a) {
        Integer[] oArray = new Integer[lenth];
        for (Integer i = 0; i < lenth; i++) {
            oArray[i] = i;
        }
        return oArray;
    }

    private static Double[] defineArray(Integer lenth, Double a) {
        Double[] oArray = new Double[lenth];
        for (Integer i = 0; i < lenth; i++) {
            oArray[i] = i + 0.5;
        }
        return oArray;
    }

    private static Character[] defineArray(Integer lenth, Character a) {
        Character[] oArray = new Character[lenth];
        for (int i = 0; i < lenth; i++) {
            oArray[i] = (char)(i + 97);
        }
        return oArray;
    }

    private static Boolean[] defineArray(Integer lenth, boolean a) {
        Boolean[] oArray = new Boolean[lenth];
        boolean bOne = true;
        for (Integer i = 0; i < lenth; i++) {
            bOne = !bOne;
            oArray[i] = bOne;
        }
        return oArray;
    }

    private static String[] defineArray(Integer lenth, String a) {
        String[] oArray = new String[lenth];
        for (int i = 0; i < lenth; i++) {
            oArray[i] = "a" + i;
        }
        return oArray;
    }

    private static Object[] defineArray(Integer lenth, Object a) {
        Object[] oArray = new Object[5];
        Object[] intArray = new Object[] {1, 2, 3, 4, 5};
        Object[] charArray = new Object[] {'a', 'b', 'c', 'd', 'e'};
        Object[] stringArray = new Object[] {"a1", "a2", "a3", "a4", "a5"};
        oArray[0] = intArray;
        oArray[1] = charArray;
        oArray[2] = intArray;
        oArray[3] = stringArray;
        oArray[4] = stringArray;

        return oArray;
    }
}
