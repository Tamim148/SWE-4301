package assignment2;

public class StampCoupling {

    public class StampCouplingA {
        private int[] array = {1, 2, 3, 4, 5};
        Student c = new Student();
        someclass b = new someclass();
        public void start() {
            b.callB(array, c);
        }
    }

    public class someclass {
        public void callB(int[] array, Student c ) {
            System.out.println("Array length: " + array.length);
            System.out.println("Name: " + c.getName());
        }
    }

    public class Student {
        private String name = "Tamim";
        public String getName() {
            return name;
        }
    }

}
