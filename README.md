## Pet Tech | Gestão de Produtos 

Esse projeto é um sistema de gestão de produtos de uma pet shop desenvolvido em Java com Spring Boot. Ele permite adicionar e gerenciar produto com seus respectivos "id's", nome, preço, descrição e url da imagem.

## 🚀 Funcionalidades

- **CRUD de Produtos**: Permite adicionar, visualizar, atualizar e excluir produtos.


## 🛠️ Tecnologias

- **Java** - Linguagem principal.
- **Spring Boot** - Framework de desenvolvimento.
- **H2 Database** - Banco de dados em memória para testes rápidos.


## 📦 Estrutura do Projeto

Pet-Tech 
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
│   └── test  
│       └── java  
│           └── br.com.fiap.pet_tech  
│               └── PetTechApplicationTests  
└── README.md

- **`dto`**: Contém as classes de Data Transfer Objects.
- **`entity`**: Contém as entidades mapeadas para o banco de dados.
- **`service`**: Lógica de negócio.
- **`controller`**: Controladores REST.
- **`resources`**: Configurações e arquivos de dados iniciais.

## 📝 Pré-requisitos

- **Java 17** ou superior
- **Maven**

## Testando com Insomnia:
- **Use o software "Insomnia"** link-> https://insomnia.rest/download
- **Use o padrão "http://localhost:8080/"  descrito conforme o metodo necessário abaixo:


### Produtos CRUD


1. `POST /produtos` - Cria um novo produto. 
exemplo: "http://localhost:8080/produtos"
{
	"id": "*",
	"nome": "*",
	"descricao": "*",
	"preco": *,
	"urlDaImagem": "*"
}
**(** Adicione os parametros conforme necessário para a criação do produto)**

  
2. `GET /produtos` - Lista todos os produtos.
exemplo: http://localhost:8080/produtos/
   
3. `GET /produtos/{id}` - Lista um produto pelo ID.
exemplo: http://localhost:8080/produtos/"*"
**(** Adicione id conforme necessário para encontrar o produto)**

4. `PUT /produtos/{id}` - Atualiza um produto.
exemplo: http://localhost:8080/produtos/"*"
{
	"id": "*",
	"nome": "*",
	"descricao": "*",
	"preco": *,
	"urlDaImagem": "*"
}
**(** Adicione os parametros conforme necessário para a alteração do produto)**
  
5. `DELETE /produtos/{id}` - Remove um produtos.
exemplo: http://localhost:8080/produtos/
**(** Adicione id conforme necessário para deletar o produto)**


