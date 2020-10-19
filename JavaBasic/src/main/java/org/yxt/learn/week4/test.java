package org.yxt.learn.week4;

import java.util.Random;

public class test {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] data = new int[20][2];
        for(int[] tmp : data){
            tmp[0] = random.nextInt(2000);
            tmp[1] = random.nextInt(2000);
            System.out.println(OverLoadTest.sum(tmp[0], tmp[1]));
        }
    }
}
