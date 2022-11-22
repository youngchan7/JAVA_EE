package com.youngchan.net.udp.radio;

import org.junit.Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.net.udp
 * @date 2022/11/22 20:53
 * @Description //广播接收 同单播
 */
public class RadioGetSocket {
    @Test
    public void clineScoketRun() throws IOException {

        DatagramSocket ds = new DatagramSocket(9999);
        DatagramPacket packet = new DatagramPacket(new byte[1024],1024);
        ds.receive(packet);
        byte[] data = packet.getData();
        System.out.println(new String(data));
        ds.close();
    }
}
