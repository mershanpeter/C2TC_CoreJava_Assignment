package com.mershanpeter.assignment4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading ticket booking details
        System.out.println("Enter booking details (format: stageEvent,customer,noOfSeats):");
        String[] bookingDetails = sc.nextLine().split(",");
        String stageEvent = bookingDetails[0];
        String customer = bookingDetails[1];
        Integer noOfSeats = Integer.parseInt(bookingDetails[2]);

        TicketBooking booking = new TicketBooking(stageEvent, customer, noOfSeats);

        // Payment mode
        System.out.println("Enter payment mode (1.Cash | 2.Wallet | 3.Credit Card):");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        booking.printBookingDetails();

        switch (choice) {
            case 1: // Cash payment
                System.out.println("Enter cash amount:");
                double cashAmount = sc.nextDouble();
                booking.makePayment(cashAmount);
                break;

            case 2: // Wallet payment
                System.out.println("Enter wallet amount:");
                double walletAmount = sc.nextDouble();
                sc.nextLine(); // consume newline
                System.out.println("Enter wallet number:");
                String walletNumber = sc.nextLine();
                booking.makePayment(walletAmount, walletNumber);
                break;

            case 3: // Credit card payment
                System.out.println("Enter card holder name:");
                String holderName = sc.nextLine();

                System.out.println("Enter amount:");
                double ccAmount = sc.nextDouble();
                sc.nextLine();

                System.out.println("Enter credit card type:");
                String ccType = sc.nextLine();

                System.out.println("Enter CCV number:");
                String ccv = sc.nextLine();

                booking.makePayment(holderName, ccAmount, ccType, ccv);
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
