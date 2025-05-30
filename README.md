# Projeto Web Services com Spring Boot e JPA / Hibernate

Este projeto é um sistema de backend RESTful construído com Java e Spring Boot. Ele simula uma loja virtual simples, com entidades como usuários, pedidos, produtos e categorias.

## 🔧 Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database (ambiente de teste)
- Maven

## 📦 Funcionalidades Implementadas

### 1. **Cadastro de Usuários**
- Inserção de usuários com nome, e-mail, telefone e senha.
- Listagem e busca por ID.
- Atualização de dados.
- Remoção com tratamento de exceções (inclusive de integridade referencial).

### 2. **Gestão de Pedidos (Orders)**
- Criação de pedidos associados a usuários.
- Listagem de todos os pedidos ou por ID.
- Associação de itens ao pedido com quantidade e preço.
- Cálculo de subtotal e total do pedido.

### 3. **Produtos e Categorias**
- Inserção de produtos com nome, descrição, preço e imagem.
- Associação de produtos a múltiplas categorias (relacionamento Many-to-Many).
- Listagem de produtos com suas categorias associadas.

### 4. **Itens do Pedido (OrderItems)**
- Entidade intermediária com atributos extras (`quantity`, `price`).
- Associação entre pedidos e produtos com chave composta (`OrderItemPK`).

### 5. **Pagamentos**
- Associação One-to-One entre `Order` e `Payment`.
- Inclusão de data de pagamento no pedido.

### 6. **Tratamento de Exceções**
- `ResourceNotFoundException` para entidades não encontradas.
- `DatabaseException` para erros de integridade de banco.
- Handler global com respostas padronizadas (`StandardError`).

### 7. **Seeding de Banco**
- Banco de dados de teste (H2) é automaticamente populado com dados iniciais para testes e simulações.

---

## 📂 Estrutura de Camadas

- **Entities**: mapeamento das entidades JPA.
- **Repositories**: interfaces para persistência de dados.
- **Services**: regras de negócio e acesso ao repositório.
- **Resources**: controladores REST.
- **Exceptions**: tratamento de erros centralizado.

---

## 🧪 Banco de Dados

- H2 Database com console habilitado em `/h2-console`.
- Configuração no perfil `test` com inicialização automática dos dados.

---

## 📌 Como executar

```bash
# Clone o repositório
git clone https://github.com/seu-usuario/seu-repositorio.git

# Navegue até o projeto
cd nome-do-projeto

# Execute a aplicação
./mvnw spring-boot:run
