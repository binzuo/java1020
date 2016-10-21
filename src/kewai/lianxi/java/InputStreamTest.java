package kewai.lianxi.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 2016/10/20 0020.
 */
public class InputStreamTest {
    public static void main(String[] args) {
        InputStream inputStream=null;
        try {
            inputStream =new FileInputStream("e:/test.txt");
            //int i= inputStream.read();
            //System.out.println(i);
            int i;
            while ((i=inputStream.read()) != -1) {
                System.out.print((char) i);
                //i = inputStream.read();
            }
            //int i1=110;
            //char c=(char) i1;
            //System.out.println(c);
            //char c='n';
            //int i2=(int)c;
            int i3=65;
            char c=(char)i3;
            System.out.println(c);



        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (inputStream!=null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }





}
