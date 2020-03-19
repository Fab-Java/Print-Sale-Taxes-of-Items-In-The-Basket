package com.company;

import javax.swing.*;
import java.util.Scanner;

public class PlayTest {
    String name = "Hello Fab";
    Double[] myItems = new Double[3];


    public void display() {
        myItems[0] = 2.4;
        myItems[1] = 21.5;
        myItems[2] = 20.4;


        System.out.print("-----------------------------\n");
        System.out.println(name);
        for (int i = 0; i < myItems.length; i++) {
            System.out.print(myItems[i] + "\t");
        }


    }
}
