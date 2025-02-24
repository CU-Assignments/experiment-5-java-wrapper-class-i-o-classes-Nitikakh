import java.util.*;

public class SumUsingWrapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter numbers (separated by space, type 'done' to finish):");
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());  // Autoboxing
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("done")) {
                    break;
                }
            }
        }

        int sum = 0;
        for (Integer num : numbers) {
            sum += num;  // Unboxing
        }

        System.out.println("Sum of numbers: " + sum);
        scanner.close();
    }
}
