package assignment2;

public class ControlCoupling {


    public class Instructor {
        public void main(String[] args) {
            Student student = new Student();
            student.grades("A");
        }

    }

    public class Student {

        public void grades(String arg){
            if(arg=="A"){
                System.out.println("He got A");
            } else if (arg=="B") {
                System.out.println("He got B");
            }
        }
    }


    ///Here the Insturctor s controlling the execution flow of Student class, so it's control coupling




}
