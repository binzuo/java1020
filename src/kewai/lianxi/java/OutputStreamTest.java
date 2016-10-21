package kewai.lianxi.java;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by Administrator on 2016/10/21 0021.
 */
public class OutputStreamTest {
    public static void main(String[] args) {


        try {
            try(OutputStream outputStream=new FileOutputStream("e:/test101.txt")){
                outputStream.write('二');
                outputStream.close();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
