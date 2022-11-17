package assignment2;

public class DataCoupling {

    public class Someintegers  {
        int numberA = 1;
        int numberB = 2;
        int numberC = 3;


    }

    public class Printer {
        public void print(int numberA, int numberB, int numberC) {
            System.out.println("Number A: " + numberA);
            System.out.println("Number B: " + numberB);
            System.out.println("Number C: " + numberC);

        }
    }


}
