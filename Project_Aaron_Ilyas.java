import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Project_Aaron_Ilyas {
    public static void main(String[] args) throws FileNotFoundException{
        // Path to the text file containing policy information
        String filePath = "PolicyInformation";
        File file = new File(filePath);

        Scanner fileScanner = new Scanner(file);

        // Reading data from the file
        int policyNumber = fileScanner.nextInt();
        fileScanner.nextLine(); // Consume the newline

        String providerName = fileScanner.nextLine();
        String firstName = fileScanner.nextLine();
        String lastName = fileScanner.nextLine();
        int age = fileScanner.nextInt();
        fileScanner.nextLine(); // Consume the newline

        String smokingStatus = fileScanner.nextLine();
        int height = fileScanner.nextInt();
        fileScanner.nextLine(); // Consume the newline

        int weight = fileScanner.nextInt();
        fileScanner.nextLine(); // Consume any potentially trailing newline

        // Creating the Policy object with the read values
        Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);

        // Outputting the policy information
        System.out.println("\nPolicy Number: " + policy.getPolicyNumber());
        System.out.println("Provider Name: " + policy.getProviderName());
        System.out.println("Policyholder’s First Name: " + policy.getPolicyholderFirstName());
        System.out.println("Policyholder’s Last Name: " + policy.getPolicyholderLastName());
        System.out.println("Policyholder’s Age: " + policy.getPolicyholderAge());
        System.out.println("Policyholder’s Smoking Status: " + policy.getPolicyholderSmokingStatus());
        System.out.println("Policyholder’s Height: " + policy.getPolicyholderHeight() + " inches");
        System.out.println("Policyholder’s Weight: " + policy.getPolicyholderWeight() + " pounds");
        System.out.printf("Policyholder’s BMI: %.2f\n", policy.calculateBMI());
        System.out.printf("Policy Price: $%.2f\n", policy.calculatePolicyPrice());

        fileScanner.close();
    }
}
