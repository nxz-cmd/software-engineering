package www.Ning.FirstProgrammingJob;

public class Grade_two {
    public void OUT2(String str){
        StringBuffer sb = new StringBuffer(str);
        String[] flag = str.split("switch");
        int SWITCHSUM = flag.length - 1;
        int aaa = 0;
        int[] arr;
        int i = 0;
        arr = new int[SWITCHSUM];
        int[] casenumarr;
        casenumarr = new int[SWITCHSUM];
        int index=-1;
        do{
            index=str.indexOf("switch",index+1);
            if(index!=-1){
                arr[i] = index ;
                i++;
            }
        }while(index!=-1);


        do{                            //
            index=str.indexOf("switch",index+1);
            if(index!=-1){
                arr[i] = index ;
                i++;
            }
        }while(index!=-1);


        System.out.println("switch num:"+SWITCHSUM);
        System.out.print("case num:");
        for (i=0 ; i< casenumarr.length ; i++)
        {
            System.out.print(casenumarr[i]);
        }
        }
    }
