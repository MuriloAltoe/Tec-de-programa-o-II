package Classes;

import java.util.Map;

public class Spock extends Algoritmo {

    @Override
    public Map<String, String> executar(Tipo pTipo) {
        switch (pTipo) {
            case PAPEL -> valor = "Perdeu! Papelrefuta spock!";
            case TESOURA -> valor = "Ganhou! Spock quebra a tesoura";
            case PEDRA -> valor = "Ganhou! Spock vaporiza pedra";
            case LAGARTO -> valor = "Perdeu! Lagarto envenena spock!";
            case SPOCK -> valor = "Empate! Spock e Spock";
            default -> valor = "Empatou! Opção inválida!";
        }

        resultado.put(KEY, valor);
        return resultado;
    }
}
