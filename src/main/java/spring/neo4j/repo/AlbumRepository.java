/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spring.neo4j.repo;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;
import spring.neo4j.entidades.Album;

/**
 *
 * @author jefferson
 */
@Repository
public interface AlbumRepository extends GraphRepository<Album>{
    
}
