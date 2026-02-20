package com.projeto.buscarCep.service.implementacao;

import com.projeto.buscarCep.model.Cliente;
import com.projeto.buscarCep.service.ClienteService;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImplementar implements ClienteService {
    @Override
    public Iterable<Cliente> buscarTodos() {
        return null;
    }

    @Override
    public Cliente buscarPorId(Long id) {
        return null;
    }

    @Override
    public void inserir(Cliente cliente) {

    }

    @Override
    public void atualizar(Long id, Cliente cliente) {

    }

    @Override
    public void deletar(Long id) {

    }
}
