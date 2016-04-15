package org.lxh.demo;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by bingkunyang on 15/12/2.
 */
public class EchoServer {
    public static void main(String[] args) throws Exception{
        ServerSocket server = new ServerSocket(9999);
        boolean flag = true;
        while(flag){                                    //不停的接收
            Socket client = server.accept();            //等待客户端连接
            new Thread(new EchoThread(client)).start(); //启动线程
        }
        server.close();
    }
}

