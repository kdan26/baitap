/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c8;

/**
 *
 * @author Admin
 */
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> employees = new HashMap<>();

        employees.put(101, "Anna");
        employees.put(102, "Peter");
        employees.put(103, "Mary");

        String name102 = employees.get(102);
        System.out.println("Nhân viên ID 102: " + name102);

        if (!employees.containsKey(105)) {
            employees.put(105, "Unknown");
        }

        System.out.println("Danh sách nhân viên:");
        for (Integer id : employees.keySet()) {
            System.out.println(id + " : " + employees.get(id));
        }
    }
}

