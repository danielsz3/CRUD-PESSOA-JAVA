package cadastro;
import java.awt.*;
import javax.swing.*;


public class Cadastrar extends JFrame {

    public void TelaCadastro(){

        boolean visivel = false;

        // Nome da janela e dimensões
        JFrame tela = new JFrame("Cadastro");
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setSize(700,500);

        // Instancia do JPanel e dimenções
        JPanel painel = new JPanel(new GridBagLayout());
        painel.setSize(700, 500);

        // A grid que forma as posições do painel

        // Instancia do controlador da Grid
        GridBagConstraints grid = new GridBagConstraints();
        grid.gridx =0;
        grid.gridy =1;
        grid.anchor = GridBagConstraints.WEST;
        grid.insets = new Insets(20,0,20,0);//Espaçamento entre os campos



        // Form Nome
        JLabel formNome = new JLabel();
        formNome.setText("Insira seu nome:   ");
        grid.gridx=0;
        grid.gridy=0;
        painel.add(formNome, grid);


        // Input Nome
        JTextArea inputNome = new JTextArea(1,15);
        grid.gridx=1;
        grid.gridy=0;
        grid.insets = new Insets(20,0,20,0);//Espaçamento entre os campos
        painel.add(inputNome, grid);


        // Form Email
        JLabel formEmail = new JLabel();
        formEmail.setText("Insira seu email:   ");
        grid.gridx=0;
        grid.gridy=1;
        grid.insets = new Insets(20,0,20,0);//Espaçamento entre os campos
        painel.add(formEmail, grid);


        // Input Email
        JTextArea inputEmail = new JTextArea(1,15);
        grid.gridx=1;
        grid.gridy=1;
        grid.insets = new Insets(20,0,20,0);//Espaçamento entre os campos
        painel.add(inputEmail, grid);


        // Form Telefone
        JLabel formTelefone = new JLabel();
        formTelefone.setText("Insira seu Telefone:   ");
        grid.gridx=0;
        grid.gridy=2;
        grid.insets = new Insets(20,0,20,0);//Espaçamento entre os campos
        painel.add(formTelefone, grid);


        // Input Telefone
        JTextArea inputTelefone = new JTextArea(1,15);
        grid.gridx=1;
        grid.gridy=2;
        grid.insets = new Insets(20,0,20,0);//Espaçamento entre os campos
        painel.add(inputTelefone,grid);


        // Botão cadastrar
        JButton btnCadastrar = new JButton("CADASTRAR");
        grid.gridx = 0;
        grid.gridy = 3;
        grid.gridwidth = 2;
        grid.anchor = GridBagConstraints.CENTER;
        painel.add(btnCadastrar, grid);


        // Botão cadastrar
        JButton btnVoltar = new JButton("Voltar");
        grid.gridx = 0;
        grid.gridy = 4;
        grid.gridwidth = 2;
        grid.anchor = GridBagConstraints.CENTER;
        painel.add(btnVoltar, grid);


        // Conecta o painel ao frame
        tela.add(painel);

        // Torna o painel visivel
        tela.setVisible(visivel);
    }


}


