package entity;

import java.time.LocalDateTime;
import java.util.Date;

public class Customer {

    private Integer id;
    private String name;
    private String surname;
    private String nationalityId;
    private Date birthdate;

    public Customer() {
    }

    public Customer(Integer id, String name, String surname, String nationalityId, LocalDateTime dateOfBirth) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.nationalityId = nationalityId;
        this.birthdate = birthdate;
    }

    public Integer getId() {
        return id;
    }

    public Customer setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Customer setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Customer setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public Customer setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
        return this;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public Customer setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
        return this;
    }
}
