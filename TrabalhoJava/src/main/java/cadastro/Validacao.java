package cadastro;

import javax.swing.*;

public class Validacao extends Cadastro{
    Cadastro x = new Cadastro();
        if (x.getNome().isEmpty()) try {
            throw new Exception("%s não pode ser vazio".formatted(x.getNome()));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
}
