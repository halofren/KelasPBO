/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tup.pbo.studicase;

/**
 *
 * @author dany
 */
public class Samsung implements Television {

    private int volume;
    private boolean isPowerOn;

    public Samsung() {
        this.volume = 20;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isIsPowerOn() {
        return isPowerOn;
    }

    public void setIsPowerOn(boolean isPowerOn) {
        this.isPowerOn = isPowerOn;
    }

    @Override
    public void powerOn() {
        if (isPowerOn == true) {
            System.out.println("TV sudah nyala");
        } else {
            isPowerOn = true;
            System.out.println("TV menyala...");
            System.out.println("Selamat datang di Samsung TV");
        }
    }

    @Override
    public void powerOff() {
        if (isPowerOn == true) {
            isPowerOn = false;
            System.out.println("TV dimatikan...");
        }else{
            System.out.println("TV nya sudah mati");
        }

    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (this.volume == MAX_VOLUME) {
                System.out.println("Volume FULL!!");
                System.out.println("sudah " + this.getVolume() + "%");
            } else {
                this.volume += 10;
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Nyalakan dulu donk TV-nya!!");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (this.volume == MIN_VOLUME) {
                System.out.println("Volume = Muted");
            } else {
                this.volume -= 10;
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Nyalakan dulu donk TV-nya!!");
        }
    }

}
