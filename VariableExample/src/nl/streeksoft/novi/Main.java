package nl.streeksoft.novi;

public class Main {


     public static void main(String[] args) {

         
         double DoubleValue = 3.6987;
         int IntValue = (int) Math.round(DoubleValue);
         System.out.println(DoubleValue + " is now " + IntValue);


        double myDouble = 9.78d;
         System.out.println("Waarde van de double is: " + myDouble);
         int myInt = (int) myDouble;
         System.out.println("Waarde van de int is: " + myInt);
         int myInt2 = (int)  Math.round(myDouble);
         System.out.println("Waarde van de 2e int is: " + myInt2);


       //int teacherAge = 36;
         /*
        int teacherAge;
        teacherAge = 30;


        teacherAge = teacherAge + 1;
        System.out.println("Leeftijd van de docent is: " + teacherAge + ". ");

        teacherAge++;
        teacherAge--;

        System.out.println("Leeftijd van de docent is: " + teacherAge);

        String name;
        name = "Frits";

        System.out.print("Naam van de docent is: ");
        System.out.print(name);
        name = "Frits Bosschert";

        System.out.print("Naam van de docent is: " + name);

        boolean condition = teacherAge > 35;

        if(condition) { // = if(teacherAge > 35)
            name = name.toUpperCase();
            System.out.print("Nieuwe naam is: "+ name);
        }
        else {
            name = name.toLowerCase();
            System.out.print("Nieuwe naam is: " + name.toLowerCase());
        }

        System.out.println("Naam van de docent is: " + name);

*/
    }
}
