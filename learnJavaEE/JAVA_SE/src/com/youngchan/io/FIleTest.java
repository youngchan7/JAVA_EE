package com.youngchan.io;

import com.youngchan.management.domain.Student;
import jdk.internal.util.xml.impl.Input;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.io
 * @date 2022/11/19 19:20
 * @Description //file
 * fileInputStream FileOutPutString  字节流
 * InputStreamReader  OutputStreamWriter 字符流
 * Buffer    快捷 字符流 字节流
 * InputStreamReader OutPutStreamWrite  转换流  编码格式转换
 *  ObjectInputStream   ObjectOutputStream  序列化流  需要实现Serializable 接口 serialVersionUID
 * Properties   操作 .Properties文件
 */
public class FIleTest {
    public static void main(String[] args) throws IOException {
        //        file 类的基本方法
        //        fileMethod();
        //         递归删除 指定目录
        //        File fileDelete = new File("E:\\blogs");
        //        delFiles(fileDelete);
        //        统计目录下文件个数
        //        File fileCount = new File("E:\\资料");
        //        countFile(fileCount);
        //        文件拷贝
        //                fileCopy();
        //        文本类型文件操作
        //                writeReader();
        //        转换流
        //        inputStreamMethod();
        //        序列化流
        //                ObjectInOut();
        //        properties类使用  操作.properties类使用文件
        //        propertiesMethod();
    }

    private static void inputStreamMethod() throws IOException {
        //        OutputStreamWriter opt = new OutputStreamWriter(new FileOutputStream("D:\\abc.txt"),"UTF-8");
        //        opt.write("只是一个utf-8的文件");
        //        opt.flush();
        //        opt.close();
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\bcd.txt"), "GBK");
        int length = 0;
        char[] chars = new char[1024];
        while ((length = isr.read(chars)) != -1) {
            System.out.println(chars);
        }
        isr.close();
    }

    /**
     * @param null
     * @return
     * @Author youngchan
     * @Description //通过 Properties 类 实现对.properties文件的写入和读取
     * @Date 16:17 2022/11/20
     **/
    private static void propertiesMethod() {
        try {
            //            OutputStream os = new FileOutputStream("properties.properties");
            //            Properties properties = new Properties();
            //            properties.put("userName","youngchan");
            //            properties.put("passWord","123");
            //            properties.store(os,"propertiesTry");
            //            os.close();
            InputStream is = new FileInputStream("properties.properties");
            Properties properties = new Properties();
            properties.load(is);
            System.out.println(properties);
            is.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static void ObjectInOut() {
        try {
            //
       /*     ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.txt"));
            ArrayList<Student> objList= new ArrayList();
            objList.add(new Student("001","",16,"",0,0));
            objList.add(new Student("002","",16,"",0,0));
            objList.add(new Student("003","",16,"",0,0));
            objList.add(new Student("004","",16,"",0,0));
            objList.add(new Student("005","",16,"",0,0));
            objList.add(new Student("006","",16,"",0,0));
            oos.writeObject(objList);
            oos.close();*/
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.txt"));
            ArrayList<Student> o = (ArrayList<Student>)ois.readObject();
            System.out.println(o);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void writeReader() {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            //            注意filewrite会清空源文件数据 所以在同一个文件操作时 应一个完成了一步 再进行另一个一步
            br = new BufferedReader(new FileReader("JAVA_SE\\text.txt"));
            //            bw = new BufferedWriter(new FileWriter("JAVA_SE\\text.txt"));
            //            bw.write("今天天气好晴朗");
            //            bw.newLine();
            //            bw.write("处处好风光！！");
            //            bw.newLine();
            //            bw.flush();
            String content;
            while ((content = br.readLine()) != null) {
                System.out.println(content);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static void fileCopy() {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream("JAVA_SE\\567.jpg"));
            bos = new BufferedOutputStream(new FileOutputStream("JAVA_SE\\678.jpg"));
            int len;
            byte[] bytes = new byte[1024];
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (bis != null) {
                    bis.close();
                }
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static void countFile(File fileCount) {
        File[] fList = fileCount.listFiles();

        List<String> houZui =
            Arrays.stream(fList).map(a -> a.getAbsolutePath()).filter(a -> a.contains(".")).map(a -> a.split("\\.")[1])
                .distinct().collect(Collectors.toList());
        for (String s : houZui) {
            long count = Arrays.stream(fList).map(a -> a.getAbsolutePath()).filter(a -> a.contains("." + s)).count();
            System.out.println(s + "-个数为：" + count);
        }
        System.out.println("文件夹-个数为：" + Arrays.stream(fList).filter(a -> a.isDirectory()).count());
    }

    private static void delFiles(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                f.delete();
            } else {
                delFiles(f);
            }
            //            System.out.println(f.getAbsolutePath());
        }
        //        System.out.println(file.getName());
        file.delete();
    }

    private static void fileMethod() throws IOException {
        File file = new File("JAVA_SE\\src\\com\\youngchan\\io\\test\\test.txt");
        File file2 = new File("JAVA_SE\\src\\com\\youngchan\\io\\test");

        System.out.println(file.createNewFile());
        System.out.println(file.getName());
        System.out.println(file2.mkdir());
        System.out.println(file.isFile());
        System.out.println(file2.isDirectory());
        file.delete();
        file2.delete();
    }
}
