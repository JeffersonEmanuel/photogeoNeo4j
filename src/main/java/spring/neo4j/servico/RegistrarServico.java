/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spring.neo4j.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.neo4j.repo.PesssoaRepository;

/**
 *
 * @author jefferson
 */
@Component
public class RegistrarServico {
    
    @Autowired
    private PesssoaRepository repo;

    public PesssoaRepository getRepo() {
        return repo;
    }

    public void setRepo(PesssoaRepository repo) {
        this.repo = repo;
    }
    
    
}
