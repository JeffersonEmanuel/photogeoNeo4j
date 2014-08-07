/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spring.neo4j.beans;

import com.drew.imaging.ImageProcessingException;
import com.drew.metadata.Tag;
import com.google.common.collect.Lists;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import org.primefaces.event.FileUploadEvent;
import org.xml.sax.SAXException;
import spring.neo4j.entidades.Fotografia;
import spring.neo4j.imagens.CriarImagem;
import spring.neo4j.servico.RegistrarServicoFotografia;
import spring.neo4j.metadados.ExtrairMetadados;

/**
 *
 * @author jefferson
 */
@ManagedBean
@SessionScoped
public class FotografiaBean implements Serializable{
    
    private Fotografia fotografia = new Fotografia();
    
    private List<Fotografia> fotografias = new ArrayList<Fotografia>();
    
    @ManagedProperty(value = "#{registrarServicoFotografia}")
    private RegistrarServicoFotografia servicoFotografia;

    public Fotografia getFotografia() {
        return fotografia;
    }

    public void setFotografia(Fotografia fotografia) {
        this.fotografia = fotografia;
    }

    public List<Fotografia> getFotografias() {
        this.fotografias = Lists.newArrayList(this.servicoFotografia.getFotografiaRepository().findAll());
        return fotografias;
    }

    public void setFotografias(List<Fotografia> fotografias) {
        this.fotografias = fotografias;
    }

    public RegistrarServicoFotografia getServicoFotografia() {
        return servicoFotografia;
    }

    public void setServicoFotografia(RegistrarServicoFotografia servicoFotografia) {
        this.servicoFotografia = servicoFotografia;
    }
    
    public String salvar() {
        this.servicoFotografia.getFotografiaRepository().save(this.fotografia);
        this.fotografia = new Fotografia();
        return "templates/template.xhtml";
    }
    
    private CriarImagem ci = new CriarImagem();
    public String fotoComAlbum (FileUploadEvent event) throws ImageProcessingException, IOException {
        ci.criarImagem(event);
    return "templates/template.xhtml";
    }
    
    
}
