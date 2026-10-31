package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide the following information:");
        System.out.println("Full name: ");
        String fullName = scanner.nextLine();

        System.out.println("Billing Street:");
        String billingStreet = scanner.nextLine();

        System.out.println("Billing City:");
        String billingCity = scanner.nextLine();

        System.out.println("Billing State:");
        String billingState = scanner.nextLine();

        System.out.println("Billing Zip:");
        String billingZip = scanner.nextLine();

        System.out.println("Shipping Street:");
        String shippingStreet = scanner.nextLine();

        System.out.println("Shipping City:");
        String shippingCity = scanner.nextLine();

        System.out.println("Shipping State:");
        String shippingState = scanner.nextLine();

        System.out.println("Shipping Zip:");
        String shippingZip = scanner.nextLine();

        StringBuilder name = new StringBuilder();
        name.append(fullName);
        name.append("\nBilling Address:\n");
        name.append(billingStreet);
        name.append("\n");
        name.append(billingCity);
        name.append(", ");
        name.append(billingState);
        name.append(" ");
        name.append(billingZip);
        name.append("\nShipping Address:\n");
        name.append(shippingStreet);
        name.append("\n");
        name.append(shippingCity);
        name.append(", ");
        name.append(shippingState);
        name.append(" ");
        name.append(shippingZip);

        System.out.println(name.toString());





    }
}
