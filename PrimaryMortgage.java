/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loanaccounthierarchy;

/**
 *
 * @author vrajp
 */
public class PrimaryMortgage extends LoanAccount{
    private double PMIMonthlyAmount;
    private Address address;

    public PrimaryMortgage(double principal, double annualInterestRate, int months, double PMIMonthlyAmount, Address address) {
        super(principal, annualInterestRate, months);
        this.PMIMonthlyAmount = PMIMonthlyAmount;
        this.address = address;
    }

    @Override
    public String toString() {
        return "\nPrimary Mortgage Loan with:\n" + super.toString() +
            String.format("%nPMI Monthly Amount: $%.2f%nProperty Address:%n%s\n", PMIMonthlyAmount, address);
    }
}

