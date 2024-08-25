# Banco Digital Orientado a Objetos - Novas Funcionalidades

Este projeto é uma extensão do [desafio original](https://github.com/falvojr/lab-banco-digital-oo), onde novas funcionalidades foram adicionadas à solução Orientada a Objetos em Java. O projeto original define um cenário onde um banco oferece aos clientes dois tipos de contas: corrente e poupança, com funcionalidades de depósito, saque e transferência.

## Novas Funcionalidades Implementadas

### 1. Sistema de Juros para Contas Poupança
Foi implementado um sistema de juros que aplica automaticamente 5% de juros ao saldo da conta poupança mensalmente.

### 2. Limite de Crédito para Conta Corrente
Agora, contas correntes possuem um limite de crédito, permitindo que o saldo da conta fique negativo até um determinado valor (limite configurável).

### 3. Relatório e Estatísticas Bancárias
Foi adicionada a funcionalidade de geração de relatórios que listam todas as contas do banco, com seus respectivos saldos, e calculam o saldo total de todas as contas.

### 4. Histórico de Transações
Cada conta agora mantém um histórico de transações que inclui saques, depósitos e transferências. O histórico pode ser visualizado a qualquer momento.

### 5. Sistema de Autenticação de Clientes
Foi implementado um sistema de autenticação para clientes, onde o cliente precisa fornecer uma senha para acessar suas contas. Se a senha estiver correta, a autenticação é bem-sucedida.

## Como Executar

1. Clone o repositório original do projeto:
   ```bash
   git clone https://github.com/falvojr/lab-banco-digital-oo
