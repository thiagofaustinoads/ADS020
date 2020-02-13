/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.persistencia;

import java.util.List;

/**
 *
 * @author thiag
 */
public interface DAO<T> {
    List<T> listar() throws DadosException;
    void incluir(T entidade) throws DadosException;
    void alterar(T entidade) throws DadosException;
    void excluir(int id) throws DadosException;
    T consultar(int id) throws DadosException;
}
