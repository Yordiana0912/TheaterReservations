package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your Lastname, Firstname ");
        String name = scanner.nextLine();

        System.out.print(" Enter date you are attending(MM-DD-YYYY): ");
        String date = scanner.nextLine();

        System.out.print("How many ticket would you like");
        int ticket = scanner.nextInt();
        DateTimeFormatter formatter;
        formatter = DateTimeFormatter.ofPattern("d MMM yyyy");
                LocalDate finaldate = LocalDate.parse(date, formatter);

        System.out.println(finaldate);




    }
}
