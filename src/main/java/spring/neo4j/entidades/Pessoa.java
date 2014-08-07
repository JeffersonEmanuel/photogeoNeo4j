package spring.neo4j.entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.neo4j.graphdb.Direction;
import org.springframework.data.neo4j.annotation.Fetch;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author jefferson
 */
@NodeEntity
public class Pessoa {
    
    @GraphId
    private Long id;
    
    private String nome;
    
//    @Fetch
//    @RelatedTo(type = "Foto_Tirada_Em", direction = Direction.OUTGOING)
//    private Endereco endereco = new Endereco();

//    @RelatedTo(type = "Face_Pertencente_A", direction = Direction.INCOMING)
//    private List<Face> face = new ArrayList<Face>();
    
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

//    public Endereco getEndereco() {
//        return endereco;
//    }
//
//    public void setEndereco(Endereco endereco) {
//        this.endereco = endereco;
//    }
    
}
