package br.com.diodesafioquebec.v1.mapper;

import br.com.diodesafioquebec.cliente.ClienteModel;
import br.com.diodesafioquebec.v1.model.ClienteRequest;

public class ClienteMapper {
    public static ClienteModel mapToClienteModel(ClienteRequest clienteRequest) {
        return ClienteModel.builder()
                .cpf(clienteRequest.getCpf())
                .idade(clienteRequest.getIdade())
                .localizacao(clienteRequest.getLocalizacao())
                .nome(clienteRequest.getNome())
                .salario(clienteRequest.getSalario())
                .build();
    }
}
