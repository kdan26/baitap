/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package c1and2;

/**
 *
 * @author Admin
 */
public class Test<T> {

    private T value;
    
    public void set(T t) {
        this.value =t;
    }
    public T get() {
        return value;
    }
    public static void main(String[] args) {
        Test<Integer> testInt = new Test<>();
        testInt.set(100);
        System.out.println(" Gia tri Integer:" +testInt.get());
        
        Test<String> testStr = new Test<>();
        testStr.set("Hello");
        System.out.println(" Gia tri String:"+ testInt.get());
    }
}
