package org.example;

import org.example.Domain.Aluno;
import org.example.Domain.Departamento;
import org.example.Domain.Professor;
import org.example.Domain.Universidade;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Professor> list = new ArrayList<>();
        list.add(new Professor("Murilo"));
        list.add(new Professor("Pedro"));

        Departamento DepTi = new Departamento("Tecnologia da info")
            .setEmail("ti@fatecararas")
            .setProfessores(list);

        Universidade fatec = new Universidade();
        fatec.criarDepartamento(DepTi);
        fatec.listarDepartamento();

        DepTi.criarProfessor();

        fatec.listarDepartamento();

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Jorge"));
        alunos.add(new Aluno("Livia"));
        alunos.add(new Aluno("Ezekiel"));

        DepTi.getProfessores().get(0).setAlunos(alunos);

        fatec.listarDepartamento();

        /*
        var curso = new Curso("Desenvolvimento de Software Multiplataforma", Arrays.asList(
                "CI/CD", "TDD", "DDD", "Mobo Dev"
        ));

        var curso2 = new Curso("Sistemas pra Internet", Arrays.asList(
                "CI/CD", "UI/UX", "Web Dev", "Backend Developer"
        ));

        Aluno a1 = new Aluno("José");
        Aluno a2 = new Aluno("Maria");
        Aluno a3 = new Aluno("João");

        List<Aluno> alunos = Arrays.asList(a1,a2);

        List<Aluno> alunos2 = Arrays.asList(a3);

        Professor professor = new Professor(alunos);
        professor.ensina(curso);

        Professor professor2 = new Professor(alunos2);
        professor2.ensina(curso2);*/
    }
}