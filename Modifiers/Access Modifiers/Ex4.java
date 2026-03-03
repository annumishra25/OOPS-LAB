package Acess_Modifiers;
public class Ex4{
    public static void main(String[] args) {
        student s=new student();
        s.print();
    }
}
class Asec{
    protected String name="Annu mishra";
    
}
class student extends Asec{
    public void print(){
        System.out.println("Name: "+name);
    }
}