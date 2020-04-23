package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = input.nextInt();
        List<Integer> Array = new ArrayList<>();

        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {
            Array.add(input.nextInt());

        }
        List<Integer> Array2 = new ArrayList<>();
        for(int z = 0; z < size; z ++){
            Array2.add(Array.get(z) * 2);

        }


        System.out.print ("Inserted array elements * 2:");
        System.out.println(Array2);
    }
}
