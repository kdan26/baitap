/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c9;

/**
 *
 * @author Admin
 */
import java.util.TreeMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        TreeMap<String, Double> products = new TreeMap<>();

        products.put("Laptop", 1500.0);
        products.put("Mouse", 25.0);
        products.put("Keyboard", 50.0);

        System.out.println("Danh sách sản phẩm:");
        for (Map.Entry<String, Double> entry : products.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("\nSản phẩm từ K đến M:");
        Map<String, Double> sub = products.subMap("K", "N");
        for (Map.Entry<String, Double> entry : sub.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

