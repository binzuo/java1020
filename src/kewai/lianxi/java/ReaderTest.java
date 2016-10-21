package kewai.lianxi.java;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by Administrator on 2016/10/20 0020.
 */
public class ReaderTest {
    public static void main(String[] args) {
        try (Reader reader=new FileReader("e:/test4.txt"))
        {
            int i=reader.read();

            //while ((i=reader.read())!=-1)
            System.out.print((char) i);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
