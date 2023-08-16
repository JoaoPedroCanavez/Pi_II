/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pi.poo;

import java.util.Scanner;

/**
 *
 * @author joao.pssilvano
 */
public class Aviao {

    public String marca;
    public int velocidade;
    public int altitude;
    private String cor;

    public Aviao() {   
        this.cor = "branco";
    }

    public void acelerar() {
        this.velocidade += 50;

    }

    public void frear() {
        this.velocidade -= 50;
    }
    
   
    
    public void setCor(String coloracao){
        this.cor = coloracao;
    }
    
    public String getCor(){
        return this.cor;
    }
}
