/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kalkulator;

import java.util.Queue;
import java.util.LinkedList;
/**
 *
 * @author USER
 */
public class tombolMC {
    // menggunakan queue bawaan generik
    public static Queue<Double> q = new LinkedList<>();
    
    // melakukan push ke dalam queue
    public static void Push(Double x) {
        q.add(x);
    }
    
    // melakukan pop sekalian menghasilkan nilai pop tersebut
    public static double Pop() {
        if ((int) q.size() == 0) throw new RuntimeException("Tidak ada nilai yang tersimpan");
        return q.remove();
    }
    
    // melakukan clear queue
    public static void Clear() {
        while ((int) q.size() > 0) q.remove();
    }
}
