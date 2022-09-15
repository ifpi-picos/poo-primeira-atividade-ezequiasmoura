import java.sql.Date;

public class Curso {
    private String nome;
    private int cargaHoraria;
    private String modalidade;
    private Date dataInicio;
    private Date dataFim;

    public Curso(String string, String string2, int i, Professor p1) {
	}
	public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }
    public String getModalidade() {
        return modalidade;
    }
    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }
    public Date getDataInicio() {
        return dataInicio;
    }
    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }
    public Date getDataFim() {
        return dataFim;
    }
    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }
    public String getNomeProfessor() {
        return null;
    }
    public void realizarMatricula(Aluno aluno) {
    }
    public String getAlunos() {
        return null;
    }
    
}
