package www.Ning.FirstProgrammingJob;

public class Tools {
    public String del(String str)
    {
        StringBuffer sb = new StringBuffer(str);
        while(sb.indexOf("/*")!=-1){    //保险起见先删除多行注释
            int x = sb.indexOf("/*");
            int y = sb.indexOf("*/");
            sb.delete(x,y+2);
        }
        String target = sb.toString();//再次遍历删除存在的所有注释
        String s = target.replaceAll("\\/\\/[^\\n]*|\\/\\*([^\\*^\\/]*|[\\*^\\/*]*|[^\\**\\/]*)*\\*+\\/", "");
        return s;
    }

}
