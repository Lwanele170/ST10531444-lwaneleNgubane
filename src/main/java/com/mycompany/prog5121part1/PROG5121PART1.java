/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog5121part1;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class PROG5121PART1 {
public static Boolean checkUsername(String username){
     if(username.length()>8 &&username.contains("_")){
    System.out.println("you have successfully");
     }else if (username.length()<8 &&username.contains("_"));
    System.out.println("please enter correct username");
            
    return true;
}
public static Boolean checkPasswordcomplexity(String password){
     System.out.println("password valid"); 
     if(password.length()>8 && Uppercase && Number){
    }else{
        System.out.println("invalid password. password must be 8characters long,contains a number and capital letter. try again");
}

    public static void main(String[] args){;
    Scanner sc= new Scanner(System.in);
    
    //Ask for username
    System.out.println("Enter your username:");
    String username=sc.nextLine();
    if(username.length()>8 &&username.contains("_"));
    System.out.println("you have successfully");
    
    //Ask for password
    System.out.println("enter your password:");
    String password=sc.nextLine();
    if(password.length()>8 &&Uppercase&&Number){
     System.out.println("password valid");
    }else{
        System.out.println("invalid password. password must be 8characters long,contains a number and capital letter. try again");
    }
    }
    
    //Ask for cellphone number
    System.out.println("enter your cellphone number");
    String  cellphoneNumber=sc.nextLine();
    

    
    }

