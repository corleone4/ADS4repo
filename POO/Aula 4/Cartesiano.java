/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cartesiano;

import java.io.Console;

/**
 *
 * @author 040069
 */
public class Cartesiano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Ponto pt1= new Ponto();
        pt1.print();
        Ponto pt2= new Ponto(10, 20);
        pt2.print();
        Ponto pt3= new Ponto(pt2);
        pt3.print();
        
//        pt3.escale(2);
//        pt3.print();
//        
//        pt2.desloc(1, 1);
//        pt2.print();
//        
//        pt1.setXY(3, 4);
//        System.out.println("Distancia ate origem: " + pt1.distance(0, 0));
        
        Segmento s1= new Segmento();
        s1.print();
        
        Segmento s2= new Segmento(2, 4, 8, 10);
        s2.print();
        
        Segmento s3= new Segmento(s2);
        s3.print();
        
        s2.desloc(1, 1);
        s3.escale(2);
        s2.print();
        s3.print();
             
        System.out.println("Comprimento de s2: " + s2.length());
        System.out.println("Comprimento de s1: " + s1.length());
        
        s2.desloc(-1, -1);
        s2.print();
        
        Ponto pm = s2.midPoint();
        pm.print();
    }
    
}
