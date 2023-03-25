/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lalalalala;

import java.time.LocalDate;

/**
 *
 * @author murilo
 */
public abstract class Medico extends funcionario {

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public Medico(int crm, Long matricula, LocalDate dataAdimissao, String nome, String email, String telefone) {
        super(matricula, dataAdimissao, nome, email, telefone);
        this.crm = crm;
    }
    
    public int crm;
    
    
    @Override
    public String GetInfo() {
        return String.format("Nome: %s \n Email: %s \n Numero: %s \n Matricula: %s \n Data de Adimissão %s \n CRM: %s \n",
                 getNome(),getEmail(), getTelefone(), getMatricula(), getDataAdimissao(), getCrm());
    } 
    
 
    
    
    
    
    
    
    
    
}
