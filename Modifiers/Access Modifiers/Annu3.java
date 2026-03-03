package Acess_Modifiers;

public class Annu3 {
   public static void main(String[] args) {
       bank b = new bank();
       System.out.println(b.getAccno());
   }
}

class bank {
   private String accno = "123*********";

   public String getAccno() {
       return accno;
   }
}