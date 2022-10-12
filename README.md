
# Desafio DIO Quebec

A proposta é de fornecer a uma pessoa os tipos de empréstimo adequados para ela, dadas algumas variáveis:

Devemos fornecer os seguintes tipos de empréstimo:

- Empréstimo pessoal. Taxa de juros: 4%
- Empréstimo com Garantia. Taxa de juros: 3%
- Empréstimo consignado. Taxa de juros: 2%

Abaixo estão listadas as regras de negócio para concessão de empréstimo com base no perfil da pessoa:

|                          | Empréstimo Pessoal  | Empréstimo com Garantia | Folha de pagamento |
| ------------------------ | ------------- | :-----------------: | ------- |
| Renda <= 3000           | SIM           |       Yes\*\*\*     | No      |
| Renda > 3000 & < 5000   | SIM           |        Yes\*\*      | No      |
| Renda => 5000           | SIM           |         Yes\*       | Yes     |

- \* Clients under 30 y.o.
- \*\* Clients residing in SP (São Paulo state code in Brazil)
- \*\*\* Clients under 30 y.o. residing in SP

### App usage:

The application must receive the following data as input:

##### input

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

_For the sake of simplicity, consider we'll always receive the correct data (types and formats)_

And must respond the following data:

##### output

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
