package com.db1.db1start;

import java.util.ArrayList;
import java.util.Date;

public class App {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno ();
        aluno1.nome = "Maiko Cunha";
        aluno1.email = "maiko.cunha@bd1.com.br";

        Aluno aluno2 = new Aluno ();
        aluno2.nome = "João Silva";
        aluno2.email = "joao.silva@bd1.com.br";

        Professor professor = new Professor();
        professor.nome = "Igor Silva";
        professor.email = "igor.silva@bd1.com.br";

        Materia materia = new Materia();
        materia.nome = "POO";
        materia.descricao = "Abstração, Encapsulamento, Polimorfismo, Herança";
        materia.cargaHoraria = 10.5;
        materia.quantidaDedeAulas = 3;
        materia.professor = professor;

        Aula aula = new Aula();
        aula.data = new Date();
        aula.materia = materia;
        aula.alunos = new ArrayList<Aluno>();
        aula.alunos.add(aluno1);
        aula.alunos.add(aluno2);
        System.out.println(aula);



    }
}
