package curriculo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Curriculo {
    private String nome;
    private String email;
    private List<Secao> secao = new ArrayList<>();
    private CurriculoStatus status;
    private String cpf;
    private String endereco;
    private LocalDate dataNascimento;
    private String telefone;

    public Curriculo() {

    }

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

    public List<Secao> getSecao() {
        return this.secao;
    }

    public void setSecao(List<Secao> secao) {
        this.secao = secao;
    }

    public CurriculoStatus getStatus() {
        return this.status;
    }

    public void setStatus(CurriculoStatus status) {
        this.status = status;
    }

}
