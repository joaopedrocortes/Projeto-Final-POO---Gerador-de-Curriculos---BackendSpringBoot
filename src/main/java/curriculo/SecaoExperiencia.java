package curriculo;

public class SecaoExperiencia extends Secao{
    private String descricao;
    private String empresa;
    private String historicoTrabalho;

    public SecaoExperiencia() {

    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEmpresa() {
        return this.empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getHistoricoTrabalho() {
        return this.historicoTrabalho;
    }

    public void setHistoricoTrabalho(String historicoTrabalho) {
        this.historicoTrabalho = historicoTrabalho;
    }
}
