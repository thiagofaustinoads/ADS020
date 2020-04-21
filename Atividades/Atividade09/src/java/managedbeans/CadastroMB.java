/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author thiag
 */
@ManagedBean
@RequestScoped
public class CadastroMB {

 
    public CadastroMB() {
    }
    
    public String salvar(){
    
        return "lista";
    }
}
