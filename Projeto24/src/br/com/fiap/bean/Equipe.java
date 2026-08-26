package br.com.fiap.bean;

import javax.swing.*;

public class Equipe {

    //Atributos
    private String nome;
    private String[] integrantes;

    //Contrutores
    public Equipe() {}
    public Equipe(String nome, String[] integrantes) {
        this.nome = nome;
        this.integrantes = integrantes;
    }
    //metodos getters e setters
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String[] getIntegrantes() {return integrantes;}
    public void setIntegrantes(String[] integrantes) {this.integrantes = integrantes;}

    //metodos da classe
    public void listarequipe(){
        String exibe = String.format("Nome da Equipe: %s \n", nome);
        int cont = 1;
        for (String i : integrantes){
            exibe += String.format("Integrante %d: %s \n",cont,i);
            cont++;
        }
        JOptionPane.showMessageDialog(null,exibe,"Lista de Equipe",JOptionPane.INFORMATION_MESSAGE);
    }
}
