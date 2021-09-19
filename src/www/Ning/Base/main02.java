package www.Ning.Base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class main02 {

    public static void main(String[] args) {

      int lev = IO();
      System.out.println(lev);

    }
    public static int IO() {
        Scanner scan01 = new Scanner(System.in);
        Scanner scan02 = new Scanner(System.in);
        System.out.println("请输入文件需要打开的文件的绝对地址以及完成等级：");
        String way = null;
        if (scan01.hasNext()) {
            way = scan01.next();
        }
        int level = 0;
        if (scan02.hasNextLine()) {
            level = scan02.nextInt();
        }

        FileReader fr = null;
        try {
            fr = new FileReader(way); // 创建FileReader对象
            int i = 0;
            while ((i = fr.read()) != -1) { // 循环读取
                System.out.print((char) i); // 将读取的内容强制转换为char类型
            }
        } catch (Exception e) {
            System.out.print(e);
        } finally {
            try {
                fr.close(); // 关闭对象
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        scan01.close();
        scan02.close();

        return level;
    }
}
