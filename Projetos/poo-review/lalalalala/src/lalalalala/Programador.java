package lalalalala;

import java.time.LocalDate;
import java.util.List;

public class Programador extends funcionario {

    public List<String> getStack() {
        return stack;
    }

    public void setStack(List<String> stack) {
        this.stack = stack;
    }
    
    private List<String> stack;

    
//    @Override
//    public String getInformacao() {
//        return String.format("Nome: %s\nE-Mail: %s\nTel%s\nMatricula:%s\nAdmissao: %s\nStack: [ %s ]\n\n", 
//                getNome(), 
//                getEmail(), 
//                getTelefone(), 
//                getMatricula(),
//                getDataAdmissao(),
//                getStack()
//        );
//    }

    public Programador(Long matricula, LocalDate dataAdimissao, String nome, String email, String telefone) {
        super(matricula, dataAdimissao, nome, email, telefone);
    }
    
}
