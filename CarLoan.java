/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loanaccounthierarchy;

/**
 *
 * @author vrajp
 */
public class CarLoan extends LoanAccount {
    private String vehicleVIN;

    public CarLoan(double principal, double annualInterestRate, int months, String vehicleVIN) {
        super(principal, annualInterestRate, months);
        this.vehicleVIN = vehicleVIN;
    }

        @Override
    public String toString() {
        return "Car Loan with:\n" + super.toString() + String.format("%nVehicle VIN: %s", vehicleVIN);
    }
}
    

