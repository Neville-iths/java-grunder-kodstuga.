public class StringWorkshop {
    public static void main(String[] args) {
        String firstName = "Anna"; 
        String lastName = "Andersson"; 
        String fullName = firstName + " " + lastName; 
        String city = "Göteborg"; 
        String profession = "Mjukvarutestare";
        /*System.out.println(fullName); 
        System.out.println(fullName.length());*/
        System.out.println("Hej mitt namn är " + fullName + ". Mitt namn innehåller " + fullName.length() + " tecken.\n" + fullName + " Bor i " + city + " och jobbar som " + profession + ".");

    }
}
