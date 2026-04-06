/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tup.pbo.studicase;

/**
 *
 * @author dany
 */
public class User {

    private Television television;

    public User(Television television) {
        this.television = television;
    }

    void turnOnTV() {
        this.television.powerOn();
    }

    void turnOffTV() {
        this.television.powerOff();
    }

    void makeTVLouder() {
        this.television.volumeUp();
    }

    void makeTVSilent() {
        this.television.volumeDown();
    }

}
