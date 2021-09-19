package www.Ning.DEMO;

public class Tools {

    public String delete(String str) {
        int index = 0;
        boolean hasElseSign = false;
        char ch ;
        while (str != null) {
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
            }
        }
        return str;
    }

}
