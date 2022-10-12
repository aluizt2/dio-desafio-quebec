package br.com.diodesafioquebec.regrasemprestimo;

import br.com.diodesafioquebec.cliente.ClienteModel;
import br.com.diodesafioquebec.regrasemprestimo.commons.models.PossibilidadeDeEmprestimoModel;

import java.util.Optional;

public interface AnalisaCombinacao {

	Optional<PossibilidadeDeEmprestimoModel> aceita(ClienteModel clienteModel);
}
