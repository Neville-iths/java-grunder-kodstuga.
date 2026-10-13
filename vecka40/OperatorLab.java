public class OperatorLab {
    public static void main(String[] args) {
        //Del 1 – Vad skrivs ut?//

        int a = 10; 
        int b = 3;

        System.out.println(a + b); //13// 
        System.out.println(a - b); //7//
        System.out.println(a * b); //30//
        System.out.println(a / b); //3//
        System.out.println(a % b);//1//

        //Del 2 – Remainder (%)//

        int number = 18;
        System.out.println(number % 2); 

        /*Vad blir resultatet? restvärdet blir 1.

        Vad händer om number ändras till 18? Om talet är 18 blir restvärdet 0.

        Vad kan % 2 användas till? Kan användas för att räkna jämna och udda tal. 
        */
       //Del 3 – Booleanexperiment//

       int age = 20;

       boolean test1 = age > 18; 
       boolean test2 = age < 18; 
       boolean test3 = age == 20; 
       boolean test4 = age != 20;

       System.out.println(test1); 
       System.out.println(test2); 
       System.out.println(test3); 
       System.out.println(test4);

       boolean hasTicket = false; 
       boolean isAdult = true; 
       boolean allowed = hasTicket || isAdult; 
       System.out.println("Has a ticket: " + allowed);
    }

}
