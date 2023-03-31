import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa p = new Pessoa();
        Aluno a = new Aluno();
        Professor pr = new Professor();

        p.getNome();
        System.out.println("""
                Olá!
                Digite 1 se você for aluno;
                Digite 2 se você for professor;
                """);

            int opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o seu nome: ");
                    a.setNome(sc.next());
                    System.out.println("Digite a senha: ");
                    a.setSenha(sc.nextInt());
                    System.out.println("O Aluno se chama: " + a.getNome());
                    break;
                case 2:
                    System.out.println("Digite o seu nome: ");
                    pr.setNome(sc.next());
                    System.out.println("Digite a sua especialização: ");
                    pr.setEspecializacao(sc.next());
                    System.out.println("o professor se chama: " + pr.getNome() + ", com especialização em: " + pr.getEspecializacao());
                    break;
            }

    }
}