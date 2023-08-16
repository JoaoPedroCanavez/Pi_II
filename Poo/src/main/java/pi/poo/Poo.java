/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package pi.poo;

/**
 *
 * @author joao.pssilvano
 */
public class Poo {

    public static void main(String[] args) {
       Aviao aviao1 = new Aviao();
       aviao1.acelerar();
       System.out.println(aviao1.getCor());
       aviao1.setCor("PRETO");
        System.out.println(aviao1.getCor());
    }
}
