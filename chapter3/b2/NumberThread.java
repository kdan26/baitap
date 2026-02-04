/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b2;

/**
 *
 * @author Admin
 */
class NumberThread extends Thread {

    public NumberThread(String name) {
        super(name); // đặt tên thread
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(getName() + ": " + i);
        }
    }
}
