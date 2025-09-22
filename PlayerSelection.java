// David Acheampong Awuah - Cohort A
import java.util.Scanner;

public class PlayerSelection {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter Player Name:");
            String name = input.nextLine();

            System.out.print("Enter Age:");
            int age = input.nextInt();

            System.out.print("Enter Height (in meters):");
            double height = input.nextDouble();

            System.out.print("Enter Weight (in pounds):");
            double weight = input.nextDouble();

            System.out.print("Enter Jersey Number:");
            int jerseyNumber = input.nextInt();

            double pound =  0.45359237;
            int meter = 100;

            height = height * meter;
            weight = weight * pound;

            int kilogramWeight = (int) weight;

            String category;
            if (age < 20) {
                category = "Rising Star";
            } else if (age <= 30) {
                category = "Prime Player";
            } else {
                category = "Veteran";
            }


            String position;
            switch (jerseyNumber) {
                case 1:
                    position = "Goalkeeper";
                    break;
                case 2:
                case 3:
                    position = "Fullback";
                    break;
                case 4:
                case 5:
                    position = "Defender";
                    break;
                case 6:
                case 8:
                    position = "Midfielder";
                    break;
                case 7:
                case 11:
                    position = "Winger";
                    break;
                case 9:
                    position = "Striker";
                    break;
                case 10:
                    position = "Playmaker";
                    break;
                default:
                    position = "Unknown";
            }


            boolean attacker = (jerseyNumber == 7 || jerseyNumber == 9 ||
                    jerseyNumber == 10 || jerseyNumber == 11);


            boolean eligible = (age >= 18 && age <= 35 && weight < 90);


            String lineupDecision;
            if (category.equals("Prime Player")) {
                if (weight < 80) {
                    lineupDecision = "Starter";
                } else {
                    lineupDecision = "Bench";
                }
            } else {
                lineupDecision = "Bench";
            }
            
            String finalDecision = eligible ? "Play" : "Rest";

            System.out.println("Player Report");

            System.out.println("Player: " + name);
            System.out.println("Age: " + age + " (" + category + ")");
            System.out.println("Height: " + (int) height + " cm");
            System.out.println("Weight: " + kilogramWeight + " kg");
            System.out.println("Jersey: " + jerseyNumber);
            System.out.println("Position: " + position);
            System.out.println("Attacker jersey: " + (attacker ? "Yes" : "No"));
            System.out.println("Eligibility: " + (eligible ? "Eligible" : "Not Eligible"));
            System.out.println("Lineup Decision: " + lineupDecision);
            System.out.println("Final Decision: " + finalDecision);



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
        }
    }

