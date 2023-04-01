package org.example.Domain;

import java.util.ArrayList;
import java.util.List;

public class Universidade {
    private List<Departamento> departamentos = new ArrayList<>();



    public void criarDepartamento(Departamento departamento){
        this.departamentos.add(departamento);
    }

    public void excluirDepartamento(Departamento departamento){
        this.departamentos.remove(departamento);
    }

    public void listarDepartamento() {
        System.out.println("Departamentos: \n");
        this.departamentos.forEach(departamento -> {
            System.out.println(departamento);
        });
        System.out.println("\n -------------------------------------------");
    }

    @Override
    public String toString() {
        return "Universidade{" +
                "departamentos=" + departamentos +
                '}';
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }
}
