package www.Ning.FirstProgrammingJob;

public class Grade_two {
    public void OUT2(String str){
        StringBuffer sb = new StringBuffer(str);
        String[] flag = str.split("switch");
        int SWITCHSUM = flag.length - 1;
        int[] arr;
        int i = 0;
        arr = new int[SWITCHSUM];
        int[] casenumarr;
        casenumarr = new int[SWITCHSUM];
        int[] caseside;
        caseside = new int[30];
        int index=-1;
        do{                       //记录switch的下标
            index=str.indexOf("switch",index+1);
            if(index!=-1){
                arr[i] = index ;
                i++;
            }
        }while(index!=-1);

        int j =0;

        do{                            //记录case的下标
            index=str.indexOf("case",index+1);
            if(index!=-1){

                caseside[j] = index;
                j++;

            }
        }while(index!=-1);

        int z =0;
        int flag1 = 0;

        for (int k = 0; k < caseside.length; k++) {

            if(caseside[k] < arr[flag1+1]){
                z++;
            }
            else
            {
                flag1++;
                z=0;
                k = k-1;
            }
            casenumarr[flag1] = z;
        }

        System.out.println("switch num:"+SWITCHSUM);
        System.out.print("case num:");
        for (i=0 ; i< casenumarr.length ; i++)
        {
            System.out.print(casenumarr[i]);
        }
        }
    }
