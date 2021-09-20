package www.Ning.Base;

public class demo04 {
    public static void main(String[] args) {
        String str="abccbaabcdefghijkabccba";
        int index=-1;
        do{
            index=str.indexOf("a",index+1);
            if(index!=-1){
                System.out.println(index);
            }
        }while(index!=-1);
    }

}
