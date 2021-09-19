package www.Ning.Base;
import java.io.FileReader;
import java.io.IOException;

public class demo01 {
        public static void main(String[] args) {
            FileReader fr = null;
            try {
                fr = new FileReader("D:/test.txt"); // 创建FileReader对象
                int i = 0;
                System.out.println("D:\\myJava\\HelloJava.java文件内容如下：");
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
        }
}
