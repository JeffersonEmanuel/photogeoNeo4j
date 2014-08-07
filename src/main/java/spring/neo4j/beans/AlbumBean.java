package spring.neo4j.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import spring.neo4j.entidades.Album;
import spring.neo4j.servico.RegistrarServicoAlbum;

/**
 *
 * @author jefferson
 */
@ManagedBean
@SessionScoped
public class AlbumBean implements Serializable{
    
    private Album album = new Album();
        
    private List<Album> albums = new ArrayList<Album>();
    
    @ManagedProperty(value = "#{registrarServicoAlbum}")
    private RegistrarServicoAlbum servico;


    
    public String salvar () {
        this.servico.getAlbumRepository().save(this.album);
        this.album = new Album();
        return "";
    } 

    public String abrirFotosDoAlbum () {
        return "fotografia.xhtml";
    }
    
    
    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public RegistrarServicoAlbum getServico() {
        return servico;
    }

    public void setServico(RegistrarServicoAlbum servico) {
        this.servico = servico;
    }

    
}
