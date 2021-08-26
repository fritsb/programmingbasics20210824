package nl.streeksoft.novi;

public class Main {

    public static void main(String[] args) {

        // Voorbeeldcodes van vragen tijdens de les over Edhub opdracht.
        int randomNum1 = 2; // Zelf variabele aangemaakt met waarde toewijzing. Dit gebeurt in de opdracht met Random
        int randomNum2 = 3;
        int randomNum3 = 4;

        int firstInput = 4; // Zelf variabele aangemaakt met waarde toewijzing. Dit gebeurt in de opdracht via Scanner object
        int secondInput = 2;
        int thirdInput = 3; // Student in de les merkte correct op dat 3 variabelen met de waarden 4 ook incorrect wordt goedgekeurd.


        // check if the randoms numbers are equal to the user input numbers
// boolean hasPlayerWon = randomNum1 == firstInput && randomNum2 == secondInput && randomNum3 == thirdInput;

// Code van Hans ter Horst tijdens de les op de chat.
        // Deze code is nog niet compleet, want het product en som moeten ook vergeleken worden.
        boolean isFirstInput = ((firstInput == randomNum1) ||
                (firstInput == randomNum2) ||
                (firstInput == randomNum3));
        boolean isSecondInput = secondInput == randomNum1 || secondInput == randomNum2 || secondInput == randomNum3;
        boolean isThirdInput = thirdInput == randomNum1 || thirdInput == randomNum2 || thirdInput == randomNum3;
// give the user information if it is correct
        if (isFirstInput && isSecondInput && isThirdInput) {
            System.out.println("Congratulations, you WON!");
        } else {
            System.out.println("To bad, you lost. The correct number are " + randomNum1 + ", " + randomNum2 + ", " + randomNum3 + ".");
        }

    }
}
