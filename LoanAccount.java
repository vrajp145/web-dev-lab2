/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loanaccounthierarchy;

/**
 *
 * @author vrajp
 */
public class LoanAccount {
    private double principal;
    private double annualInterestRate;
    private int months;

    public LoanAccount(double principal, double annualInterestRate, int months) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate / 100; // Convert annual interest rate to decimal
        this.months = months;
    }
        
    public double getPrinciple() {
        return principal;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int getMonths() {
        return months;
    }

    public double calculateMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 12;
        double monthlyPayment = (principal * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -months));
        return monthlyPayment;
    }

    @Override
    public String toString() {
        return String.format("Principal: $%.2f%nAnnual Interest Rate: %.2f%%%nTerm of Loan in Months: %d%nMonthly Payment: $%.2f",
            principal, annualInterestRate * 100, months, calculateMonthlyPayment());
    }
}
    
