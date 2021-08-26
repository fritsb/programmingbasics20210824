package nl.streeksoft.novi;

import java.util.*;

public class Main2 {


    public static void main(String[] args) {

        // Scanner object wordt gebruikt om voor en achternaam op te vragen van de gebruiker
        // nextLine gebruik je om een String op te vragen
        Scanner input = new Scanner(System.in);
        System.out.println("Voer voornaam in: ");
        String firstName = input.nextLine();
        System.out.println("Voer achternaam in: ");
        String lastName = input.nextLine();

        if(!firstName.isEmpty() && !lastName.isEmpty() ) {
            System.out.println("Naam is: " + firstName + " " + lastName);
        }
        else {
            System.out.println("Voer nogmaals de gegevens in: ");
            System.out.println("Voer voornaam in: ");
             firstName = input.nextLine();
            System.out.println("Voer achternaam in: ");
             lastName = input.nextLine();

            if(!firstName.isEmpty() && !lastName.isEmpty() ) {
                System.out.println("Naam is: " + firstName + " " + lastName);
            }
        }

        System.out.println("Voer het huisnummer in om op te vragen welke familie daar woont. ");

        // Vragen aan de gebruiker om een getal in te voeren
        // nextInt() gebruik je om een getal in te voeren.
        int houseNo = input.nextInt();
        System.out.println("Het ingevoerde huisnummer is: " + houseNo);
        input.nextLine();
        System.out.println("Voer het subnummer in van het huisnummer: ");
        int houseSubNo = input.nextInt();

        // Aanroepen van eigen methoden. De declaratie van de methode staat onder de main-methode.
        whoLivesHere( houseNo, houseSubNo );
        whoLivesHereSwitch(houseNo, houseSubNo);

    }

    // Declaratie van de whoLivesHere-methode. Hierin wordt een if/else statement toegepast
    public static void whoLivesHere(int houseNumber, int houseSubNumber) {
        if(houseNumber == 1) {
            if(houseSubNumber == 1) {
                System.out.println("Hier woont familie Karelsen");
            }
            else if(houseSubNumber == 2) {
                System.out.println("Hier woont familie Pietjes");
            }
            else {
                System.out.println("Hier woont familie Janssen");
            }
        }
        else if(houseNumber == 3 ) {
            System.out.println("Hier woont familie Schilder.");
        }
        else if(houseNumber == 5) {
            System.out.println("Hier woont familie Smit. ");
        }
        else {
            System.out.println("Dit is geen geldig huisnummer / Hier woont niemand. ");
        }
    }

    // Methode-declaratie van de whoLivesHereSwitch-methode. Hierin wordt een switch toegepast.
    public static void whoLivesHereSwitch(int houseNo, int houseSubNo) {
        switch (houseNo) {
            case 1 -> {
                switch(houseSubNo) {
                    case 1 -> System.out.println("Hier woont familie Karelsen");
                    case 2 -> System.out.println("Hier woont familie Pietjes");
                    default ->  System.out.println("Hier woont familie Janssen");
                }
            }
            case 3 -> System.out.println("Hier woont familie Schilder.");
            case 5 -> System.out.println("Hier woont familie Smit. ");
            default -> System.out.println("Dit is geen geldig huisnummer / Hier woont niemand. ");
        }
    }

}
