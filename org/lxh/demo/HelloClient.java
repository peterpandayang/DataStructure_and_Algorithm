package org.lxh.demo;

import java.net.Socket;
import java.util.Scanner;

/**
 * Created by bingkunyang on 15/12/2.
 */
public class HelloClient {
    public static void main(String[] args) throws Exception{
        Socket client = new Socket("localhost", 9999);                  //如果可以执行，则表示连接到服务器
        Scanner scan = new Scanner(client.getInputStream());
        scan.useDelimiter("\n");
        if (scan.hasNext()){
            System.out.println(scan.next());
        }
        client.close();
    }
}
