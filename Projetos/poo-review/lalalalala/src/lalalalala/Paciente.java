/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lalalalala;

/**
 *
 * @author murilo
 */
public class Paciente extends Pessoa {

    public Paciente(String nome, String email, String telefone) {
        super(nome, email, telefone);
    }
    
    @Override
    public String GetInfo() {
        return String.format("NomePaciente: %s \n Email: %s ",
                 getNome(),getEmail(), getTelefone());
    }
    
}
