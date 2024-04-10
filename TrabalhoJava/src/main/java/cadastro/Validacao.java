package cadastro;

import javax.swing.JOptionPane;
import javax.swing.*;

public class Validacao {

    public static void validarCadastro(String nome, String email, String telefone) throws Exception {
        // Validação dos campos
        if (nome.length() < 6) {
            throw new Exception("Nome deve ter pelo menos 6 caracteres");
        }

        if (!email.contains("@") || !email.endsWith(".com")) {
            throw new Exception("E-mail inválido");
        }

        if (telefone.isEmpty() || telefone.length() > 11 || !telefone.matches("\\d+")) {
            throw new Exception("Digite um número de telefone válido");
        }
    }
}
