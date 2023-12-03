/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hmplane;

/**
 *
 * @author Edi
 */
public class Plane {
    String model;
    String company;
    int seats;

    public Plane(String model, String company, int seats) {
        this.model = model;
        this.company = company;
        this.seats = seats;
    }
    
public void flight(String destination) {
 
    System.out.printf("The flight %s with %s has %f going to %f is about to take off" ,model, company, seats, destination);
    }

}
