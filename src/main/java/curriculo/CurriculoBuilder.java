package curriculo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CurriculoBuilder {
    private Curriculo curriculo = new Curriculo();

    public CurriculoBuilder nome(String nome) {curriculo.setNome(nome); return this; }
    public CurriculoBuilder email(String email) {curriculo.setEmail(email); return this; }
    public CurriculoBuilder cpf(String cpf) {curriculo.setNome(cpf); return this; }
    public CurriculoBuilder endereco(String endereco) {curriculo.setNome(endereco); return this; }
    public CurriculoBuilder telefone(String telefone) {curriculo.setNome(telefone); return this; }
    public CurriculoBuilder dataNascimento(LocalDateTime data) { curriculo.setDataNascimento(LocalDate.from(data)); return this; }
    public CurriculoBuilder addSecao(Secao s) {curriculo.getSecao().add(s); return this; }
    public Curriculo build() { return curriculo; }
}
