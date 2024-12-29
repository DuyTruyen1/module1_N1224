package ss10_arraylist;
import java.util.*;

public class WorkingWithArraylist {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int elementCount;
        do {
            System.out.print("Enter the number of elements: ");
            elementCount = input.nextInt();
            if (elementCount <= 0) {
                System.out.println("Please enter a positive integer (n > 0).");
            }
        } while (elementCount <= 0);

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < elementCount; i++) {
            System.out.printf("Enter element %d: ", i + 1);
            list.add(input.nextInt());
        }

        System.out.println("List of elements: " + list);

        System.out.println("Number of odd elements: " + countOddNumbers(list));

        System.out.println("Sum of positive odd numbers: " + sumOddNumbers(list));

        System.out.print("Enter value of k: ");
        int k = input.nextInt();

        ArrayList<Integer> positions = findPositions(list, k);

        if (positions.isEmpty()) {
            System.out.println("Element k not found.");
        } else {
            System.out.println("Positions of k: " + positions);
        }

        Collections.sort(list);
        System.out.println("List after sorting in ascending order: " + list);

        Collections.reverse(list);
        System.out.println("List after reversing: " + list);

        System.out.print("Enter the element you want to delete: ");
        int x = input.nextInt();
        list.removeAll(Arrays.asList(x));
        System.out.println("List after deletion: " + list);

        System.out.print("Enter the value you want to insert: ");
        int value = input.nextInt();
        System.out.print("Enter the position where you want to insert: ");
        int position = input.nextInt();
        if (position >= 0 && position <= list.size()) {
            list.add(position, value);
        }
        System.out.println("List after insertion: " + list);

        System.out.println("Maximum value: " + Collections.max(list));

        System.out.println("Minimum value: " + Collections.min(list));

        list.removeAll(Arrays.asList(Collections.max(list)));
        System.out.println("Second largest value: " + list.get(0));
    }

    public static int countOddNumbers(ArrayList<Integer> numbers) {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static int sumOddNumbers(ArrayList<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            if (number > 0 && number % 2 != 0) {
                total += number;
            }
        }
        return total;
    }

    public static ArrayList<Integer> findPositions(ArrayList<Integer> numbers, int target) {
        ArrayList<Integer> positions = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == target) {
                positions.add(i);
            }
        }
        return positions;
    }

}
