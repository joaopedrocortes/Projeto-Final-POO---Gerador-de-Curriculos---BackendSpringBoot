package curriculo;

public class SecaoEducacao extends Secao{
    private String instituicao;
    private String grau;
    private String formacaoAcademica;

    public SecaoEducacao() {

    }

    public String getInstituicao() {
        return this.instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getGrau() {
        return this.grau;
    }

    public void setGrau() {
        this.grau = grau;
    }

    public String getFormacaoAcademica() {
        return this.formacaoAcademica;
    }

    public void setFormacaoAcademica() {
        this.formacaoAcademica = formacaoAcademica;
    }

}
