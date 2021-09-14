package com.example.springbackend.employees;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
    private @Id @GeneratedValue Long id;
    private String infoname;
    private Boolean status;
    private String products;
    private Integer balance;
    private String date;
    
    Employee() {}

    Employee(String infoname, Boolean status, String products, Integer balance, String date) {
        this.infoname = infoname;
        this.status = status;
        this.products = products;
        this.balance = balance;
        this.date = date;
        
    }

    public Long getId() { return this.id; }

    public String getInfoname() { return this.infoname; }

    public Boolean getStatus() { return this.status; }

    public String getProducts() { return this.products; }

    public Integer getBalance() { return this.balance; }
    
    public String getDate() { return this.date;}

    public void setId(Long id) { this.id = id; }

    public void setInfoname(String infoname) { this.infoname = infoname; }

    public void setStatus(Boolean status) { this.status = status; }

    public void setProducts(String products) { this.products = products; }

    public void setBalance(Integer balance) { this.balance = balance; }

    public void setDate(String date) { this.date = date; }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Employee))
            return false;
        Employee employee = (Employee) o;
            return Objects.equals(this.id, employee.id) 
            && Objects.equals(this.infoname, employee.infoname)
            && Objects.equals(this.status, employee.status)
            && Objects.equals(this.products, employee.products)
            && Objects.equals(this.balance, employee.balance)
            && Objects.equals(this.date, employee.date);
    }
    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.infoname, this.status, this.products, this.balance, this.date);
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + this.id 
        + ", infoname='" + this.infoname 
        + '\'' + ", status='" + this.status
        + '\'' + ", products='" + this.products 
        + '\'' + ", balance='" + this.balance 
        + '\'' + ", date='"+ this.date +'}';
    }
}
