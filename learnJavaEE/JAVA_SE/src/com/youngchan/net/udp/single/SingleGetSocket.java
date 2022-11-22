package com.youngchan.net.udp.single;

import org.junit.Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.net.udp
 * @date 2022/11/22 20:53
 * @Description //单播/广播接收
 * 1.  DatagramSocket ds = new DatagramSocket(9999);
 * 2. DatagramPacket packet = new DatagramPacket(new byte[1024],1024);
 * 3. ds.receive(packet);
 * 4.  byte[] data = packet.getData();
 * 5 ds.close();
 */
public class SingleGetSocket {
    @Test
    public void serviceScoketRun() throws IOException {

        DatagramSocket ds = new DatagramSocket(9999);
        DatagramPacket packet = new DatagramPacket(new byte[1024],1024);
        ds.receive(packet);
        byte[] data = packet.getData();
        System.out.println(new String(data));
        ds.close();
    }
}
