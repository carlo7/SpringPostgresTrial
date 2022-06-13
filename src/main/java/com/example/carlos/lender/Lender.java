package com.example.carlos.lender;

import javax.persistence.*;

//To create a table named User with various parameter fields, their getters and setters
@Entity
@Table
public class Lender {
    @Id
    @SequenceGenerator(
            name = "userID_sequence",
            sequenceName = "userID_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "userID_sequence"
    )
   //Initialize transactions for database fields
    private Long id;
    private String last_name, first_name;
    private int loan, paid;
    @Transient
    private int balance;



    public Lender(Long id, String last_name, String first_name, int loan, int paid) {
        this.last_name = last_name;
        this.first_name = first_name;
        this.id= id;
        this.loan = loan;
        this.paid = paid;
    }


    public Lender() {
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public int getLoan() {
        return loan;
    }

    public void setLoan(int loan) {
        this.loan = loan;
    }

    public int getPaid() {
        return paid;
    }

    public void setPaid(int paid) {
        this.paid = paid;
    }

    public int getBalance() {
        return loan-paid;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Lender{" +
                "id=" + id +
                ", last_name='" + last_name + '\'' +
                ", first_name='" + first_name + '\'' +
                ", loan=" + loan +
                ", paid=" + paid +
                ", balance=" + balance +
                '}';
    }
}
