package aula05_pratica;
import java.util.ArrayList;

public class Turma {
    
    private ArrayList<Aluno> alunos;

    public Turma(){
        alunos = new ArrayList<Aluno>();
    }

    public void inserirAluno(Aluno a){
        alunos.add(a);
        System.out.println("Aluno inserido na turma!");
    }

    public double calcularMediaTurma(){
        double mediaTurma = 0;
        for(Aluno a : alunos){
            mediaTurma += a.calcularMedia();
        }
        mediaTurma = mediaTurma / alunos.size();
        return mediaTurma;
    }
}
