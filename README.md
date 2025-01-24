# API RESTful de Empréstimos
**Este projeto não conta com uma interface visual**

Este projeto é uma API RESTful desenvolvida em Java utilizando o framework Spring. Ele foi criado com objetivos de estudo, focando no desenvolvimento de uma aplicação CRUD que manipula informações de empréstimos. A API responde a requisições HTTP e retorna dados em formato JSON, sendo compatível com ferramentas como Postman ou outros aplicativos similares.

Este projeto foi baseado no conceito de outro sistema chamado "Seras / Sistema de Gerenciamento de Empréstimos", que possuía uma interface visual primitiva e funcionalidades mais amplas. No entanto, esta API não possui interface gráfica e foi projetada exclusivamente para fins de estudo, enfatizando o backend e a interação via API.

---

## Funcionalidades

- **CRUD Completo**:

  - Listar todos os registros (GET).
  - Listar um registro específico (GET).
  - Criar novos registros (POST).
  - Atualizar registros existentes (PUT).
  - Remover registros individuais (DELETE).

- **Modelos Implementados**:

  - `Emprestimo`
  - `Usuario`
  - `Cliente`
  - `PropostaEmprestimo`

- **Arquitetura do Sistema**:

  - Segue o padrão MVC (Model-View-Controller).
  - Utiliza os componentes **Controller**, **Repository** e **Model** para organização do código.

---

## Tecnologias Utilizadas

- **Java 17**: Linguagem de programação utilizada no desenvolvimento.
- **Spring Framework**: Framework principal para criação da API.
- **Maven**: Ferramenta utilizada para gerenciamento de dependências e build do projeto.
- **Spring Tool Suite 4**: IDE utilizada para desenvolver o projeto.
- **Postman**: Ferramenta sugerida para testar as requisições da API.

---

## Como Utilizar

1. **Configuração Inicial**:

   - Clone este repositório em sua máquina local.
   - Configure o banco de dados no arquivo `application.properties`.
   - Certifique-se de que o ambiente de desenvolvimento esteja configurado com Java 17, Maven e Spring Tool Suite 4.

2. **Testando a API**:

   - Use ferramentas como Postman para realizar as requisições HTTP (GET, POST, PUT, DELETE).
   - As rotas padrão para os modelos incluem:
     - `/clientes`
     - `/usuarios`
     - `/emprestimos`
     - `/propostas`

3. **Exemplo de JSONs**:

   - **POST Cliente**:

     ```json
     {
       "nome": "João Silva",
       "cpf": "12345678900",
       "email": "joao.silva@email.com",
       "telefone": "(11) 91234-5678",
       "endereco": "Rua das Flores, 123"
     }
     ```

   - **PUT Emprestimo**:

     ```json
     {
       "id": 1,
       "data_inicio": "2025-02-01T12:00:00",
       "numeroParcelas": 24,
       "propostaId": 1,
       "saldoDevedor": 4600.00,
       "taxaJurosMensal": 1.3,
       "valorAprovado": 5000.00,
       "clienteId": 1
     }
     ```

4. **Executando o Sistema**:

   - Inicie a aplicação no Spring Tool Suite.
   - Acesse os endpoints configurados para interagir com o sistema.
   - Adicione as dependências necessárias via Maven.
   - Inicialize o SGBD e o Projeto.
   - Execute as requisições POST PUT GET e DELETE.

---

## Relação com o Projeto "Seras"

A API foi inspirada no projeto "Seras", que incluía uma interface gráfica em JSP e funcionalidades adicionais, como gerenciamento de sessões com cookies e registro de logs. Diferentemente do projeto original, esta API se concentra na construção de um backend funcional para gerenciar dados relacionados a empréstimos de maneira prática e eficiente.

---

## Considerações Finais

Este projeto foi criado exclusivamente para fins de estudo, ajudando a compreender os conceitos fundamentais de APIs RESTful, integração com bancos de dados e desenvolvimento de sistemas CRUD em Java com Spring.

Contribuições ou melhorias são sempre bem-vindas!

## Contato
Caso tenha dúvidas ou sugestões, entre em contato pelo e-mail caiothurlerrr@gmail.com ou c.thurlerr@gmail.com.
