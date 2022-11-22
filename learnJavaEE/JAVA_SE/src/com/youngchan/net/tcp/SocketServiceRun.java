package com.youngchan.net.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.net.scket
 * @date 2022/11/21 21:53
 * @Description //服务器端 循环多线程 UUID使用
 * ServerSocket cline = new ServerSocket(8888)  ;
 *  Socket accept = cline.accept();
 *  UUID.randomUUID().toString().replace("-", ""）
 */
public class SocketServiceRun {
    public static void main(String[] args) {
        try {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5,10,60, TimeUnit.SECONDS,new ArrayBlockingQueue<>(10),
                Executors.defaultThreadFactory(),new ThreadPoolExecutor.DiscardOldestPolicy());
            ServerSocket cline = new ServerSocket(8888)  ;
            while (true){
                Socket accept = cline.accept();
                threadPoolExecutor.submit(new SocketServiceThread(accept));
            }



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
