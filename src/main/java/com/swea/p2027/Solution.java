package com.swea.p2027;

import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j)
                    System.out.print("#");
                else
                    System.out.print("+");
            }
            System.out.println();
        }

        sc.close();
    }
}
