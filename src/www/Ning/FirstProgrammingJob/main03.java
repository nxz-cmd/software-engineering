package www.Ning.FirstProgrammingJob;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class main03 {
    public static void main(String[] args)throws Exception {
        Scanner scan  =  new Scanner(System.in);
        String way = null;
        int level = 0;
        System.out.println("请输入文件需要打开的文件的绝对地址以及完成等级：");
        if(scan.hasNext())
        {
            way = scan.next();
        }
        String CodeStr1 = fileRead(way);//codestr是存储代码的字符串
        Scanner scan1  =  new Scanner(System.in);
        if(scan1.hasNextLine())
        {
            level = scan1.nextInt();//level是存储对应等级的
        }


        Tools tools = new Tools();//利用tools类里的del方法删除所有注释
        String CodeStr = null;
        CodeStr = tools.del(CodeStr1);


        if(level<=0||level>4)//判断输入对应的等级并开始执行操作
        {
            while (true)
            {
                System.out.println("输入错误，请重新输入1~4中的一个数字：");
                if(scan1.hasNextLine())
                {
                    level = scan1.nextInt();//level是存储对应等级的
                }
                if(level>0&&level<5)
                    break;
            }
        }
        else//输入正确对应的完成等级之后输出对应的结果
        {
            int onee = 0;
            if(level == 1)
            {
                Grade_one one = new Grade_one();
                onee = one.OUT1(CodeStr);

            }
            else if(level == 2)
            {
                Grade_two two = new Grade_two();
                two.OUT2(CodeStr);
            }
            else if(level == 3)
            {
                Grade_three three = new Grade_three();
                int ie = three.OUT3(CodeStr);
            }
            else if(level == 4)
            {
                Grade_one one = new Grade_one();
                onee = one.OUT1(CodeStr);
                Grade_two two = new Grade_two();
                two.OUT2(CodeStr);
                Grade_three three = new Grade_three();
                int iee = three.OUT3(CodeStr);
                System.out.println("if-elseif-else num:" + iee);
            }
        }

    }

    public static String fileRead(String strr) throws Exception {
        File file = new File(strr);//定义一个file对象，用来初始化FileReader
        FileReader reader = new FileReader(file);//定义一个fileReader对象，用来初始化BufferedReader
        BufferedReader bReader = new BufferedReader(reader);//new一个BufferedReader对象，将文件内容读取到缓存
        StringBuilder supe = new StringBuilder();//定义一个字符串缓存，将字符串存放缓存中
        String s = "";
        while ((s = bReader.readLine()) != null) {//逐行读取文件内容，不读取换行符和末尾的空格
            supe.append(s + "\n");//将读取的字符串添加换行符后累加存放在缓存中
            //System.out.println(s);
        }
        bReader.close();
        String str = supe.toString();
        return str;
    }
}
