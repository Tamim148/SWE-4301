package assignment2;

public class ContentCoupling {
    public class Instructor {
        public void main(String[] args) {
            Student student = new Student();
            student.age = 20;
        }
    }
    public class Student {
        public int age;
    }
  ////Instructor class directly modifies the data of Student class,so it's Content coupling

}

