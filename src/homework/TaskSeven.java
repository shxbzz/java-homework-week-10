package homework;

import java.util.ArrayList;

import java.util.List;


public class TaskSeven {

    public static void main(String args[]) {


        List<String> undergroundTubeLine = new ArrayList<>();

        undergroundTubeLine.add("Metroplitan Line");

        undergroundTubeLine.add("Bekarloo Line");

        undergroundTubeLine.add("JUbilee Line");

        undergroundTubeLine.add("Picadilly Line");

        undergroundTubeLine.add("Overground");

        undergroundTubeLine.add("Victoria Line");

        undergroundTubeLine.add("Hammersmith and City Line");

        undergroundTubeLine.add("Circle Line");

        undergroundTubeLine.add("Northern Line");

        System.out.println("Original array list: " + undergroundTubeLine);

        System.out.println("Checking the above array list is empty or not! " + undergroundTubeLine.isEmpty());

        undergroundTubeLine.removeAll(undergroundTubeLine);

        System.out.println("Array list after remove all elements " + undergroundTubeLine);

        System.out.println("Checking the above list is empty or not!  " + undergroundTubeLine.isEmpty());

    }

}
