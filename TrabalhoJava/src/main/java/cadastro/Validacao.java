package cadastro;

import java.util.regex.*;
import javax.swing.JOptionPane;
import javax.swing.*;
import static java.util.regex.Pattern.matches;


public class Validacao {

    public static void validarCadastro(String nome, String email, String telefone) throws Exception {

        // Validação dos campos

        try {


            if (!(nome.length() >= 6) || !nome.matches("^[a-zA-Zà-ü\\s]+$")) {
                throw new Exception("Nome inválido: deve ter pelo menos 6 caracteres e conter apenas letras");
            }

            if (!email.contains("@") || !email.endsWith(".com")) {
                throw new Exception("E-mail inválido");
            }

            if (!(telefone.length() == 11)) {
                throw new Exception("Digite um número de telefone válido");
            }

        } catch (Exception e) {

            throw new RuntimeException(e);
        }
    }
}
