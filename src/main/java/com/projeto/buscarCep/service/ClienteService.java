package com.projeto.buscarCep.service;

import com.projeto.buscarCep.model.Cliente;

public interface ClienteService {

    Iterable<Cliente> buscarTodos();
    Cliente BuscarPortId(Long id);

    void inserir(Cliente cliente);
    void atualizar(Long id, Cliente cliente);
    void deletar(Long id);
}