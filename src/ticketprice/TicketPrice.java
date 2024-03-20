/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ticketprice;

import java.util.Scanner;

/**
 *
 * @author Amelia ST10439947@vcconnect.edu.za ST10439947
 */
public class TicketPrice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            
            Scanner scanner = new Scanner(System.in);
            String dayOfWeek;
            int myAge;
            double ticketPrice;
            
            ticketPrice = 0;
            
            System.out.println("What is your age? ");
            myAge = scanner.nextInt();
            System.out.println("What day of the week is it? (Enter the day name, e.g., Monday): ");
            dayOfWeek = scanner.next();
          
            if(myAge<= 12 || myAge >= 65) {
                switch (dayOfWeek) {
                    case "monday":
                            ticketPrice = 5;
                            break;
                        case "tuesday":
                            ticketPrice = 5;
                            break;
                        case "wednesday":
                            ticketPrice = 5;
                            break;
                        case "thursday":
                            ticketPrice = 5;
                            break;
                        case "friday":
                            ticketPrice = 5;
                            break;
                        case "saturday":
                            ticketPrice = 10;
                            break;
                        case "sunday":
                            ticketPrice = 10;
                            break;
                    default:
                        System.out.println("Invalid day of the week.");
                    return;
                        }
                }
                else {
                switch (dayOfWeek.toLowerCase()) {
                    case "monday":
                            ticketPrice = 10;
                            break;
                        case "tuesday":
                            ticketPrice = 10;
                            break;
                        case "wednesday":
                            ticketPrice = 10;
                            break;
                        case "thursday":
                            ticketPrice = 10;
                            break;
                        case "friday":
                            ticketPrice = 10;
                            break;
                        case "saturday":
                            ticketPrice = 15;
                            break;
                        case "sunday":
                            ticketPrice = 15;
                            break;
                         default:
                            System.out.println("Invalid day of the week.");
                        return;
                        }
                        
                   
                }
            
            System.out.println("Ticket price is R" + ticketPrice);
            
            scanner.close();
            
    }
    
}
