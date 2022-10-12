
# Desafio DIO Quebec

A proposta é de fornecer a uma pessoa os tipos de empréstimo adequados para ela, dadas algumas variáveis:

Devemos fornecer os seguintes tipos de empréstimo:

- Empréstimo pessoal. Taxa de juros: 4%
- Empréstimo com Garantia. Taxa de juros: 3%
- Empréstimo consignado. Taxa de juros: 2%

Abaixo estão listadas as regras de negócio para concessão de empréstimo com base no perfil da pessoa:

|                          | Empréstimo Pessoal  | Empréstimo com Garantia | Folha de pagamento |
| ------------------------ | ------------- | :-----------------: | ------- |
| Renda <= 3000           | SIM           |       SIM\*\*\*     | NÃO      |
| Renda > 3000 & < 5000   | SIM           |        SIM\*\*      | NÃO      |
| Renda => 5000           | SIM           |         SIM\*       | SIM     |

- \* Clientes com menos de 30 anos.
- \*\* Clientes residentes em SP (código do estado de São Paulo no Brasil)
- \*\*\* Clientes com menos de 30 anos. residindo em SP

### Uso do aplicativo:

A aplicação deve receber os seguintes dados como entrada:

##### Entrada

```json
{
  "customer": {
    "name": "Erikaya",
    "cpf": "123.456.789-10",
    "age": 29,
    "location": "SP",
    "income": 3000
  }
}
```

Para simplificar, considere que sempre receberemos os dados corretos (tipos e formatos)_
E deve responder os seguintes dados:

##### saida

```json
{
  "customer": "Erikaya",
  "loans": [
    {
      "type": "personal",
      "taxes": 1
    }
  ]
}
```
