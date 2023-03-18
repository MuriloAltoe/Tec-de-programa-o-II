package Classes;

import java.util.Map;

public class Tesoura extends Algoritmo {

    @Override
    public Map<String, String> executar(Tipo pTipo) {
        switch (pTipo) {
            case PAPEL -> valor = "Ganhou! Tesoura corta papel!";
            case TESOURA -> valor = "Empatou! Tesoura e tesoura";
            case PEDRA -> valor = "Perdeu! Pedra quebra tesoura";
            case LAGARTO -> valor = "Ganhou! Tesoura corta lagarto!";
            case SPOCK -> valor = "Perdeu! Spock Quebra a tesoura";
            default -> valor = "Empatou! Opção inválida!";
        }

        resultado.put(KEY, valor);
        return resultado;
    }
}
