package com.youngchan.net.udp.single;

import org.junit.Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.net.udp
 * @date 2022/11/22 20:46
 * @Description //单播发送
 *  1. DatagramSocket ds = new DatagramSocket();
 *  2. DatagramPacket packet = new DatagramPacket(new byte[1024],1024,InetAddress.getByName("127.0.0.1"),9999);
 *  3. packet.setData("".getBytes());
 *  4. ds.send(packet);
 *  5. ds.close();
 */
public class SingleSendSocketRun {
    @Test
    public void runSocket() throws IOException {
        DatagramSocket ds = new DatagramSocket();
        DatagramPacket packet = new DatagramPacket(new byte[1024],1024,InetAddress.getByName("127.0.0.1"),9999);
        packet.setData("单播发送".getBytes());
        ds.send(packet);
        ds.close();
    }
}
