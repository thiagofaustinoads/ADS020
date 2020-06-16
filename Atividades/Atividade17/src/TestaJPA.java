
import dao.ContatoDAO;
import entidades.Contato;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thiag
 */
public class TestaJPA {
    
    public static void main(String[] args) {
        
        ContatoDAO dao = new ContatoDAO();
        
        Contato contato = new Contato();
        
        contato.setNome("Victor");
        contato.setTelefone(98234567);
        dao.persist(contato);
        
        contato = new Contato();
        
        contato.setNome("Natan");
        contato.setTelefone(98254322);
        dao.persist(contato);
        
        contato = new Contato();
        
        contato.setNome("Arthur");
        contato.setTelefone(982521356);
        dao.persist(contato);
        
        contato.setNome("Jose Alvarenga");
        dao.merge(contato);
        
        contato = dao.find(2);
        dao.remove(contato);
        
        dao.list().forEach((cont) -> {
            System.out.println(cont);
        });
        
        
        System.exit(0);
    }
}