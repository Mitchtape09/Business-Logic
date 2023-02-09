import java.util.ArrayList;

public class CafeUtil {

    // int getStreakGoal()
    public int getStreakGoal() {
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            sum += i;
        }
        System.out.println(sum);
        return sum;
    }

    // double getOrderTotal(double[]prices)
    public double getOrderTotal(double[] lineItems) {

        double sum = 0;
        for (int i = 0; i < lineItems.length; i++) {
            sum += lineItems[i];
        }
        System.out.println(sum);
        return sum;
    }

    // void displayMenu(ArrayList< String >menuItems)
    public void displayMenu(ArrayList<String> menu) {

        for (int i = 0; i < menu.size(); i++) {
            String name = menu.get(i);
            System.out.println(i + " " + name);
            // System.out.println(menu[i]);
        }
    }

    // addCustomer(ArrayList<String> customers)
    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println(String.format("Hello, %s", userName));
        System.out.println(String.format("There are %s people in front of you", customers.size()));
        customers.add(userName);
        System.out.println(customers);
    }

}
