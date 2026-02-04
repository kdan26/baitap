/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hh;

/**
 *
 * @author Admin
 */


public class bai1 {
    public static void main(String[] args) {
        // Chạy Thread
        WorkerThread t1 = new WorkerThread();
        t1.start();

        // Chạy Runnable
        Thread t2 = new Thread(new WorkerRunnable());
        t2.start();
    }
}

