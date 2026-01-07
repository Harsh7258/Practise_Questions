import java.util.ArrayList;
import java.util.List;

// 3. Give one practical use case for each.
public class QuesA {

    // Using ? extends Number READ only
    static void printSum(List<? extends Number> numbers) {
        double sum = 0;
        for (Number n : numbers) {
            sum += n.doubleValue(); // safe to read
        }
        System.out.println("Sum = " + sum);
    }

    // Using ? super Integer WRITE only
    static void addIntegers(List<? super Integer> list) {
        list.add(10); // safe to add Integer
        list.add(20);
        System.out.println("Integers added");
    }

    public static void main(String[] args) {

        // extends example
        List<Integer> intList = List.of(1, 2, 3);
        printSum(intList);

        // super example
        List<Number> numberList = new ArrayList<>();
        addIntegers(numberList);

        System.out.println(numberList);
    }
}
