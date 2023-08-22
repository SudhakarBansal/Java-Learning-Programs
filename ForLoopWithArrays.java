package practice_programs;
//Program to retrieve elements of Arrays using for loop

import java.util.*;

class ForLoopWithArrays {
    public static void main(String[] args) {
        String[] states = {"TamilNadu", "Punjab", "UttarPradesh", "Rajasthan"};
        System.out.println("\nState name are :");
        for (String i : states) {
            System.out.print(i + "\t");
        }
        System.out.println();
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Moga");
        cities.add("Thane");
        cities.add("Noida");
        System.out.println("\nCities name are :");
        for (String city : cities) {
            System.out.print(city + "\t");
        }
        System.out.println();
    }
}