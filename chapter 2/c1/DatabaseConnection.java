/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau1;

/**
 *
 * @author Admin
 */
public class DatabaseConnection {

    // 2. Biến static lưu instance duy nhất
    private static DatabaseConnection instance;

    // 1. Constructor private
    private DatabaseConnection() {
        System.out.println("Kết nối Database được tạo");
    }

    // 3. Phương thức lấy instance
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
}

