import java.util.Scanner;

public class FootballPlayer {
    public static void main(String[] args){
        String name;
        int age;
        double height;
        double weight;
        int jerseyNumber;
        Scanner playerInput = new Scanner(System.in);
        System.out.print("Enter your name:");
        name = playerInput.nextLine();
        System.out.print("Enter your age:");
        age = playerInput.nextInt();
        System.out.print("Enter your height (in meters):");
        height = playerInput.nextDouble();
        System.out.print("Enter your weight (in pounds):");
        weight = playerInput.nextDouble();
        System.out.print("Enter your jersey number:");
        jerseyNumber = playerInput.nextInt();
        System.out.println();

        System.out.println("Name-" + name);
        System.out.println("Age-" + age);
        System.out.println("Height-" + height + "m");
        System.out.println("Weight-" + weight + "lbs");
        System.out.println("Jersey Number-" + jerseyNumber);
        System.out.println();

        double pound =  0.45359237;
        int meter = 100;

        weight = weight * pound;
        height = height * meter;

        int kilogramWeight = (int) weight;

        System.out.println("Name-" + name);
        System.out.println("Age-" + age);
        System.out.println("Height-" + height + "cm");
        System.out.println("Weight-" + kilogramWeight + "kg");
        System.out.println("Jersey Number-" + jerseyNumber);
        System.out.println();
        System.out.println("Current age:" + age);
        System.out.println("Current jersey number:" + jerseyNumber);
        System.out.println();
        age++;
        jerseyNumber--;

        System.out.println("New age:" + age);
        System.out.println("New jersey number:" + jerseyNumber);

        boolean eligible = (age >= 18 && age <=35 && weight < 90);
        if (eligible){
            System.out.println("Eligible");
        } else {
            System.out.println("Not eligible");
        }

        if (age < 18 || weight > 90) {
            System.out.println("Player has a problem (either too young or overweight)");
        } else {
            System.out.println("No problem");
        }
        if (!(age >= 18 && age <= 35 && weight < 90)) {
            System.out.println("Not eligible");
        }else {
            System.out.println("Eligible");
        }

        if (age < 20) {
            System.out.println("Rising star");
        } else if (age >20 && age < 30) {
            System.out.println("Prime player");
        } else if (age > 30) {
            System.out.println("Veteran");
        }



    }
}
