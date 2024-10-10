package aula05_pratica;

public class EscolaView {
    public static void main (String[] args){

        Prova p1 = new Prova();
        p1.setNotaParte1(3.5);
        p1.setNotaParte2(3.0);
        System.out.println("Nota total p1 => " + p1.calcularNotaTotal());

        Prova p2 = new Prova();
        p2.setNotaParte1(4.5);
        p2.setNotaParte2(3.5);
        System.out.println("Nota total p2 => " + p2.calcularNotaTotal());

        Prova p3 = new Prova();
        p3.setNotaParte1(5.0);
        p3.setNotaParte2(4.5);
        System.out.println("Nota total p3 => " + p3.calcularNotaTotal());

        Prova p4 = new Prova();
        p4.setNotaParte1(2.5);
        p4.setNotaParte2(0.5);
        System.out.println("Nota total p4 => " + p4.calcularNotaTotal());
        
        Prova p5 = new Prova();
        p5.setNotaParte1(4.0);
        p5.setNotaParte2(3.5);
        System.out.println("Nota total p5 => " + p5.calcularNotaTotal());

        Prova p6 = new Prova();
        p6.setNotaParte1(4.8);
        p6.setNotaParte2(4.2);
        System.out.println("Nota total p6 => " + p6.calcularNotaTotal());

        System.out.println("");

        Aluno a1 = new Aluno();
        a1.setProva1(p1);
        a1.setProva2(p2);
        System.out.println("Média do aluno 1 => " + a1.calcularMedia());

        Aluno a2 = new Aluno();
        a2.setProva1(p3);
        a2.setProva2(p4);
        System.out.println("Média do aluno 2 => " + a2.calcularMedia());

        Aluno a3 = new Aluno();
        a3.setProva1(p5);
        a3.setProva2(p6);
        System.out.println("Média do aluno 3 => " + a3.calcularMedia());

        System.out.println("");

        Turma t1 = new Turma();
        t1.inserirAluno(a1);
        t1.inserirAluno(a2);
        t1.inserirAluno(a3);
        System.out.println("");
        System.out.println("---------------------------------------");
        System.out.printf("Média da turma => %.2f%n", t1.calcularMediaTurma());
        System.out.println("---------------------------------------");

    }
}