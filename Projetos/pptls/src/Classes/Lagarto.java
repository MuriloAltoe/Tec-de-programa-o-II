package Classes;


import java.util.Map;

public class Lagarto extends Algoritmo {

    @Override
    public Map<String, String> executar(Tipo pTipo) {
        switch (pTipo) {
            case PAPEL -> valor = "Ganhou! Lagarto come papel!";
            case TESOURA -> valor = "Perdeu! Tesoura corta o lagarto";
            case PEDRA -> valor = "Perdeu! Pedra esmaga lagarto";
            case LAGARTO -> valor = "Empate! Lagarto e lagarto!";
            case SPOCK -> valor = "Ganhou! Lagarto envenena Spock";
            default -> valor = "Empatou! Opção inválida!";
        }

        resultado.put(KEY, valor);
        return resultado;
    }
}

