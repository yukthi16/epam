package com.epam.construction;
import java.util.Scanner;
public class construction {
	private final double INTEREST = 0.2;
    private int standard = 0;
    private int area = 0;
    private int duration = 0;
    private int totalCost;

    public construction() {
        this.standard = 0;
        this.area = 0;
        this.duration = 30 * 6;
    }


    public void takeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select Material Standard");
        System.out.println(
                "1. 1200INR if we use standard materials\n" +
                        "2. 1500INR if we use above standard materials\n" +
                        "3. 1800INR if customers needs high standard material\n"
        );
        System.out.println("Choose Your Option: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                standard = 1200;
                break;
            case 2:
                standard = 1500;
                break;
            case 3:
                standard = 1800;
                break;
        }
        System.out.println("Do you want a Fully Automated? (Yes or No)\n");
        if (scanner.nextLine().trim().equalsIgnoreCase("yes")) {
            standard = 2800;
        }
        System.out.println("Enter the Total area of the House (Sq. ft)");
        this.area = scanner.nextInt();
    }

    private double simpleInterest() {
        return (area * standard) * duration * INTEREST;
    }

    private double compoundInterest() {
        return (area * standard) * (Math.pow((1 + INTEREST / 100), duration));
    }

    public void calculateAndDisplayTotalCost() {
        System.out.println("Total Cost After Simple and Compound Interest" + (area * standard) + simpleInterest() + compoundInterest());
    }
}
