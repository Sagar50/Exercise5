//Sagar Patel, csci1660, 2/16/2020
package com.company.Patel;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBook {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        ContactInfo person1 =  new ContactInfo("Sagar", "083401@swcsd.us");
        ContactInfo person2 = new ContactInfo("Gaige" , "119770@swcsd.us");
        ContactInfo person3 = new ContactInfo("Tanner" , "11111@swcsd.us");
        ContactInfo person4 = new ContactInfo("Yunis" , "22222@swcsd.us");
        ContactInfo person5 = new ContactInfo("Trenton" , "33333@swcsd.us");

        Map<String, String> collection =  new HashMap<>();
        collection.put(person1.getPersonName(), person1.getPersonEmail());
        collection.put(person2.getPersonName(), person2.getPersonEmail());
        collection.put(person3.getPersonName(), person3.getPersonEmail());
        collection.put(person4.getPersonName(), person4.getPersonEmail());
        collection.put(person5.getPersonName(), person5.getPersonEmail());
        searchFor(collection);
    }
    public static void searchFor(Map<String, String> info){
        System.out.println("Who would you like to search for someone's email? (Enter 'end' to end the program.)");
        String response = input.nextLine();
        while(!response.equalsIgnoreCase("END")) {
            System.out.println("What is the person's name?");
            String name = input.nextLine();
            System.out.println("The email of the person is: " + info.get(name));
            System.out.println("Would you like to continue (enter 'end' to quit).");
            response = input.nextLine();
        }
    }
}
