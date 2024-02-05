public class task3 {
    public static void main(String[] args) {
        int creditBalance = 5000;

        double interest = creditBalance * 0.17 * 0.08;

        double interest2 = creditBalance * 0.17 * 0.17;

        System.out.println("The interest after one month is: " + "$" + interest);
        System.out.println("The interest after two months is: " + "$" + interest2);

    }
}
