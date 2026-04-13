/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog5121;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PROG5121 {

    static Scanner input = new Scanner(System.in);

    // check if username contains "_" and max 5 characters
    public static boolean checkUserName(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    // check password complexity
    public static boolean checkPasswordComplexity(String password) {
        String regex = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";
        return Pattern.matches(regex, password);
    }

    // check cellphone number (+27 and 9 digits)
    public static boolean checkCellPhoneNumber(String number) {
        String regex = "^\\+27\\d{9}$";
        return Pattern.matches(regex, number);
    }

    // register the user
    public static String registerUser(String username, String password) {
        if (!checkUserName(username)) {
            return "Username is not correct. Must have _ and max 5 characters";
        }
        if (!checkPasswordComplexity(password)) {
            return "Password is not correct. Must have 8+ characters, number, special character and capital letter";
        }
        return "Username and password successfully captured. User registered";
    }

    // login check
    public static boolean loginUser(String username, String password, String storedUsername, String storedPassword) {
        return username.equals(storedUsername) && password.equals(storedPassword);
    }

    // login message
    public static String returnLoginStatus(boolean status) {
        if (status) {
            return "Login successful! Welcome back kyl_1!";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }

    public static void main(String[] args) {

        String username;
        String password;
        String cellphone;

        // USERNAME LOOP
        while (true) {
            System.out.print("Enter username (must contain '_' and max 5 characters): ");
            username = input.nextLine();

            if (checkUserName(username)) {
                break;
            } else {
                System.out.println("Invalid username");
            }
        }

        // PASSWORD LOOP
        while (true) {
            System.out.print("Enter password (8+ characters, capital letter, special character, number): ");
            password = input.nextLine();

            if (checkPasswordComplexity(password)) {
                break;
            } else {
                System.out.println("Invalid password");
            }
        }

        // REGISTER user
        String registerMessage = registerUser(username, password);
        System.out.println(registerMessage);

        String storedUsername = username;
        String storedPassword = password;

        // CELLPHONE LOOP
        while (true) {
            System.out.print("Enter cellphone number (+27 followed by 9 digits): ");
            cellphone = input.nextLine();

            if (checkCellPhoneNumber(cellphone)) {
                System.out.println("Cellphone number successfully added");
                break;
            } else {
                System.out.println("Invalid number. Example: +27123456789");
            }
        }

        // LOGIN LOOP
        String loginUser;
        String loginPass;
        boolean status;

        while (true) {
            System.out.print("Enter your username");
            loginUser = input.nextLine();

            System.out.print("Enter your password");
            loginPass = input.nextLine();

            status = loginUser(loginUser, loginPass, storedUsername, storedPassword);

            System.out.println(returnLoginStatus(status));

            if (status) break;
        }
    }
}