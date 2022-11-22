package com.youngchan.net.udp.group;

import org.junit.Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.net.udp
 * @date 2022/11/22 20:53
 * @Description //组播接收 ip：224.0.0.0 —— 239.255.255.255 以下两点不同于单播
 * 1.MulticastSocket ms = new MulticastSocket(9999);
 * 2.ms.joinGroup(InetAddress.getByName("225.225.225.225"));
 */
public class GroupGetSocket {
    @Test
    public void clineScoketRun() throws IOException {

        MulticastSocket ms = new MulticastSocket(9999);
        DatagramPacket packet = new DatagramPacket(new byte[1024],1024);
        ms.joinGroup(InetAddress.getByName("225.225.225.225"));
        ms.receive(packet);
        byte[] data = packet.getData();
        System.out.println(new String(data));
        ms.close();
    }
}
