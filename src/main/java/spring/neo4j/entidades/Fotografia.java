/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.neo4j.entidades;

import java.util.Calendar;
import java.util.List;
import org.neo4j.graphdb.Direction;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

/**
 *
 * @author jefferson
 */
@NodeEntity
public class Fotografia {

    @GraphId
    private Long id;

    // Nome da Fotografia
    private String nome;

    // local onde esta armazenada a fotografia
    private String endereco;

    // data em que a fotografia foi capiturada
    private Calendar data;

    // horario em que a fotografia foi capiturada
    private Calendar hora;

    // Altura da Fotografia
    private float altura;

    // Largura da Fotografia
    private float largura;

    // localização geografica da Fotografia
    private String geom;

//    // Lista de faces encontradas na fotografia
//    @RelatedTo(type = "Face_Pertence_A", direction = Direction.INCOMING)
//    private List<Face> faces;
    
    
    // Album ao qual a fotografia Pertence
    @RelatedTo(type = "Fotografia_Em_Evento", direction = Direction.OUTGOING)
    private Album album;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public Calendar getHora() {
        return hora;
    }

    public void setHora(Calendar hora) {
        this.hora = hora;
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

    public String getGeom() {
        return geom;
    }

    public void setGeom(String geom) {
        this.geom = geom;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

}
