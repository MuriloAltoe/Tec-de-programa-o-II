/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lalalalala;

import java.time.LocalDate;
import java.util.Random;

/**
 *
 * @author murilo
 */
public class Pediatra extends Medico implements Contrato{
    
    public Pediatra(int crm, Long matricula, LocalDate dataAdimissao, String nome, String email, String telefone) {
        super(crm, matricula, dataAdimissao, nome, email, telefone);
    }
    
    @Override
    public String GetInfo() {
        return String.format("Nome: %s \n Email: %s \n Numero: %s \n Matricula: %s \n Data de Adimissão %s \n CRM: %s \n",
                 getNome(),getEmail(), getTelefone(), getMatricula(), getDataAdimissao(), getCrm());
    }

    public void executarProcediemento(Paciente paciente)  throws Exception{
        System.out.printf("Atendendo %s...", paciente.getNome());
        System.out.println("Medindo a temperatura...");
        Thread.sleep(3000);
        System.out.printf("Temperatura %s graus.\n", new Random().nextInt(40));
        vacinar(paciente);
        Thread.sleep(3000);
        System.out.printf("Finalizou o atendimento de %s.\n", paciente.getNome());
        System.out.println("=)");
    }

    @Override
    public void vacinar(Paciente paciente) {
        System.out.printf("Aplicada a vacina em %s...", paciente.getNome());
        System.out.println("=)");
    }
}
