package www.Ning.FirstProgrammingJob;


import java.util.Stack;

public class Grade_three {
    public void OUT3(String str) {
        String[] flag = str.split("else[{]");
        int I_E_NUM = 0;
        int I_E_E_NUM =0;
        int sum = flag.length - 1;
        int i = 0;
        int[] arr;
        arr = new int[sum];
        int j = 0;
        int x = 0;
        StringBuffer sb = new StringBuffer(str);
        int index=-1;
        do{
            index=str.indexOf("else{",index+1);
            if(index!=-1){
                arr[i] = index ;
                i++;
            }
        }while(index!=-1);
        for(i=0;i< arr.length;i++)
        {
            x = sb.lastIndexOf("elseif",arr[i]);
            if(x<0)
            {}
            else{
                if(x < arr[i-1])
                {
                    I_E_NUM++;
                }
            }
        }

        I_E_E_NUM = sum - I_E_NUM;
        System.out.println("if else num:" + I_E_NUM);
        System.out.println("if elseif else num:" + I_E_E_NUM);

    }
}

