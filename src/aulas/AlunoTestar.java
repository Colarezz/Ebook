package aulas;
public class AlunoTestar {
    public static void main(String[] args) {
        // Instaciar classe Aluno
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Helio");
        System.out.println(aluno1.getNome());
        aluno1.setIdade(15);
    }
}