import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class QuesA {
    public static void main(String[] args) {
        // List interface allows duplicates and maintains insertion order of Customer
        // IDs
        List<String> customerLog = new ArrayList<>();

        customerLog.add("CUST_001");
        customerLog.add("CUST_002");
        customerLog.add("CUST_001"); // Duplicate allowed
        customerLog.add("CUST_003");

        System.out.print("ArrayList (Order maintained + Duplicates):");
        System.out.print(customerLog); // [CUST_001, CUST_002, CUST_001, CUST_003]

        System.out.println();

        // Set interface dont allow duplicates: LinkedHashSet maintains insertion order
        // of Customer IDs
        Set<String> uniqueCustomers = new LinkedHashSet<>();
        uniqueCustomers.add("CUST_001");
        uniqueCustomers.add("CUST_002");
        uniqueCustomers.add("CUST_001"); // Duplicate ignored
        uniqueCustomers.add("CUST_003");

        System.out.print("LinkedHashSet (Order maintained + Unique):");
        System.out.println(uniqueCustomers); // [CUST_001, CUST_002, CUST_003]
    }
}