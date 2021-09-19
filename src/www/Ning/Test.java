package www.Ning;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;


public class Test {
    public static void main(String[] args) throws IOException
    {
        FileReader fr = new FileReader("D:/test.txt");
        BufferedReader bufferedreader = new BufferedReader(fr);

        FileWriter fw = new FileWriter(new File("D:/test1.txt"));
        BufferedWriter bw = new BufferedWriter(fw);
        char ch;
        String str = "";
        int index;
        boolean hasElseSign = false;
        try{
            while ((str = bufferedreader.readLine().trim()) != null) {
                if (0 != str.length()) {
                    if(hasElseSign == false){//如果没有多行注释
                        for(index = 0;index < str.length();index++){
                            ch = str.charAt(index);
                            if((ch == '/')){
                                if(str.charAt(index+1) == '/'){//是否有单行注释
                                    str = str.substring(0,index);
                                    break;
                                }
                                if(str.charAt(index+1)=='*'){//是否有多行注释
                                    hasElseSign = true;
                                    break;
                                }
                            }
                        }
                        if(hasElseSign) continue;
                    }
                    else{//有多行注释时
                        for(index = 0;index < str.length();index++){
                            ch = str.charAt(index);
                            if((ch == '*')&&(index<str.length()-1)&&(str.charAt(index+1) == '/')){
                                hasElseSign = false;
                                break;
                            }
                        }
                        continue;
                    }
                    bw.write(str);//写入文件 把str存入缓冲
                    bw.newLine();//换行
                    bw.flush();//立即写入 （把缓冲里的所有内容写入）
                    System.out.println(str);//

                }
            }
        }
        catch (Exception ioe){
            ioe.printStackTrace();}
    }
}
