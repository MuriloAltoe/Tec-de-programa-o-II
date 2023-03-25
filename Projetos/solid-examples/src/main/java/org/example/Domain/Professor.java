package org.example.Domain;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Professor {
    private List<Aluno> alunos = new ArrayList<>();

    public Professor(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void ensina(Curso curso){
        System.out.println(curso.getNome());
        alunos.forEach(aluno -> aluno.asssimilar(curso.getConhecimentos()));
        alunos.forEach(System.out::println);
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }


}
