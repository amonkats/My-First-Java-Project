/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;


/**
 *
 * @author amonkats
 */
public class jdbcOdbcDriver{
    
    private int hr;
    private int min;
    private int sec;
    
    long ticks  =0;
    
    public jdbcOdbcDriver(int hrs, int mins, int secs){
        hr = hrs;
        min = mins;
        sec = secs;
    }

    public jdbcOdbcDriver() {
        
    }

    public int getHr() {
        return (int) ((ticks / (60 * 60)) % 24);
    }

    public int getMin() {
        return (int) ((ticks / 60) % 60);
    }

    public int getSec() {
        return (int) (ticks % 60);
    }

    
    public void tick(){
       ticks++;
    }
    public void tickDown(){
       ticks--;
    }
    
    
}