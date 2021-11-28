package com.maique.domain.repositorio;

import com.maique.domain.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.transaction.annotation.Transactional;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class Clientes {

    @Autowired
    private EntityManager entityManager;

    @Transactional //para dizer esse método vai gerar uma transação no db
    public Cliente salvar(Cliente cliente){
        entityManager.persist(cliente);
        return cliente;
    }

    @Transactional
    public Cliente atualizar(Cliente cliente){
        entityManager.merge(cliente);
        return cliente;
    }

    @Transactional
    public void deletar(Cliente cliente){
        if(!entityManager.contains(cliente)){
            cliente = entityManager.merge(cliente);
        }
        entityManager.remove(cliente);
    }

    @Transactional
    public void deletar(Integer id){
        Cliente cliente = entityManager.find(Cliente.class, id);
        deletar(cliente);
    }

    @Transactional(readOnly = true)
    public List<Cliente> buscarPorNome(String nome){
        String jpql = " select c from Cliente c where c.nome like :nome "; //selecione o cliente quando for esse nome passado
        TypedQuery<Cliente> query = entityManager.createQuery(jpql, Cliente.class);
        query.setParameter("nome", "%" + nome +"%"); //o primeiro argumento (nome) vai receber o 2 , q está concatenado com os % pra pegar tudo com aquele nome
        return query.getResultList();
    }

    @Transactional(readOnly = true)
    public List<Cliente> obterTodos(){
        return entityManager.createQuery("from Cliente", Cliente.class).getResultList();
    }
}
