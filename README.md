

# 📌 Sistema de Service Desk (Java)

## 🎯 Descrição

Este projeto consiste em um sistema simples de Service Desk, onde é possível criar, organizar e processar chamados de suporte técnico.

O sistema simula situações reais como:

* Internet indisponível
* Problemas de login
* Falhas em equipamentos

Os chamados são classificados por prioridade e processados conforme regras definidas.

---

## 🧱 Estrutura do Projeto

```
src/
 ├── main/
 │    └── Main.java
 ├── model/
 │    ├── Ticket.java
 │    └── User.java
 ├── factory/
 │    └── TicketFactory.java
 ├── service/
 │    └── TicketService.java
 ├── strategy/
 │    ├── PriorityStrategy.java
 │    ├── HighPriority.java
 │    ├── MediumPriority.java
 │    └── LowPriority.java
 └── singleton/
      └── TicketQueueManager.java
```

---

## 🚀 Funcionalidades

* ✔ Criação de chamados
* ✔ Classificação por prioridade (HIGH, MEDIUM, LOW)
* ✔ Fila de atendimento
* ✔ Processamento dos chamados
* ✔ Simulação de atendimento

---

## 🧠 Padrões de Projeto Utilizados

### 🔹 Singleton

Utilizado na classe `TicketQueueManager` para garantir que exista apenas uma instância da fila de chamados.

👉 Evita múltiplas filas e mantém controle centralizado.

---

### 🔹 Factory

Utilizado na classe `TicketFactory` para criação dos objetos `Ticket`.

👉 Centraliza a criação e facilita manutenção.

---

### 🔹 Strategy

Utilizado para definir diferentes comportamentos de atendimento com base na prioridade:

* `HighPriority` → atendimento imediato
* `MediumPriority` → atendimento em breve
* `LowPriority` → pode aguardar

👉 Permite alterar regras sem modificar o código principal.

---

## ▶️ Como Executar

1. Clone o repositório:

```
git clone https://github.com/seu-usuario/service-desk-java.git
```

2. Abra o projeto no VS Code

3. Execute o arquivo `Main.java`

---

## 💥 Exemplo de Saída

```
Sistema iniciado
Processando: Internet caiu - HIGH
Processando: Senha bloqueada - MEDIUM
Processando: PC não liga - LOW
URGENTE: atendimento imediato!
Atendimento em breve.
Pode aguardar.
```

---

## 📚 Tecnologias Utilizadas

* Java
* Programação Orientada a Objetos (POO)
* Design Patterns

---

## 📌 Considerações Finais

Projeto desenvolvido com foco na prática de padrões de projeto, visando melhorar a organização, reutilização e manutenção do código.

---

## 🎓 Contexto

Projeto desenvolvido durante o desafio de Padrões de Projeto em Java da DIO (Digital Innovation One), com implementação prática de padrões como Singleton, Factory e Strategy.

## 👩‍💻 Autora

Nathalye Belinschi
