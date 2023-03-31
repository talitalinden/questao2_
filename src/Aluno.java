public class Aluno extends Pessoa {
    private String nome;
    private int senha;

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getSenha() {
        return senha;
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }
}
