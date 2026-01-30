/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c3;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args){
        Pair<String, Integer> p1 =
                new OrderedPair<>("MSSV", 10170);
        Pair<String, String> p2 =
                new OrderedPair<>("HoTen","Nguyen Thi Hoa");
        System.out.println(p1.getKey() + " : " + p1.getValue());
        System.out.println(p2.getKey() + " : " + p2.getValue());
    }
}
