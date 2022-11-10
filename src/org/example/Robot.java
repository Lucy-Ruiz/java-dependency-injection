package org.example;
import org.example.Weapon;

public class Robot {
    //Instance variables (HAS A)
    public String name;
    public String weaponName;
    public int weaponPower;


    //Constructor
    public Robot() {
        this.name = "Gusteau";
        Weapon weapon_one = new Weapon("Sword", 50);
    }

    //Methods (CAN DO)
    public void Attack(){
        System.out.println(this.name + " attacks with their " + this.weaponName + " for " + this.weaponPower + " damage");
    }
}
