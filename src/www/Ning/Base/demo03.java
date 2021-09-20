package www.Ning.Base;

public class demo03 {

    public static void main(String[] args) {
        String str = "";
        StringBuffer sb = new StringBuffer(str);

        while(sb.indexOf("/*")!=-1){
            int x = sb.indexOf("/*");
            int y = sb.indexOf("*/");
            sb.delete(x,y+1);
        }
    }
}
