package Classes;

import java.util.Map;

public class Pedra extends Algoritmo {

    @Override
    public Map<String, String> executar(Tipo pTipo) {
        switch (pTipo) {
            case PAPEL -> valor = "Perdeu. Papel embrulha pedra!";
            case TESOURA -> valor = "Ganhou! Pedra quebra tesoura!";
            case PEDRA -> valor = "Empate! Pedra empata com pedra!";
            case LAGARTO -> valor = "Ganhou! Pedra esmaga lagarto!";
            case SPOCK -> valor = "Perdeu! Spock vaporiza a pedra";
            default -> valor = "Empatou! Opção inválida!";
        }

        resultado.put(KEY, valor);
        return resultado;
    }
}

