/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.modelo.controller;

import br.com.modelo.negocio.Marca;
import br.com.modelo.persistencia.MarcaDAOJDBC;
import br.com.modelo.persistencia.MarcaDao;
import java.util.List;

/**
 *
 * @author leticia_macena
 */
public class MarcaController {
      
    public void inserir(Marca m) {
        MarcaDao md = new MarcaDAOJDBC();
        md.inserir(m);
    }
    

    public void atualizar(Marca m) {
        MarcaDao md = new MarcaDAOJDBC();
        md.atualizar(m);
    }

    public void excluir(int id) {
        MarcaDao md = new MarcaDAOJDBC();
        md.excluir(id);
    }

    public List<Marca> getMarcas() {
        MarcaDao md = new MarcaDAOJDBC();
        return md.getMarcas();
    }

    List<Marca> getMarcasByNome(String nome) {
        MarcaDao md = new MarcaDAOJDBC();
        return md.getMarcasByNome(nome);
    }

    Marca getMarcaById(int id) {
        MarcaDao md = new MarcaDAOJDBC();
        return md.getMarcaById(id);
    }
}

