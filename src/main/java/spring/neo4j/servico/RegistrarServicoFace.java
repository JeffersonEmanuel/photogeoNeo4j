/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spring.neo4j.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.neo4j.repo.FaceRepository;

/**
 *
 * @author jefferson
 */
@Component
public class RegistrarServicoFace {
    
    @Autowired
    private FaceRepository fr;

    public FaceRepository getFr() {
        return fr;
    }

    public void setFr(FaceRepository fr) {
        this.fr = fr;
    }
    
    
}
