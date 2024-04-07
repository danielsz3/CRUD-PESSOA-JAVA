package cadastro;

import javax.swing.*;
import java.awt.*;

public class Gestao {


    public void opcoesGestao() {
        Cadastrar cadastrar = new Cadastrar();


        // Nome da janela e dimensões
        JFrame tela = new JFrame("Cadastro");
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setSize(700, 500);

        // Instancia do JPanel e dimenções
        JPanel painel = new JPanel(new GridBagLayout());
        painel.setSize(700, 500);

        // Instancia do controlador da Grid
        GridBagConstraints grid = new GridBagConstraints();
        grid.gridx = 0;
        grid.gridy = 1;
        grid.anchor = GridBagConstraints.WEST;//Esquerda
        grid.insets = new Insets(20, 0, 20, 0);//Espaçamento entre os campos

        // Label Informativa
        JLabel textExplicativo = new JLabel();
        textExplicativo.setText("SISTEMA DE GESTÃO UNIALFA");
        grid.gridx = 0;
        grid.gridy = 0;
        grid.anchor = GridBagConstraints.CENTER;
        painel.add(textExplicativo, grid);


        // Botão cadastrar
        JButton btnCadastrar = new JButton("CADASTRAR");
        grid.gridx = 0;
        grid.gridy = 1;
        grid.gridwidth = 2;
        grid.anchor = GridBagConstraints.CENTER;
        painel.add(btnCadastrar, grid);
        btnCadastrar.addActionListener(e -> acaoCadastrar());


        // Botão Listar
        JButton btnListar = new JButton("LISTAR");
        grid.gridx = 0;
        grid.gridy = 2;
        grid.gridwidth = 2;
        grid.anchor = GridBagConstraints.CENTER;
        painel.add(btnListar, grid);

        // Botão Editar
        JButton btnEditar = new JButton("EDITAR");
        grid.gridx = 0;
        grid.gridy = 3;
        grid.gridwidth = 2;
        grid.anchor = GridBagConstraints.CENTER;
        painel.add(btnEditar, grid);

        // Botão Deletar
        JButton btnDeletar = new JButton("DELETAR");
        grid.gridx = 0;
        grid.gridy = 4;
        grid.gridwidth = 2;
        grid.anchor = GridBagConstraints.CENTER;
        painel.add(btnDeletar, grid);

        // Conecta o painel ao frame
        tela.add(painel);

        // Torna o painel visivel
        tela.setVisible(true);

    }

    public static void main(String[] args) {
        Gestao gestao = new Gestao();
        SwingUtilities.invokeLater(() -> {
            gestao.opcoesGestao();
        });
    }

    public void acaoCadastrar() {
        // Chama o método para exibir a tela de cadastro
        Cadastrar telaCadastro = new Cadastrar();
        telaCadastro.TelaCadastro();
    }


}