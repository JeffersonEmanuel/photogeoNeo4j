/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spring.neo4j.entidades;

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
public class Album {
    
    
    // id do Album de Fotografia
    @GraphId
    private Long id;

    // nome do Album
    private String nome;
    
    // Descrição para o Album 
    private String descricao;
    
    // Localização geografica do Album
    private String geom;
    
//    // Fotografia capa do album
//    @RelatedTo(type = "Fotografia_Capa", direction = Direction.OUTGOING)
//    private Fotografia capa;
//    // Lista com os eventos contidos dentro do Album
//    @RelatedTo(type = "Evento_No_Album", direction = Direction.INCOMING)
//    private List<Evento> evento;
    public String getGeom() {
        return geom;
    }

    public void setGeom(String geom) {
        this.geom = geom;
    }
    
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
