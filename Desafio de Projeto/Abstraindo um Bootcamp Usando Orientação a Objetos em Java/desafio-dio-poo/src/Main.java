import com.matheusrayol.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // Objetos - Curso
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso de Java ministrado pela Digital Innovation One");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JavaScript");
        curso2.setDescricao("Curso de JavaScript ministrado pela Digital Innovation One");
        curso2.setCargaHoraria(16);

        Conteudo conteudo = new Curso();


        // Objetos - Mentoria
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria de Java ministrada pela Digital Innovation One");
        mentoria.setData(LocalDate.now());

        // Imprime os dados dos cursos e mentoria
        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp Java Developer ministrado pela Digital Innovation One");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMatheus = new Dev();
        devMatheus.setNome("Matheus Rayol");
        devMatheus.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devMatheus.getConteudosInscritos());
        devMatheus.progredir();
        devMatheus.progredir();
        System.out.println("Conteúdos Inscritos" + devMatheus.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devMatheus.getConteudosConcluidos());
        System.out.println("XP: " + devMatheus.calcularTotalXp());

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Conteúdos Inscritos" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());
    }
}
