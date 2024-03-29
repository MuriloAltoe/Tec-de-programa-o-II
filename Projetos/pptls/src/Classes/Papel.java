package Classes;

import java.util.Map;

public class Papel extends Algoritmo {

    @Override
    public Map<String, String> executar(Tipo pTipo) {
        switch (pTipo) {
            case PAPEL -> valor = "Empate. Papel empata com papel!";
            case TESOURA -> valor = "Perdeu! Tesoura corta o papel!";
            case PEDRA -> valor = "Ganhou! Papel embrulha a pedra!";
            case LAGARTO -> valor = "Perdeu! Lagarto come o papel!";
            case SPOCK -> valor = "Ganhou! Papel refuta o Spock!";
            default -> valor = "Empatou! Opção inválida!";
        }

        resultado.put(KEY, valor);
        return resultado;
    }
}

