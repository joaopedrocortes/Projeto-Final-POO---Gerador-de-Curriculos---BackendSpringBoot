package curriculo;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;

@Service
public class CurriculoService {

    public byte[] gerarCurriculoPdf(Curriculo curriculo) {
        Document document = new Document();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        try {
            PdfWriter.getInstance(document, byteArrayOutputStream);
            document.open();


            Font fonteTitulo = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 22, BaseColor.BLACK);
            Paragraph nome = new Paragraph(curriculo.getNome(), fonteTitulo);
            nome.setAlignment(Element.ALIGN_CENTER);
            document.add(nome);

            Font fonteContato = FontFactory.getFont(FontFactory.HELVETICA, 12, BaseColor.DARK_GRAY);
            String textoContato = "";


            if (curriculo.getEmail() != null) textoContato += curriculo.getEmail();
            if (curriculo.getTelefone() != null) textoContato += " | " + curriculo.getTelefone();
            if (curriculo.getEndereco() != null) textoContato += " | " + curriculo.getEndereco();

            Paragraph contato = new Paragraph(textoContato, fonteContato);
            contato.setAlignment(Element.ALIGN_CENTER);
            document.add(contato);

            document.add(new Paragraph(" ")); // Pular linha
            document.add(new LineSeparator()); // Linha horizontal
            document.add(new Paragraph(" "));


            if (curriculo.getExperiencia() != null && !curriculo.getExperiencia().isEmpty()) {
                Font fonteSecao = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 16, BaseColor.BLACK);
                document.add(new Paragraph("EXPERIÊNCIA PROFISSIONAL", fonteSecao));
                document.add(new Paragraph(" "));

                for (Experiencia exp : curriculo.getExperiencia()) {
                    Font fonteCargo = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12);
                    document.add(new Paragraph(exp.getCargo() + " - " + exp.getEmpresa(), fonteCargo));

                    Font fonteDescricao = FontFactory.getFont(FontFactory.HELVETICA, 11);
                    document.add(new Paragraph(exp.getDescricao(), fonteDescricao));
                    document.add(new Paragraph(" "));
                }
                document.add(new LineSeparator());
                document.add(new Paragraph(" "));
            }


            if (curriculo.getFormacao() != null && !curriculo.getFormacao().isEmpty()) {
                Font fonteSecao = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 16, BaseColor.BLACK);
                document.add(new Paragraph("FORMAÇÃO ACADÊMICA", fonteSecao));
                document.add(new Paragraph(" "));

                for (Formacao form : curriculo.getFormacao()) {
                    document.add(new Paragraph(form.getCurso() + " - " + form.getInstituicao()));
                    document.add(new Paragraph("Nível: " + form.getFormacaoAcademica()));
                    document.add(new Paragraph(" "));
                }
                document.add(new LineSeparator());
                document.add(new Paragraph(" "));
            }


            if (curriculo.getHabilidades() != null && !curriculo.getHabilidades().isEmpty()) {
                Font fonteSecao = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 16, BaseColor.BLACK);
                document.add(new Paragraph("HABILIDADES", fonteSecao));

                com.itextpdf.text.List lista = new com.itextpdf.text.List(com.itextpdf.text.List.UNORDERED);
                for (Habilidades hab : curriculo.getHabilidades()) {
                    lista.add(new ListItem(hab.getHabilidade()));
                }
                document.add(lista);
            }

        } catch (DocumentException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao gerar PDF: " + e.getMessage());
        } finally {
            document.close();
        }

        return byteArrayOutputStream.toByteArray();
    }
}
