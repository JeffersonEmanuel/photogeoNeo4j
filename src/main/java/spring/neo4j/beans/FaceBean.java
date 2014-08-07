/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spring.neo4j.beans;

import com.google.common.collect.Lists;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import spring.neo4j.entidades.Face;
import spring.neo4j.servico.RegistrarServico;
import spring.neo4j.servico.RegistrarServicoFace;

/**
 *
 * @author jefferson
 */
@ManagedBean
@SessionScoped
public class FaceBean implements Serializable{
    
    private Face face = new Face();
    
    private List<Face> faces = new ArrayList<Face>();
    
    @ManagedProperty(value = "#{registrarServicoFace}")
    private RegistrarServicoFace servico;

    public Face getFace() {
        return face;
    }

    public void setFace(Face face) {
        this.face = face;
    }

    public List<Face> getFaces() {
        faces = Lists.newArrayList(this.servico.getFr().findAll());
        return faces;
    }

    public void setFaces(List<Face> faces) {
        this.faces = faces;
    }

    public RegistrarServicoFace getServico() {
        return servico;
    }

    public void setServico(RegistrarServicoFace servico) {
        this.servico = servico;
    }

    public String salvar () {
        this.servico.getFr().save(this.face);
        this.face = new Face();
        System.out.println("Face Salva");
        return "";
    }
    
    
    
}
