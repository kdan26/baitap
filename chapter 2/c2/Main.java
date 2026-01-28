/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau2;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Notification n1 = NotificationFactory.createNotification("SMS");
        n1.notifyUser();

        Notification n2 = NotificationFactory.createNotification("EMAIL");
        n2.notifyUser();
    }
}
