/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c4;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add(1, "Mango");
        
        int index = fruits.indexOf("Banana");
        if (index != -1) {
            fruits.set(index, "Grapes");
        }
        boolean exists = fruits.contains("Apple");
        System.out.println("Apple tồn tại: " + exists);

        System.out.println("List of fruits: " + fruits);
    }
}
