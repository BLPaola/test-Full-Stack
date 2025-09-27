package com.test.dev.model;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;  // Clave primaria autogenerada

    @Column(name = "picture_large")
    private String pictureLarge;

    private String city;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    private String gender;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "name_title")
    private String nameTitle;

    private String phone;

    private Integer postcode;

    private String state;

    // Getters y Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getPictureLarge() { return pictureLarge; }
    public void setPictureLarge(String pictureLarge) { this.pictureLarge = pictureLarge; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getNameTitle() { return nameTitle; }
    public void setNameTitle(String nameTitle) { this.nameTitle = nameTitle; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public Integer getPostcode() { return postcode; }
    public void setPostcode(Integer postcode) { this.postcode = postcode; }

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }
}
