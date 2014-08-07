/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spring.neo4j.entidades;

import org.neo4j.graphdb.Direction;
import org.springframework.data.neo4j.annotation.Fetch;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

/**
 *
 * @author jefferson
 */
@NodeEntity
public class Face {
    
    @GraphId
    private Long id;
    
      // Localização x da face na Fotografia
    private float x;
    
      // Localização y da face na Fotografia
    private float y;    

    
    // Altura da face na Fotografia
    private float altura;
    
    // Largura da face na Fotografia
    private float largura;

    // Pessoa a qual a face pertence
    @Fetch
    @RelatedTo(type = "Face_Pertencente_A", direction = Direction.OUTGOING)
    private Pessoa pessoa = new Pessoa();
    
     // fotografia a qual a face foi encontrada
    @Fetch
    @RelatedTo(type = "Face_Encontrada_Em", direction = Direction.INCOMING)
    private Fotografia fotografia = new Fotografia();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Fotografia getFotografia() {
        return fotografia;
    }

    public void setFotografia(Fotografia fotografia) {
        this.fotografia = fotografia;
    }
 
    
    
}
