/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spring.neo4j.imagens;

import com.drew.imaging.ImageProcessingException;
import com.drew.metadata.Tag;
import java.io.IOException;
import java.util.List;
import org.primefaces.event.FileUploadEvent;
import spring.neo4j.metadados.ExtrairMetadados;

/**
 *
 * @author jefferson
 */
public class CriarImagem {

    public CriarImagem() {
    }
    
    private ExtrairMetadados extrairMetadados = new ExtrairMetadados();
    
    
    public void criarImagem(FileUploadEvent event) throws ImageProcessingException, IOException {
        List<Tag> tag =  extrairMetadados.metadados(event);
        for (Tag nome : tag) {
            System.out.println(nome.getDirectoryName() + " :-----> "+ 
                    nome.getTagName() + " :-----> " + nome);
        }
    }
}
