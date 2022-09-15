import javax.xml.crypto.Data;

public class Aluno {
    private String nome;
    private Data dataDeNascimento;
    private String email;
   
    public Aluno(String nomeAluno, Object object) {
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Data getDataDeNascimento() {
        return dataDeNascimento;
    }
    public void setDataDeNascimento(Data dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}