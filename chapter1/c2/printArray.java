/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c1and2;

/**
 *
 * @author Admin
 */
public class printArray {
    public static <E> void printArray(E[] array){
        for (E element : array) {
            System.out.print(element + "");
        }
        System.out.println();
    }
    public static void main (String [] args) {
        Integer[] intArray = { 1,2,3,4,5};
        printArray(intArray);
        
        String[] strArray = {"Java", "Generic", "Method"};
        printArray(strArray);
    }
}
