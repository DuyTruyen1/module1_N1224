package ss10_arraylist;
import java.util.*;

public class EmployeeManagementOperations {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> employeeNames = new ArrayList<>();
    static ArrayList<Integer> employeeAges = new ArrayList<>();
    static ArrayList<Integer> employeeGenders = new ArrayList<>();
    static ArrayList<Double> employeeSalaries = new ArrayList<>();
    static ArrayList<Double> employeeAvgScores = new ArrayList<>();

    public static void main(String[] args) {

        System.out.print("Enter the number of employees to add: ");
        int employeeCount = scanner.nextInt();

        inputEmployee(employeeCount);
        System.out.println("============ Employee List ============ ");
        for (int i = 0; i < employeeCount; i++) {
            outputEmployee(i);
        }

        int index = findHighestAvgScore(employeeAvgScores);
        System.out.println("==========================================");
        System.out.println("The employee with the highest average score is: ");
        outputEmployee(index);

        System.out.println("==========================================");
        System.out.print("Enter the name of the employee to find: ");
        scanner.nextLine(); // Consume leftover newline
        String name = scanner.nextLine();
        findEmployeeByFullName(name);

        sortByAge();
        System.out.println("==========================================");
        System.out.println("Employee list sorted by age: ");
        for (int i = 0; i < employeeCount; i++) {
            outputEmployee(i);
        }
    }

    public static void inputEmployee(int count) {
        for (int i = 0; i < count; i++) {
            System.out.printf("======== Enter information for employee %d ========\n", i + 1);
            System.out.printf("Enter the name of employee %d: ", i + 1);
            scanner.nextLine(); // Consume leftover newline
            employeeNames.add(scanner.nextLine());

            System.out.printf("Enter the age of employee %d: ", i + 1);
            employeeAges.add(Integer.parseInt(scanner.nextLine()));

            int gender;
            do {
                System.out.printf("Choose the gender of employee %d\n1. Male\n2. Female\n3. Other\nYour choice: ", i + 1);
                gender = Integer.parseInt(scanner.nextLine());
                if (gender < 1 || gender > 3) {
                    System.out.println("Invalid gender, please re-enter!");
                }
            } while (gender < 1 || gender > 3);
            employeeGenders.add(gender);

            System.out.printf("Enter the salary of employee %d: ", i + 1);
            employeeSalaries.add(Double.parseDouble(scanner.nextLine()));

            double avgScore;
            do {
                System.out.printf("Enter the average score of employee %d: ", i + 1);
                avgScore = Double.parseDouble(scanner.nextLine());
                if (avgScore < 0 || avgScore > 10) {
                    System.out.println("Invalid average score, please re-enter!");
                }
            } while (avgScore < 0 || avgScore > 10);
            employeeAvgScores.add(avgScore);
        }
    }

    public static void outputEmployee(int index) {
        System.out.printf("====== Employee %d ======\n", index + 1);
        System.out.println("Name: " + employeeNames.get(index));
        System.out.println("Age: " + employeeAges.get(index));
        System.out.println("Gender: " + (employeeGenders.get(index) == 1 ? "Male" : employeeGenders.get(index) == 2 ? "Female" : "Other"));
        System.out.println("Salary: " + employeeSalaries.get(index));
        System.out.println("Average Score: " + employeeAvgScores.get(index));
    }

    public static int findHighestAvgScore(ArrayList<Double> avgScores) {
        double maxScore = avgScores.get(0);
        int maxIndex = 0;
        for (int i = 1; i < avgScores.size(); i++) {
            if (avgScores.get(i) > maxScore) {
                maxScore = avgScores.get(i);
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void findEmployeeByFullName(String name) {
        for (int i = 0; i < employeeNames.size(); i++) {
            if (employeeNames.get(i).equalsIgnoreCase(name)) {
                outputEmployee(i);
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public static void sortByAge() {
        for (int i = 0; i < employeeAges.size() - 1; i++) {
            for (int j = i + 1; j < employeeAges.size(); j++) {
                if (employeeAges.get(i) > employeeAges.get(j)) {
                    Collections.swap(employeeAges, i, j);
                    Collections.swap(employeeNames, i, j);
                    Collections.swap(employeeGenders, i, j);
                    Collections.swap(employeeSalaries, i, j);
                    Collections.swap(employeeAvgScores, i, j);
                }
            }
        }
    }

}
