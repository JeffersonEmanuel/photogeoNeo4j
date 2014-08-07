/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.neo4j.imagens;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author jefferson
 */
public class PegarImagens implements Serializable {

    public PegarImagens() {
    }

    public void selecionarImagens(UploadedFile upF) {

        try {
            UploadedFile arq = upF;
            InputStream is = new BufferedInputStream(arq.getInputstream());

            File file = new File("/home/jefferson/Área de Trabalho/Imagens/Imagens Processadas/"
                    + arq.getFileName());
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            while (is.available() != 0) {
                fileOutputStream.write(is.read());
            }

            fileOutputStream.close();
        } catch (Exception e) {
        }
    }

}
