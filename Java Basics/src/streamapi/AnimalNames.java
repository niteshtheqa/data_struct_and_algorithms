package streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AnimalNames {

    public static void main(String[] args) {
        // Create a list of animal names
        List<String> animalNames = Arrays.asList("cat", "dog", "horse", "cow", "pig", "chicken", "duck", "sheep",
                "goat", "fish", "elephant", "lion", "tiger", "bear", "monkey", "zebra", "giraffe", "camel", "kangaroo",
                "walrus", "penguin", "squirrel", "rabbit", "mouse", "rat", "snake", "lizard", "crocodile", "turtle",
                "tortoise", "octopus", "squid", "clam", "snail", "starfish", "sea urchin", "jellyfish", "coral",
                "anemone", "seahorse", "dolphin", "whale", "shark", "ray", "crab", "lobster", "shrimp", "crayfish",
                "barnacle", "clam", "mussel", "oyster", "nautilus", "nautilus", "nautilus");

        // Sort the list in ascending order
        animalNames.sort(Collections.reverseOrder(String::compareTo));

        // Print the list of animal names
        for (String animalName : animalNames) {
            System.out.println(animalName);
        }
    }
}