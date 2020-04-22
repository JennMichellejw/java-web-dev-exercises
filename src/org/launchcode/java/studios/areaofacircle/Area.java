package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        System.out.println("What is the radius of the circle?:");
        Scanner input = new Scanner(System.in);

        while(input.hasNextDouble() == false){
            System.out.println("What is the radius of the circle?:");
            input = new Scanner(System.in);

        };
        double radius = input.nextDouble();
        Double area = Circle.getArea(radius);
        System.out.println(area);





    }

}
