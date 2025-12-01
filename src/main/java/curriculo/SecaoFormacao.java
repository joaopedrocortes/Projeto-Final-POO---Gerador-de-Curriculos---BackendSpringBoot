package curriculo;

public class SecaoFormacao extends Secao{
    private String instituicao;
    private String curso;
    private String formacaoAcademica;


    public String getInstituicao() {
        return this.instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCursos(String curso) {
        this.curso = curso;
    }

    public String getFormacaoAcademica() {
        return this.formacaoAcademica;
    }

    public void setFormacaoAcademica(String formacaoAcademica) {
        this.formacaoAcademica = formacaoAcademica;
    }

}
