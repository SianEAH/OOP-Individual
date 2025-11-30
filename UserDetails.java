/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package watersanitationgame.Input_Sian;

/**
 *
 * @author Sian
 */
public class UserDetails {
    
    //private data members
    private Name name;
    private Age age;
    private Gender gender;
    private Country country;
    
    //constructor: holds my objects for my classes
    public UserDetails() {
        name = new Name();
        age = new Age();
        gender = new Gender();
        country = new Country();
    }
    
    //setters
    public void setName(Name name) {
        this.name = name;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
    
    //getters
    public Name getName() {
        return name;
    }

    public Age getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public Country getCountry() {
        return country;
    }
    
    
}
