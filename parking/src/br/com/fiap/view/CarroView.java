package br.com.fiap.view;

import br.com.fiap.controller.CarroController;

import javax.swing.*;

public class CarroView {
    static void main() {
        String placa,  cor, descricao;
        String[] escolha = {"inserir","Alterar","Excluir","Listar"};
        int opcao;
        CarroController carroController = new CarroController();
        do {
            try{
                opcao = JOptionPane.showOptionDialog(
                        null,
                        "Escolha uma das opções abaixos para manipular um Carro",
                        "Faça sua Escolha",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE,//passagem da opcoes
                        null,
                        escolha, //botao vetor escolhas
                        escolha[0] // escolha padrao
                );
                placa = JOptionPane.showInputDialog("Digite a placa do carro");
                switch (opcao){
                    case 0:
                        cor = JOptionPane.showInputDialog("Digite a cor do carro");
                        descricao = JOptionPane.showInputDialog("Digite a descricao do carro");
                        System.out.println(carroController.inserirCarro(placa,cor,descricao));
                        break;
                    case 1:
                        cor = JOptionPane.showInputDialog("Digite a cor do carro");
                        descricao = JOptionPane.showInputDialog("Digite a descricao do carro");
                        System.out.println(carroController.alterarCarro(placa,cor,descricao));
                        break;
                    case 2:
                        System.out.println(carroController.excluirCarro(placa));
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null,carroController.listarUmCarro(placa));
                        break;
                    default:
                        System.out.println("Opcao invalida");
                }
            }catch (Exception e){
                System.out.println("Erro: "+e.getMessage());
            }

        }while (JOptionPane.showConfirmDialog(null, "Deseja continuar?","Atenção",JOptionPane.
                YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0);
        JOptionPane.showMessageDialog(null, "Fim de programa");
    }
}
