package br.com.fiap.main;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.ConnectionFactory;
import br.com.fiap.dto.Cliente;
import oracle.jdbc.internal.XSCacheOutput;
import org.w3c.dom.ls.LSOutput;

import java.sql.Connection;
import java.util.ArrayList;

public class TesteClienteCRUD {
    static void main() {
        Connection con = ConnectionFactory.abrirConexao();

        //Objetos Clientes
        Cliente cliente1 = new Cliente();
        cliente1.setIdCliente(1);
        cliente1.setNomeCliente("Victor");
        cliente1.setPlaca("FIAP012");

          Cliente cliente2 = new Cliente();
//        cliente2.setIdCliente(2);
//        cliente2.setNomeCliente("Rafael");
//        cliente2.setPlaca("FIAP013");

        Cliente cliente3 = new Cliente();
        cliente3.setIdCliente(3);
        cliente3.setNomeCliente("Julio");
        cliente3.setPlaca("FIAP014");

        Cliente cliente4 = new Cliente();
        cliente4.setIdCliente(4);
        cliente4.setNomeCliente("Gabi");
        cliente4.setPlaca("FIAP015");

        Cliente cliente5 = new Cliente();
        cliente5.setIdCliente(2);
        cliente5.setNomeCliente("Ana");
        cliente5.setPlaca("FIAP013");


        //Criação objetos ClienteDAO
        ClienteDAO clienteDAO1 = new ClienteDAO(con);
        ClienteDAO clienteDAO2 = new ClienteDAO(con);
        ClienteDAO clienteDAO3 = new ClienteDAO(con);
        ClienteDAO clienteDAO4 = new ClienteDAO(con);
        ClienteDAO clienteDAO5 = new ClienteDAO(con);
        ClienteDAO clienteDAO6 = new ClienteDAO(con);

        //logs criação
//        System.out.println(clienteDAO1.inserir(cliente1));
//        System.out.println(clienteDAO2.inserir(cliente2));
//        System.out.println(clienteDAO3.inserir(cliente3));
//        System.out.println(clienteDAO4.inserir(cliente4));

        //log alteração
//        System.out.println(clienteDAO5.alterar(cliente5));

        //log exclusao
//        System.out.println(clienteDAO4.excluir(cliente4));

        //log read

        ArrayList<Cliente> resultado = clienteDAO6.listarTodos();
        if(resultado != null){
            for(Cliente cliente: resultado){
                System.out.println("\nIdCliente: "+cliente.getIdCliente());
                System.out.println("\nNome_Cliente: "+cliente.getNomeCliente());
                System.out.println("\nPlaca: "+cliente.getPlaca());
            }
        } else{
            System.out.println("Tabela não encontrada ou vazia");
        }

        ConnectionFactory.fecharConexao(con);
    }
}
