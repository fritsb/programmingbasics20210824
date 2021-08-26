package nl.streeksoft.novi;

public class Main3 {

    public static void main(String[] args) {
/*
// Voorbeeld voor het loopen van het alfabet:

        for(char alphabet = 'A'; alphabet <='z'; alphabet++ )
        {
            System.out.println(alphabet);
        }
*/


// For-loop om te tellen van 0 t/m 10
        for(int counter = 0; counter <= 10; counter++) {
            System.out.println("Waarde van counter: " + counter);
        }

        // Aanmaken van een String verzameling
        int size = 4;
        String[] bakkerStraat = new String[size];
        bakkerStraat[0] = "Familie Bakker";
        bakkerStraat[1] = "Familie Janssen";
        bakkerStraat[2] = "Familie Pietjes";
        bakkerStraat[3] = "Familie Karelsen";

        // Loopen door de String verzameling heen
        // bakkerStraat.length gebruik je om automatisch de lengte op te vragen
        for(int i = 0; i < bakkerStraat.length; i++) {
            System.out.println("In vakje " + i + " zit de waarde: " + bakkerStraat[i]);
        }

    }
}
