package Independence;

public class Independentclass {
    public class A{
        int a;
        int b;
        public A(int a,int b){
            this.a=a;
            this.b=b;
        }
    }

    public class B{
        int c;
        int d;
        public B(int c,int d){
            this.c=c;
            this.d=d;
        }
    }


    ///In this Example we can see that there are Two Class "A" & "B".
    ///Both are independent because there are no dependencies or coupling between them.
}
