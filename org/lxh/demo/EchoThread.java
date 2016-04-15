package org.lxh.demo;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;


/**
 * Created by bingkunyang on 15/12/2.
 */
public class EchoThread  implements Runnable{
    private Socket client = null;

    public EchoThread(Socket client){
        this.client = client;
    }

    @Override
    public void run(){
        boolean flag = true;
        while(flag){
            Scanner clientScan = null;                  //得到用户输入
            try {
                clientScan = new Scanner(client.getInputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (clientScan.hasNext()){                                                  //有数据
                String data = clientScan.next();                                        //取出数据
                if("byebye".equalsIgnoreCase(data)){                                    //退出命令
                    flag = false;                                                       //得到用户输入结束循环
                }
                PrintStream clientPrint = null;
                try {
                    clientPrint = new PrintStream(client.getOutputStream());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                clientPrint.println("ECHO : " + data);                                  //发送数据
            }

        }
        try {
            this.client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
