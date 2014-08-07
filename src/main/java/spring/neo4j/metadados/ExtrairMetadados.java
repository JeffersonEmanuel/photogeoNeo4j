package spring.neo4j.metadados;

import com.drew.imaging.ImageMetadataReader;
import com.drew.imaging.ImageProcessingException;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.Tag;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.primefaces.event.FileUploadEvent;
import spring.neo4j.imagens.PegarImagens;

public class ExtrairMetadados {

    public List<Tag> metadados(FileUploadEvent event) throws ImageProcessingException, IOException {

        PegarImagens imagens = new PegarImagens();
        imagens.selecionarImagens(event.getFile());

        String nomeDaImagem = event.getFile().getFileName();

        File file = new File("/home/jefferson/Área de Trabalho/Imagens/Imagens Processadas/"
                + nomeDaImagem);

        Metadata metadata = ImageMetadataReader.readMetadata(file);
        List<Tag> newList = new ArrayList<Tag>();
        for (Directory directory : metadata.getDirectories()) {
            for (Tag tag : directory.getTags()) {
//                System.out.println(tag);
                newList.add(tag);
            }
        }
        return newList;
    }
}
