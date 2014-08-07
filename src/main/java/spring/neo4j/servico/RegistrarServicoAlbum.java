/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spring.neo4j.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.neo4j.repo.AlbumRepository;

/**
 *
 * @author jefferson
 */
@Component
public class RegistrarServicoAlbum {
    
    @Autowired
    private AlbumRepository albumRepository;

    public AlbumRepository getAlbumRepository() {
        return albumRepository;
    }

    public void setAlbumRepository(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }
    
    
    
}
