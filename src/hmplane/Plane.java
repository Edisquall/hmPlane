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
 
    System.out.println("The "+ model +" from the company " + company + " with " + seats +" destination " + destination + " is about to take off");
    }
public Plane() {
    model = "Boieng 747-8";
    company = "KLM";
    seats = 747;
}
}
