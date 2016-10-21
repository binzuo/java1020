package kewai.lianxi.java;

import java.io.*;

/**
 * Created by Administrator on 2016/10/20 0020.
 */
public class ReaderAndWriter {
    public static void main(String[] args) {
        try(Reader reader=new FileReader("e:/test4.txt"); Writer writer=new FileWriter("e:/newtest.txt"))
        {
            int i;
            while ((i=reader.read())!=-1){

                writer.write(i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Writer writer=new FileWriter("e:/newtest.txt",true);
            writer.write("南无地藏菩萨摩诃萨");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
