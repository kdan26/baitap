/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b4;

/**
 *
 * @author Admin
 */
import java.util.concurrent.*;

public class Bai4 {

    public static void main(String[] args) {

        CompletableFuture<Void> checkProduct =
            CompletableFuture.runAsync(() -> {
                sleep(2000);
                System.out.println("✔ Kiểm tra sản phẩm hoàn tất");
            });

        CompletableFuture<Void> payment =
            CompletableFuture.runAsync(() -> {
                sleep(3000);
                System.out.println("✔ Thanh toán hoàn tất");
            });

        CompletableFuture<Void> shipping =
            CompletableFuture.runAsync(() -> {
                sleep(2500);
                System.out.println("✔ Vận chuyển hoàn tất");
            });

        // Chờ tất cả hoàn thành
        CompletableFuture.allOf(checkProduct, payment, shipping)
                .thenRun(() -> System.out.println("🎉 Đơn hàng đã được xử lý xong"))
                .join();
    }

    private static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

