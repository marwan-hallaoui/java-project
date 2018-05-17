package com.nespresso;

public class MyService {

   public MyService(){
       testMock(0);
    }

    public   String testMock(int i){
        if (i==0){
            return  "case 00000";
        }else{
            return  "case DEFZEFEZFZEF";
        }
    }

}