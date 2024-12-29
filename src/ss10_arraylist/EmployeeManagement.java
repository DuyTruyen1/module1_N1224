package ss10_arraylist;
import java.util.ArrayList;
import java.util.Scanner;
public class EmployeeManagement {
    static Scanner inputScanner = new Scanner(System.in);
    static ArrayList<String> employeeNames = new ArrayList<>();
    static ArrayList<Integer> employeeAges = new ArrayList<>();
    static ArrayList<Integer> employeeGenders = new ArrayList<>();
    static ArrayList<Double> employeeSalaries = new ArrayList<>();
    static ArrayList<Double> employeeAvgScores = new ArrayList<>();

    public static void main(String[] args) {
        System.out.print("Enter the number of employees to add: ");
        int totalEmployees = Integer.parseInt(inputScanner.nextLine());

        inputDetails(employeeNames, employeeAges, employeeGenders, employeeSalaries, employeeAvgScores, totalEmployees);
        displayDetails(employeeNames, employeeAges, employeeGenders, employeeSalaries, employeeAvgScores);
    }

    public static void inputDetails(ArrayList<String> employeeNames, ArrayList<Integer> employeeAges, ArrayList<Integer> employeeGenders, ArrayList<Double> employeeSalaries, ArrayList<Double> employeeAvgScores, int totalEmployees) {
        for (int i = 0; i < totalEmployees; i++) {
            System.out.printf("======== Enter details for employee %d ======== ", i + 1);
            System.out.printf("\nEnter the name of employee %d: ", i + 1);
            employeeNames.add(inputScanner.nextLine());

            System.out.printf("Enter the age of employee %d: ", i + 1);
            employeeAges.add(Integer.parseInt(inputScanner.nextLine()));

            int gender;
            do {
                System.out.printf("Select the gender of employee %d \n1. Male\n2. Female\n3. Other \nYour choice: ", i + 1);
                gender = Integer.parseInt(inputScanner.nextLine());
                if (gender > 3 || gender < 1) {
                    System.out.println("Invalid gender selection, please try again!");
                }
            } while (gender > 3 || gender < 1);
            employeeGenders.add(gender);

            System.out.printf("Enter the salary of employee %d: ", i + 1);
            employeeSalaries.add(Double.parseDouble(inputScanner.nextLine()));

            double averageScore;
            do {
                System.out.printf("Enter the average score of employee %d: ", i + 1);
                averageScore = Double.parseDouble(inputScanner.nextLine());
                if (averageScore < 0 || averageScore > 10) {
                    System.out.println("Invalid average score, please try again!");
                }
            } while (averageScore < 0 || averageScore > 10);
            employeeAvgScores.add(averageScore);
        }
    }

    public static void displayDetails(ArrayList<String> employeeNames, ArrayList<Integer> employeeAges, ArrayList<Integer> employeeGenders, ArrayList<Double> employeeSalaries, ArrayList<Double> employeeAvgScores) {
        System.out.println("============ Employee List ============ ");
        for (int i = 0; i < employeeNames.size(); i++) {
            System.out.printf("====== Employee %d ======", i + 1);
            System.out.println("\nName: " + employeeNames.get(i));
            System.out.println("Age: " + employeeAges.get(i));
            System.out.println("Gender: " + (employeeGenders.get(i) == 1 ? "Male" : employeeGenders.get(i) == 2 ? "Female" : "Other"));
            System.out.println("Salary: " + employeeSalaries.get(i));
            System.out.println("Average Score: " + employeeAvgScores.get(i));
        }
    }

}
