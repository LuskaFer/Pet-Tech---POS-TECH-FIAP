# Nome

Esse projeto é um sistema de gestão de produtos de uma pet shop desenvolvido em Java com Spring Boot. Ele permite adicionar e gerenciar produto com seus respectivos "id's", nome, preço, descrição e url da imagem.

## 🚀 Funcionalidades

- **CRUD de Produtos**: Permite adicionar, visualizar, atualizar e excluir produtos.


## 🛠️ Tecnologias

- **Java** - Linguagem principal.
- **Spring Boot** - Framework de desenvolvimento.
- **H2 Database** - Banco de dados em memória para testes rápidos.


## 📦 Estrutura do Projeto
PosTech  
├── src  
│   ├── main  
│   │   ├── java  
│   │   │   └── br.com.fiap.pet_tech  
│   │   │       ├── dto  
│   │   │       ├── entity  
│   │   │       ├── service  
│   │   │       └── controller  
│   │   │           └── exception  
│   │   └── resources  
│   │       ├── application.properties  
│   │       └── application-dev.properties  
└── README.md  

- **`dto`**: Contém as classes de Data Transfer Objects.
- **`entity`**: Contém as entidades mapeadas para o banco de dados.
- **`service`**: Lógica de negócio.
- **`controller`**: Controladores REST.
- **`resources`**: Configurações e arquivos de dados iniciais.

## 📝 Pré-requisitos

- **Java 17** ou superior
- **Maven**


### Produto

1. `GET /produtos` - Lista todos os produtos.
2. `POST /produtos` - Cria um novo produtos.
3. `GET /produtos/{id}` - Lista um produtos pelo ID.
4. `PUT /produtos/{id}` - Atualiza um produtos.
5. `DELETE /produtos/{id}` - Remove um produtos.


