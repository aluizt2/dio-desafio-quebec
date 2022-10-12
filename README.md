
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
- \*\*\* Clientes com menos de 30 anos. Residindo em SP

### Uso do aplicativo:

A aplicação deve receber os seguintes dados como entrada:

##### Entrada

```json
{
  "cpf": "27053069001",
  "idade": 47,
  "localizacao": "SP",
  "nome": "Alexandre Tavares",
  "salario": 100000
}
```

Para simplificar, considere que sempre receberemos os dados corretos (tipos e formatos).
E deve responder os seguintes dados:

##### saida

```json
{
    "nome": "Alexandre Tavares",
    "emprestimos": [
        {
            "tipo": "PESSOAL",
            "taxa": 4
        },
        {
            "tipo": "CONSIGNADO",
            "taxa": 2
        }
    ]
}
```

- [x] Utilizado Facade.
- [x] Utilizado Strategy.
- [x] Swagger através de annotations.

![image](https://user-images.githubusercontent.com/115638943/195381094-1e8e6fd0-6e6b-41e3-81f5-2c759cf1e563.png)
