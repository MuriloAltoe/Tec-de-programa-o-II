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
public abstract class funcionario extends Pessoa {

    public funcionario(Long matricula, LocalDate dataAdimissao, String nome, String email, String telefone) {
        super(nome, email, telefone);
        this.matricula = matricula;
        this.dataAdimissao = dataAdimissao;
    }
    
    private Long matricula;
    private LocalDate dataAdimissao;

    

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public LocalDate getDataAdimissao() {
        return dataAdimissao;
    }

    public void setDataAdimissao(LocalDate dataAdimissao) {
        this.dataAdimissao = dataAdimissao;
    }
    
    @Override
    public String GetInfo() {
        return String.format("Nome: %s \n Email: %s \n Numero: %s \n Matricula: %s \n Data de Adimissão %s \n",
                getNome(), getEmail(), getTelefone(), getMatricula(), getDataAdimissao());
    }
    
}
