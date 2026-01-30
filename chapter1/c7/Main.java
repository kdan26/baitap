/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c7;

/**
 *
 * @author Admin
 */
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<String> names = new TreeSet<>();
        names.add("John");
        names.add("Alice");
        names.add("Zack");
        names.add("Bob");

        System.out.println("Danh sách trong TreeSet:");
        System.out.println(names);

        String first = names.first();
        String last = names.last();

        System.out.println("Phần tử nhỏ nhất (first): " + first);
        System.out.println("Phần tử lớn nhất (last): " + last);
    }
}
