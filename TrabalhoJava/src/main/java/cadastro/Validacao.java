package cadastro;

public class Validacao {

    public static void validarCadastro(String nome, String email, String telefone) {

        // Validação dos campos

        try {

            if (!(nome.length() >= 6) || !nome.matches("^[a-zA-Zà-ü\\s]+$")) {
                throw new RuntimeException("Nome inválido: deve ter pelo menos 6 caracteres e conter apenas letras");
            }

            if (!email.contains("@") || !email.endsWith(".com")) {
                throw new RuntimeException("E-mail inválido");
            }
            
            if (!(telefone.length() == 11)) {
                throw new RuntimeException("Digite um número de telefone válido");
            }

        } catch (RuntimeException e) {
            throw e;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}