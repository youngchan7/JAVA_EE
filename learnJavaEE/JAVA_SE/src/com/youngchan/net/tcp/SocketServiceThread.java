package com.youngchan.net.tcp;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.net.scket
 * @date 2022/11/21 22:39
 * @Description //TODO
 */
public class SocketServiceThread extends Thread{
    private  Socket accept;

    public SocketServiceThread(Socket accept) {
        this.accept = accept;
    }

    @Override public void run() {
        BufferedOutputStream
            bos = null;
        try {
            BufferedInputStream bis = new BufferedInputStream(accept.getInputStream());
            bos = new BufferedOutputStream(new FileOutputStream("JAVA_SE\\img\\"+  UUID.randomUUID().toString().replace("-", "") +".jpg"));

            byte[] bytes = new byte[1024];
            int length = 0;
            while ( (length =bis.read(bytes))!=-1){
                bos.write(bytes,0,length);
            }

            BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
            bw.write("已成功接收哈哈哈");
            bw.newLine();
            bw.write("!~~~~~~~~");
            bw.flush();
            accept.shutdownOutput();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if(bos!=null)
                bos.close();
                if(accept!=null)
                accept.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
