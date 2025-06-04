# 📢 Sistema de Notificação de Empréstimos Pendentes

Projeto acadêmico desenvolvido pelos alunos do curso de **Ciência da Computação** da **Universidade Anhembi Morumbi**.

---

## 🎯 Objetivo do Projeto

O sistema foi desenvolvido com o propósito de:

- Simular um sistema de notificação automática de empréstimos consignados pendentes.
- Utilizar conceitos de **estrutura de dados, algoritmos, banco de dados relacional e agendamento de tarefas (Scheduler)**.
- Integrar o backend com envio automático de e-mails de notificação aos clientes.
- Demonstrar integração de camadas (Repository, Service, Scheduler, Controller).
- Aplicar conceitos de JPA, Hibernate, Spring Boot e SQL Server.

Este projeto foi utilizado como entrega da disciplina de **Estrutura de Dados e Algoritmos II**.

---

## ⚙ Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.4.5**
- **Spring Data JPA**
- **Spring Scheduler**
- **Spring Mail**
- **SQL Server 2022**
- **Maven**
- **Hibernate ORM**
- **HikariCP**
- **IntelliJ IDEA**

---

## 🗄 Estrutura de Pastas

src/main/java/com/sistemadenotificacao/notificacao
│
├── controller
│ └── ClienteController.java
│
├── model
│ ├── Cliente.java
│ └── PropostaEmprestimo.java
│
├── repository
│ ├── ClienteRepository.java
│ └── PropostaRepository.java
│
├── scheduler
│ └── NotificacaoScheduler.java
│
├── service
│ ├── ClienteService.java
│ ├── EmailService.java
│ └── PropostaService.java
│
└── NotificacaoApplication.java

---

## 📩 Funcionalidades

- Consulta automática de clientes com propostas de empréstimo pendentes.
- Envio de e-mails automáticos com aviso de pendência.
- Mensagem personalizada com nome do cliente, valor da proposta e link fictício do chatbot de atendimento.
- Scheduler configurado para executar diariamente.
- Possibilidade de inserção de dados via API REST (Controller).
- Integração completa com banco de dados SQL Server.

---

## 🚀 Como executar o projeto

### 1️⃣ Pré-requisitos:

- Java 17 instalado
- SQL Server configurado e rodando
- IntelliJ IDEA (ou IDE de sua preferência)

### 2️⃣ Configuração do banco de dados:

- Crie o banco `projeto_faculdade` no SQL Server.
- Ajuste o arquivo `application.properties` com as suas credenciais de banco.

### 3️⃣ Script SQL de ajuste (já foi realizado anteriormente, mas disponibilizar novamente se necessário).

### 4️⃣ Executar a aplicação:

Na IDE, rodar o método `main` da classe:

 aplicação subirá em `localhost:8080`.

---

## 🧪 Testes

- As notificações serão enviadas automaticamente pelos agendamentos configurados.
- As consultas REST estão disponíveis para testes manuais de cadastro e consulta de clientes.

---

## 👨‍🎓 Integrantes

Projeto desenvolvido para a disciplina de **Estrutura de Dados e Algoritmos II**  
Universidade Anhembi Morumbi - Ciência da Computação  
Ano: **2025**

---

## 🏷 Observação

O projeto simula um sistema completo backend, contemplando:

- Modelagem de domínio
- Integração com banco real
- Programação orientada a objetos
- Implementação de lógica de negócios
- Organização modular de camadas

Material pronto para apresentações acadêmicas e futuras evoluções.

---
