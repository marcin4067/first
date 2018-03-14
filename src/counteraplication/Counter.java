/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counteraplication;

/**
 *
 * @author marcin7500
 */
public class Counter {
    private int value;
    
    public Counter() {
        value = 0;
    }
    
    public void increment() {
        value = value + 1;
    }
    
    public void reset() {
        value = 0;
    }
    
    public int value() {
        return value;
    }
}

