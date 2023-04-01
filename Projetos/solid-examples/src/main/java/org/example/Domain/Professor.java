package org.example.Domain;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Professor {

    public String nome;
    private List<Aluno> alunos = new ArrayList<>();
    public Professor(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", alunos=" + alunos +
                '}';
    }

    public void ensina(Curso curso){
        System.out.println(curso.getNome());
        alunos.forEach(aluno -> aluno.asssimilar(curso.getConhecimentos()));
        alunos.forEach(System.out::println);
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public Professor(String nome) {
        this.nome = nome;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }


}
