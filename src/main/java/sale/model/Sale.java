/**
 * Written by Aniruddha Bhattacharya
 */

package main.java.sale.model;

import main.java.customer.model.CustomerModel;
import main.java.employee.model.EmployeeModel;

/**
 * Represents a sale created by an employee and given to a customer
 * This object contains all the necessary information associated with a sale
 */
public class Sale
{
    // Member fields
    private EmployeeModel employee;
    private CustomerModel customer;
    private int id;
    private boolean rating;
    private boolean saleDecision;

    // Constructor
    public Sale(CustomerModel cm, int sale_id) {
        customer = cm;
        id = sale_id;
    }

    // Setters
    public void setSaleDecision(boolean decision) {
        saleDecision = decision;
    }

    public void setEmployee(EmployeeModel em) {
        employee = em;
    }

    // Getters
    public int getId() {
        return id;
    }

    public EmployeeModel getEmployee() {
        return employee;
    }

    public CustomerModel getCustomer() {
        return customer;
    }
}