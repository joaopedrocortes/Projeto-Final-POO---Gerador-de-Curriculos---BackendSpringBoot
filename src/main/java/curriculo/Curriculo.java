package curriculo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Curriculo {
    private String nome;
    private String email;
    private List<Experiencia> experiencia = new ArrayList<>();
    private List<Formacao> formacao = new ArrayList<>();
    private List<Habilidades> habilidade = new ArrayList<>();
    private CurriculoStatus status;
    private String cpf;
    private String endereco;
    private LocalDate dataNascimento;
    private String telefone;


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(LocalDate data) {
        this.dataNascimento = data;
    }

    public List<Experiencia> getExperiencia() {
        return this.experiencia;
    }

    public void setExperiencia(List<Experiencia> experiencia) {
        this.experiencia = experiencia;
    }

    public List<Formacao> getFormacao() {
        return this.formacao;
    }

    public void setFormacao(List<Formacao> formacao) {
        this.formacao = formacao;
    }

    public List<Habilidades> getHabilidades() {
        return this.habilidade;
    }

    public void setHabilidades(List<Habilidades> habilidade) {
        this.habilidade = habilidade;
    }

    public CurriculoStatus getStatus() {
        return this.status;
    }

    public void setStatus(CurriculoStatus status) {
        this.status = status;
    }

}
