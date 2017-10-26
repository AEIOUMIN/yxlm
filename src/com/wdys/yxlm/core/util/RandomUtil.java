package com.wdys.yxlm.core.util;

import java.util.Random;

public class RandomUtil {
	
	public static String randomAccount(){
		String account="412";
		String num11=null;
        Random rand = new Random();
        boolean[] bool = new boolean[6];
        int num = 0;
        for (int i = 0; i <6 ; i++) {
            do {
                // 如果产生的数相同继续循环
                num = rand.nextInt(6);
            } while (bool[num]);
            bool[num] = true;
          num11=  String.valueOf(num);
          account=account+num11;
        }
       
        return account;
	}
		
	
}
