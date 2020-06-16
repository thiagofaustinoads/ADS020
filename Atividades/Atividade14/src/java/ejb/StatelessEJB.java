/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;

/**
 *
 * @author thiag
 */
@Stateless
public class StatelessEJB implements Serializable {
    
    int contador = 0;

    public StatelessEJB() {
        System.out.println("Criando o stateless...");
    }
     public int invocar(){
         System.out.println("Invocando o stateless...");
         
         return ++contador;
     }
     
     @PostConstruct
     public void iniciar(){
         System.out.println("Iniciando o stateless...");
     }
     
     @PreDestroy
     public void finalizar(){
         System.out.println("Finalizando o stateless...");
     }
}