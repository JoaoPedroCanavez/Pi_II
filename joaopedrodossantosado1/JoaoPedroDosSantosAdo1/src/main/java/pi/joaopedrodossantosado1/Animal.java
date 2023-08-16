/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pi.joaopedrodossantosado1;

/**
 *
 * @author jsant
 */
public class Animal implements interfaceAnimal{    
    
    public String especie;
    public String familia;
    public float altura;
    public float peso;
    public String cor;
    public boolean emMovimento;
    public boolean acordado;
    private boolean fome;
    private String nome;
    

    public Animal(){
        this.especie = "Jaguar";
        this.familia = "Felino";
    }
    
    @Override
    public void comer(){
        if(fome==true && acordado==true){
            this.setFome(false);
            System.out.println("Ele comeu e está cheio.");
        }else if(fome!=true&&acordado==true){
            System.out.println("Não é possivel comer, ele não está com fome");
        }else if(acordado!=true&&fome==true){
            System.out.println("Não é possivel comer, ele está dormindo");
        }else{
            System.out.println("Ele está cheio e dormindo");
        }
    }
    
    @Override
    public void andar(){
        if(this.acordado==true){
            this.emMovimento= true;
            System.out.println("Ele está andando");
        }else{
            System.out.println("Não é possivel andar, ele está dormindo");
        }
    }
    
    @Override
    public void parar(){
        if(this.emMovimento==true){
            this.emMovimento=false;
            System.out.println("Ele parou de andar");
        }else{
            System.out.println("Ele já estava parado");
        }
    }
   
    
    public void setFome(boolean fome) {
        this.fome = fome;
    }

    public boolean isFome() {
        return fome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
