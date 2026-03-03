abstract class Student {
    abstract void rollno();
}

class Annu extends Student {
    void rollno() {
        System.out.println("CH.SC.U4CSE25004");
    }
}

public class Ex_p3 {
    public static void main(String[] args) {
       Annu a = new Annu();
        a.rollno();
    }
}