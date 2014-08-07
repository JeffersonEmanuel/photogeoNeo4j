package spring.neo4j.beans;

import com.google.common.collect.Lists;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import static org.neo4j.cypherdsl.CypherQuery.p;
import static org.neo4j.cypherdsl.CypherQuery.param;
import spring.neo4j.entidades.Pessoa;
import spring.neo4j.servico.RegistrarServico;

/**
 *
 * @author jefferson
 */
@ManagedBean
@SessionScoped
public class PessoaBean implements Serializable{
    
    private Pessoa pessoa = new Pessoa();
        
    private List<Pessoa> pessoas = new ArrayList<Pessoa>();
    
    @ManagedProperty(value = "#{registrarServico}")
    private RegistrarServico servico;

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<Pessoa> getPessoas() {
        this.pessoas = Lists.newArrayList(this.servico.getRepo().findAll());
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public RegistrarServico getServico() {
        return servico;
    }

    public void setServico(RegistrarServico servico) {
        this.servico = servico;
    }
    
    
    public String salvar () {
//        System.out.println(this.servico.getRepo().getP().getEndereco().getEstado());
        this.servico.getRepo().save(this.pessoa);
        this.pessoa = new Pessoa();
        System.out.println("Certo");
        return "";
    } 
    
    
}
