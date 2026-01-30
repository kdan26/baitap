/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c6;

/**
 *
 * @author Admin
 */
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 2, 5, 8, 1};

        HashSet<Integer> set = new HashSet<>();
        for (int x : arr) {
            set.add(x);
        }

        System.out.println("Các phần tử duy nhất:");
        for (int x : set) {
            System.out.print(x + " ");
        }
    }
}
