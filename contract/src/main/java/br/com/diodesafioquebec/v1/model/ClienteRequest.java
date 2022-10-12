package br.com.diodesafioquebec.v1.model;

import br.com.diodesafioquebec.commons.validate.VerificaSeTemApenasUmaPalavra;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClienteRequest {
	@NotBlank
	@CPF
	private String cpf;
	@NotBlank
	@VerificaSeTemApenasUmaPalavra
	private String nome;
	@Positive
	private int idade;
	@NotBlank
	private String localizacao;
	@Positive
	@NotNull
	private BigDecimal salario;
}
