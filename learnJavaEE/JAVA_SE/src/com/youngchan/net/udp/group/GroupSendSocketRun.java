package com.youngchan.net.udp.group;

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
 * @Description //组播接收  ip：224.0.0.0 —— 239.255.255.255
 */
public class GroupSendSocketRun {
    @Test
    public void runSocket() throws IOException {
        DatagramSocket ds = new DatagramSocket();
        InetAddress address = InetAddress.getByName("255.255.255.255");
        DatagramPacket packet = new DatagramPacket(new byte[1024],1024,address,9999);
        packet.setData("广播发送".getBytes());
        ds.send(packet);
        ds.close();
    }
}
