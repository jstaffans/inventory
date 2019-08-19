package com.relex.inventory;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * "The Spoilage Simulator"
 * 
 * The point of this application is to simulate various spoilage algorithms.
 * See the README for more details.
 *
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        System.out.println("Please enter your input as <amount>,<name>[,<amount>,<name>,...]: ");
        String input = scanner.nextLine();
        String[] parts = input.split(",");

        List<Supply> supplies = new ArrayList<>();

        for (int i = 0; i < parts.length; i++) {
            supplies.add(new Supply(Integer.valueOf(parts[i]), parts[i++]));
        }

        Inventory inventory = new Inventory(supplies);

        System.out.println("Your inventory contains a total of " + inventory.getSize() + " items!");

        System.out.println("Spoiling ...");

        for (int i = 0; i < 50; i++) {
            Spoilage1.spoil(inventory);
        }

        System.out.println("After spoilage, your inventory contains a total of " + inventory.getSize() + " items.");
    }
}
