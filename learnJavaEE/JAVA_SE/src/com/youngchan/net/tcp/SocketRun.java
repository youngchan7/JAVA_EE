package com.youngchan.net.tcp;

import java.io.*;
import java.net.Socket;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.net.scket
 * @date 2022/11/21 21:53
 * @Description //Socket 客户端使用
 * Socket socket = new Socket("127.0.0.1",8888);  socket.getOutputStream();
 *  socket.shutdownOutput();
 */
public class SocketRun {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1",8888);
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("JAVA_SE\\567.jpg"));

            OutputStream outputStream = socket.getOutputStream();
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("JAVA_SE\\img\\123.jpg"));

            byte[] bytes =new byte[1024];
            int lenth = 0 ;
            while ( (lenth =bis.read(bytes))!=-1){
                bos.write(bytes,0,lenth);
            }
            bos.flush();
            socket.shutdownOutput();
            BufferedReader br = new BufferedReader(new InputStreamReader((socket.getInputStream())));
            String message = "";
            while ((message=br.readLine())!=null){
                System.out.println(message);
            }
            bis.close();
            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
