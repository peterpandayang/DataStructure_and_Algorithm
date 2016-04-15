package org.lxh.demo;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by bingkunyang on 15/12/2.
 */
public class HelloServer {
    public static void main(String[] args) throws Exception{
        ServerSocket server = new ServerSocket(9999);                   //在9999端口上监听操作
        System.out.print("服务器启动...");
        Socket client = server.accept();                                //等待客户端连接
        String data = "Hello World";                                    //这是要输出的数据
        PrintStream out = new PrintStream(client.getOutputStream());    //准备输出
        out.print(data);                                                //直接输出
        out.close();
        client.close();
        server.close();


    }
}

