# Plataforma de Avaliação de Professores

## Descrição

Este projeto é uma plataforma web desenvolvida utilizando **Spring Boot** e **Thymeleaf** que permite aos alunos avaliarem seus professores, fornecendo comentários e notas. O sistema armazena essas avaliações em um banco de dados e exibe os resultados em uma interface amigável e moderna, utilizando **Bootstrap** para o design. O projeto também demonstra a implementação dos padrões de projeto **Strategy** e **Singleton** para cálculos de nota.

## Funcionalidades

- **Formulário de Avaliação**: Os alunos podem inserir o nome do professor, fornecer uma nota e adicionar comentários.
- **Exibição de Avaliações**: Todas as avaliações são exibidas em uma tabela organizada e paginada.
- **Cálculo de Nota**: Implementação de dois tipos de cálculo de nota (simples e ponderada) utilizando o padrão de projeto **Strategy**.
- **Uso do Padrão Singleton**: Garantia de uma única instância para os serviços de cálculo de nota.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **Thymeleaf** para renderização de páginas HTML
- **Bootstrap 5** para estilização responsiva
- **H2 Database** para armazenamento de dados (pode ser alterado para outro banco de dados relacional, como MySQL ou PostgreSQL)
- **JPA/Hibernate** para persistência de dados

## Padrões de Projeto Implementados

### 1. **Strategy**

O padrão Strategy foi utilizado para calcular a média das notas de duas formas diferentes:
- **Média Simples**: Média aritmética das notas fornecidas.
- **Média Ponderada**: As notas podem ter pesos diferentes e o cálculo considera esses pesos.

### 2. **Singleton**

O padrão Singleton foi aplicado no serviço de cálculo de notas para garantir que apenas uma instância de cada estratégia de cálculo seja criada e utilizada durante o ciclo de vida da aplicação.

## Dependências

Aqui estão as principais dependências utilizadas no projeto, todas configuradas no arquivo `pom.xml`:

```xml
<dependencies>
    <!-- Spring Boot Starter Web -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <!-- Thymeleaf para renderização de páginas HTML -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-thymeleaf</artifactId>
    </dependency>

    <!-- JPA para persistência de dados -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>

    <!-- H2 Database para armazenamento em memória -->
    <dependency>
        <groupId>com.h2database</groupId>
        <artifactId>h2</artifactId>
        <scope>runtime</scope>
    </dependency>

    <!-- Spring Boot Starter Test para testes unitários -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
</dependencies>
```
# Instalação e Execução
## Pré-requisitos:

 - Java 17 instalado
 - Maven instalado
## Passos para executar o projeto:

### 1. Clone o repositório:
```bash
git clone https://github.com/MikaellLuiz/avaliacao-professores.git
```
### 2. Navegue até o diretório do projeto:
```bash
cd avaliacao-professores
```
### 3. Compile e execute a aplicação:
```bash
mvn spring-boot:run
```
Acesse o sistema no navegador:

```
http://localhost:8080/avaliacao
```
# Como Usar
### 1. Avaliar um Professor:
Vá até a página inicial e preencha o formulário com o nome do professor, a nota e os comentários.
Clique em "Enviar Avaliação".
### 2. Visualizar as Avaliações:
Na página inicial, após a submissão de uma avaliação, você pode visualizar todas as avaliações já submetidas.
Os dados de cada avaliação (nome do professor, nota e comentários) serão listados em uma tabela.

# Estrutura do Projeto
```bash
src
└── main
    ├── java
    │   └── com
    │       └── prof
    │           └── avalia
    │               ├── controller     # Controladores Spring MVC
    │               ├── interfaces     # Interface para strategy
    │               ├── model          # Modelos JPA
    │               ├── repository     # Repositórios JPA
    │               └── service        # Lógica de negócios e implementação dos padrões de projeto
    └── resources
        ├── templates  # Templates Thymeleaf para renderização de páginas
        └── application.properties  # Configurações da aplicação
        
```

# Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para abrir um pull request ou relatar problemas.