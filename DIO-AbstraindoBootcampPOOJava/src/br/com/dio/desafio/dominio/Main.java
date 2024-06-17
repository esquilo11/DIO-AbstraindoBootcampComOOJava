package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição curso Js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição mentoria de Java");
        mentoria1.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.IncreverBootcamp(bootcamp);

        System.out.println("Conteudos Inscritos Camila" + devCamila.getConteudosInscritos());
        devCamila.Progredir();
        devCamila.Progredir();
        System.out.println("Conteudos Inscritos Camila" + devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Camila" + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.CalcularTotalXP());


        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.IncreverBootcamp(bootcamp);

        System.out.println("Conteudos Inscritos Joao" + devJoao.getConteudosInscritos());

        System.out.println("Conteudos Concluidos Joao" + devJoao.getConteudosConcluidos());


    }
}
