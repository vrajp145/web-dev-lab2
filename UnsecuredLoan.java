/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loanaccounthierarchy;

/**
 *
 * @author vrajp
 */
public class UnsecuredLoan extends LoanAccount{
    public UnsecuredLoan(double principal, double annualInterestRate, int months) {
        super(principal, annualInterestRate, months);
        }

    @Override
    public String toString() {
        return "Unsecured Loan with:\n" + super.toString();
        }
    }   

