import com.matheusrayol.dominio.Curso;
import com.matheusrayol.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // Objetos - Curso
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso de Java ministrado pela Digital Innovation One");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Java 2");
        curso2.setDescricao("Curso de Java 2 ministrado pela Digital Innovation One");
        curso2.setCargaHoraria(8);

        // Objetos - Mentoria
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria de Java ministrada pela Digital Innovation One");
        mentoria.setData(LocalDate.now());

        // Imprime os dados dos cursos e mentoria
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);


    }
}
