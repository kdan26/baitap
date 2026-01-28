/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau5;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Notification notification = new Notification();

        notification.setMessageService(new EmailService());
        notification.send("Xin chào qua Email");

        notification.setMessageService(new SMSService());
        notification.send("Xin chào qua SMS");
    }
}

