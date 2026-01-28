/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau2;

/**
 *
 * @author Admin
 */
public class NotificationFactory {

    public static Notification createNotification(String channel) {
        if (channel == null) return null;

        switch (channel.toUpperCase()) {
            case "SMS":
                return new SMSNotification();
            case "EMAIL":
                return new EmailNotification();
            default:
                throw new IllegalArgumentException("Kênh không hỗ trợ");
        }
    }
}
