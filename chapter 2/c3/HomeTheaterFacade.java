/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau3;

/**
 *
 * @author Admin
 */
public class HomeTheaterFacade {

    private TV tv;
    private SoundSystem sound;
    private DVDPlayer dvd;

    public HomeTheaterFacade() {
        tv = new TV();
        sound = new SoundSystem();
        dvd = new DVDPlayer();
    }

    public void watchMovie() {
        System.out.println("Chuẩn bị xem phim...");
        tv.on();
        sound.on();
        dvd.on();
        System.out.println("Đang xem phim ?");
    }
}

