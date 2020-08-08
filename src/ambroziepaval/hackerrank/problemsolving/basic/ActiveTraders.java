package ambroziepaval.hackerrank.problemsolving.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ActiveTraders {

    public static List<String> mostActive(List<String> customers) {

        List<String> mostActive = new ArrayList<>();
        HashMap<String, Integer> customerTradeMap = new HashMap<>();
        int tradeCount = 0;

        for (String customer : customers) {
            customerTradeMap.merge(customer, 1, Integer::sum);
            tradeCount++;
        }


        for (Map.Entry<String, Integer> customerTradeEntry : customerTradeMap.entrySet()) {
            double percentage = (double) customerTradeEntry.getValue() * 100 / tradeCount;

            if (percentage >= 5) {
                mostActive.add(customerTradeEntry.getKey());
            }
        }

        mostActive.sort(String::compareTo);
        return mostActive;
    }

    public static void main(String[] args) {

        List<String> customers = new ArrayList<>();
        customers.add("Omega");
        customers.add("Alpha");
        customers.add("Omega");
        customers.add("Alpha");
        customers.add("Omega");
        customers.add("Alpha");
        customers.add("Omega");
        customers.add("Alpha");
        customers.add("Omega");
        customers.add("Alpha");
        customers.add("Omega");
        customers.add("Alpha");
        customers.add("Omega");
        customers.add("Alpha");
        customers.add("Omega");
        customers.add("Alpha");
        customers.add("Omega");
        customers.add("Alpha");
        customers.add("Omega");
        customers.add("Beta");

        System.out.println(ActiveTraders.mostActive(customers));
    }
}
