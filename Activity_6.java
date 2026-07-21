public class Activity_6 {
    public static void main(String[] args) {
        // Given Data
        String customerName = "Emman";
        double cap = 299.50;
        double jacket = 1200.75;
        double earphones = 450.25;
        // Computation
        double total = cap + jacket + earphones;
        double vat = total * 0.12;
        double grandTotal = total + vat;
        int wholeTotal = (int) grandTotal;
        // Display
        System.out.println("ONLINE SHOPPING RECEIPT");
        System.out.println();
        System.out.println("Customer : " + customerName);
        System.out.println();
        System.out.println("Cap : " + cap);
        System.out.println("Jacket : " + jacket);
        System.out.println("Earphones : " + earphones);
        System.out.println();
        System.out.println("Subtotal : " + total);
        System.out.println("VAT : " + vat);
        System.out.println("Grand Total : " + grandTotal);
        System.out.println();
        System.out.println("Whole Number : " + wholeTotal);
        System.out.println();
        System.out.println("Free Shipping : " + (total > 1500));
    }
}