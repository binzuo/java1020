package kewai.lianxi.java;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by Administrator on 2016/10/20 0020.
 */
public class WriterTest {
    public static void main(String[] args) {
        try(Writer writer=new FileWriter("e:/test40.txt")){
            writer.write(543);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
