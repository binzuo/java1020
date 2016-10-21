package kewai.lianxi.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 2016/10/20 0020.
 */
public class InputStreamTest2 {
    public static void main(String[] args) {
        try (InputStream inputStream=new FileInputStream("e:/test1.txt"))
        {
            //int i;
            //while ((i=inputStream.read())!=-1){
            //    System.out.print((char)i);
            //}
            System.out.println(inputStream.read());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
