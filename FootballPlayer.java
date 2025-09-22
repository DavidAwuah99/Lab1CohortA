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
        switch (jerseyNumber) {
            case 1:
                System.out.println("Goalkeeper");
                break;
            case 2:
                System.out.println("Fullback");
                break;
            case 3:
                System.out.println("Fullback");
                break;
            case 4:
                System.out.println("Defender");
                break;
            case 5:
                System.out.println("Defender");
                break;
            case 6:
                System.out.println("Midfielder");
                break;
            case 7:
                System.out.println("Winger");
                break;
            case 8:
                System.out.println("Midfielder");
                break;
            case 9:
                System.out.println("Striker");
                break;
            case 10:
                System.out.println("Playmaker");
                break;
            case 11:
                System.out.println("Winger");
                break;
            default:
                System.out.println("Player position not found");
                break;
        }
        switch (jerseyNumber) {
            case 2:
                System.out.println("Fullback");

            case 6:
                System.out.println("Midfielder");

            case 7:
                System.out.println("Winger");

            default:
                System.out.println("Player position not found");

        }
        switch (jerseyNumber) {
            case 1:
                System.out.println("Goalkeeper");
                break;
            case 2:
            case 3:
                System.out.println("Fullback");
                break;
            case 4:
            case 5:
                System.out.println("Defender");
                break;
            case 6:
            case 8:
                System.out.println("Midfielder");
                break;
            case 7:
            case 11:
                System.out.println("Winger");
                break;
            case 9:
                System.out.println("Striker");
                break;
            case 10:
                System.out.println("Playmaker");
                break;

        }

        String category = "Prime Player";

        if (category.equals("Prime Player")) {
            if (weight < 80) {
                System.out.println("Starter");
            }
        } else {
            System.out.println("Bench");
        }



    }
}
