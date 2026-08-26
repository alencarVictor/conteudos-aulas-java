package br.com.fiap.bean;

import javax.swing.*;

public class SuperHeroi {

    //Atributos
    private String nome;
    private String idSecreta;
    private String[] poderes;
    private String[] fraquezas;

    //construtores
    public SuperHeroi() {}
    public SuperHeroi(String nome, String idSecreta, String[] poderes, String[] fraquezas) {
        this.nome = nome;
        this.idSecreta = idSecreta;
        this.poderes = poderes;
        this.fraquezas = fraquezas;
    }

    //metodos getters e setters
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getIdSecreta() {return idSecreta;}
    public void setIdSecreta(String idSecreta) {this.idSecreta = idSecreta;}
    public String[] getPoderes() {return poderes;}
    public void setPoderes(String[] poderes) {this.poderes = poderes;}
    public String[] getFraquezas() {return fraquezas;}
    public void setFraquezas(String[] fraquezas) {this.fraquezas = fraquezas;}

    //metodo da classe
    public void listarHeroi(){
        String exibe = String.format("Nome do Heroi: %s \n Indentidade Secreta: %s \n", nome , idSecreta);
        int contP = 1;
        int contF = 1;
        for (String i : poderes){
            exibe += String.format("Poderes %d: %s \n" , contP,i);
            contP++;
        }
        for (String i : fraquezas){
            exibe += String.format("Fraquezas %d: %s \n" , contF,i);
            contF++;
        }
        JOptionPane.showMessageDialog(null,exibe,"Informações do Heroi",JOptionPane.INFORMATION_MESSAGE);
    }
}
