// ...existing code...
// Splits a restaurant bill evenly among three diners.
public class Bill3 {
    public static void main(String[] args) {
        // To get you started, here is the first line in the program:
        String name1 = args[0];
        String name2 = args[1];
        String name3 = args[2];
        String billString = args[3];
        int totalBill = Integer.parseInt(billString);
        double portion = totalBill/3.0 ;
        double payAmount = Math.ceil(portion); 
        System.out.println("Dear " + name3 + ", " + name2 + ", and " + name1 + ": pay " + payAmount + " Shekels each");
    }
}