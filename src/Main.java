public class Main {
    public static void main(String[] args) {
        double balance = 5000;
        double intRate = 0.17;
        double interestDue;

        //one month
        interestDue = balance*intRate;
        System.out.println("Total due after one month: " + interestDue);

        //two months
        interestDue = (interestDue+balance) * intRate;
        System.out.println("Total due after two months: " + interestDue);

    }
}