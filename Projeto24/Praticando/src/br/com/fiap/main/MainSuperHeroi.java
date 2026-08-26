package br.com.fiap.main;

import br.com.fiap.bean.SuperHeroi;

import javax.swing.*;

public class MainSuperHeroi {
    static void main() {
        SuperHeroi superhero;
        String nome;
        String idSecreta;
        String[] poderes;
        String[] fraquezas;
        int quantidadeP;
        int quantidadeD;
        do {
            try {
                nome = JOptionPane.showInputDialog("Digite o nome do seu heroi:");
                idSecreta = JOptionPane.showInputDialog("Digite a identidade secreta d seu heroi:");
                quantidadeP = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de podderes?"));
                quantidadeD = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de fraquezas?"));
                poderes = new String[quantidadeP];
                for (int i = 0; i < poderes.length; i++) {
                poderes[i] = JOptionPane.showInputDialog(String.format("Poderes %d: ",(i+1)));
                }

                fraquezas = new String[quantidadeD];
                for (int i = 0; i < fraquezas.length; i++) {
                    fraquezas[i] = JOptionPane.showInputDialog(String.format("Fraquezas %d: ",(i+1)));
                }
                superhero = new SuperHeroi(nome,idSecreta,poderes,fraquezas);
                superhero.listarHeroi();

            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
            }

        }while (JOptionPane.showConfirmDialog(null,"Deseja continuar?","Atenção",JOptionPane.
                YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)== 0);
    }
}
