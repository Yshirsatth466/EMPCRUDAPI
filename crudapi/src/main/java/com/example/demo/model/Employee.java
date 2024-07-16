
package com.example.demo.model;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="firstname")
    private String firstname;
    

    @Column(name="lasttname")
    private String lastName;

    @Column(name="email")
    private String email;

    // Default constructor
    public Employee() {
    }

    // Parameterized constructor
    public Employee(long id, String firstname, String lastName, String email) {
        this.id = id;
        this.firstname = firstname;
        this.lastName = lastName;
        this.email = email;
    }

    // Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstname=" + firstname + ", lastName=" + lastName + ", email=" + email + "]";
    }
}



















/*package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Employee")
public class Employee {
	@Id
	//(strategy=GenerationType.Identity)
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="lasttname")
	private String lastName;
	@Column(name="email")
	private String email;

}*/
