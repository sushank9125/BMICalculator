import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight (in kg): ");
        double weight = sc.nextDouble();
        System.out.print("Enter your height (in meters): ");
        double height = sc.nextDouble();
        double bmi = weight / (height * height);
        System.out.printf("Your BMI is: %.2f\n", bmi);
        if (bmi < 18.5) {
            System.out.println("You are Underweight.");
        } else if (bmi < 25) {
            System.out.println("You are Normal weight.");
        } else if (bmi < 30) {
            System.out.println("You are Overweight.");
        } else {
            System.out.println("You are Obese.");
        }

        sc.close();
    }
}
