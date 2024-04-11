package cadastro;

import jdk.jshell.spi.ExecutionControl;

import java.awt.*;
import javax.swing.*;

import static javax.swing.JOptionPane.showMessageDialog;


public class Cadastro extends JFrame {
    private String nome;
    private String email;
    private String telefone;

    JTextField inputNome;
    JTextField inputEmail;
    JTextField inputTelefone;

    public void TelaCadastro() {

        // Nome da janela e dimensões
        JFrame tela = new JFrame("Cadastro");
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setSize(700, 500);

        // Instancia do JPanel e dimenções
        JPanel painel = new JPanel(new GridBagLayout());
        painel.setSize(700, 500);

        // A grid que forma as posições do painel

        // Instancia do controlador da Grid
        GridBagConstraints grid = new GridBagConstraints();
        grid.gridx = 0;
        grid.gridy = 1;
        grid.anchor = GridBagConstraints.WEST;
        grid.insets = new Insets(20, 0, 20, 0);//Espaçamento entre os campos


        // Form Nome
        JLabel formNome = new JLabel();
        formNome.setText("Insira seu nome completo:   ");
        grid.gridx = 0;
        grid.gridy = 0;
        painel.add(formNome, grid);


        // Input Nome
        inputNome = new JTextField(15);
        grid.gridx = 1;
        grid.gridy = 0;
        grid.insets = new Insets(20, 0, 20, 0);//Espaçamento entre os campos
        painel.add(inputNome, grid);


        // Form Email
        JLabel formEmail = new JLabel();
        formEmail.setText("Insira seu email:   ");
        grid.gridx = 0;
        grid.gridy = 1;
        grid.insets = new Insets(20, 0, 20, 0);//Espaçamento entre os campos
        painel.add(formEmail, grid);


        // Input Email
        inputEmail = new JTextField(15);
        grid.gridx = 1;
        grid.gridy = 1;
        grid.insets = new Insets(20, 0, 20, 0);//Espaçamento entre os campos
        painel.add(inputEmail, grid);


        // Form Telefone
        JLabel formTelefone = new JLabel();
        formTelefone.setText("Insira seu Telefone:   ");
        grid.gridx = 0;
        grid.gridy = 2;
        grid.insets = new Insets(20, 0, 20, 0);//Espaçamento entre os campos
        painel.add(formTelefone, grid);


        //Input Telefone
        inputTelefone = new JTextField(15);
        grid.gridx = 1;
        grid.gridy = 2;
        grid.insets = new Insets(20, 0, 20, 0);//Espaçamento entre os campos
        painel.add(inputTelefone, grid);


        // Botão cadastrar
        JButton btnCadastrar = new JButton("CADASTRAR");
        grid.gridx = 0;
        grid.gridy = 3;
        grid.gridwidth = 2;
        grid.anchor = GridBagConstraints.CENTER;
        painel.add(btnCadastrar, grid);
        btnCadastrar.addActionListener(e -> {
            try {
                cadastrar();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro no cadastro", JOptionPane.ERROR_MESSAGE);
            }

        });

        // Conecta o painel ao frame
        tela.add(painel);

        // Torna o painel visivel
        tela.setVisible(true);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public JTextField getInputNome() {
        return inputNome;
    }

    public void setInputNome(JTextField inputNome) {
        this.inputNome = inputNome;
    }

    public JTextField getInputEmail() {
        return inputEmail;
    }

    public void setInputEmail(JTextField inputEmail) {
        this.inputEmail = inputEmail;
    }

    public JTextField getInputTelefone() {
        return inputTelefone;
    }

    public void setInputTelefone(JTextField inputTelefone) {
        this.inputTelefone = inputTelefone;
    }

    public void cadastrar() throws Exception {

        // Obtem os dados dos campos de texto
        setNome(inputNome.getText());
        setEmail(inputEmail.getText());
        setTelefone(inputTelefone.getText());

        // Validação utilizando a classe Validacao
        Validacao.validarCadastro(getNome(), getEmail(), getTelefone());

        // Se todos os campos estiverem preenchidos, mostra a mensagem de cadastro
        String mensagem = "Nome: " + this.nome + "\nEmail: " + this.email + "\nTelefone: " + this.telefone;
        JOptionPane.showMessageDialog(null, mensagem, "Cadastro realizado com sucesso!", JOptionPane.INFORMATION_MESSAGE);
    }
}


