/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loanaccounthierarchy;

/**
 *
 * @author vrajp
 */

import java.util.ArrayList; 
        
public class Customer {
    private String firstName;
    private String lastName;
    private String SSN;
    private ArrayList<LoanAccount> loanAccounts = new ArrayList<>();

    public Customer(String firstName, String lastName, String SSN) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSSN() {
        return SSN;
    }

    public void addLoanAccount(LoanAccount account) {
        loanAccounts.add(account);
    }

    public void printMonthlyReport() {
        System.out.println("Account Report for " + firstName + " " + lastName + " " + SSN + ":\n");
        for (LoanAccount account : loanAccounts) {
            System.out.println(account);
            System.out.println();
        }
    }
}
