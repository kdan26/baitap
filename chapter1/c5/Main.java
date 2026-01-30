/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c5;

/**
 *
 * @author Admin
 */
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        queue.addFirst(5);
        queue.addLast(40);

        System.out.println("Danh sách sau khi thêm: " + queue);

        queue.removeFirst();
        queue.removeLast();

        System.out.println("Danh sách còn lại: " + queue);
    }
}
