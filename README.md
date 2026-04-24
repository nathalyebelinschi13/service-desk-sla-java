# 📌 Sistema de Service Desk (Java)

## 🎯 Descrição

Este projeto consiste em um sistema simples de Service Desk, desenvolvido em Java, que permite a criação, organização e processamento de chamados de suporte técnico.

O sistema simula situações reais como:

* Internet indisponível
* Problemas de login
* Falhas em equipamentos

Os chamados são classificados por prioridade e processados conforme regras definidas.

---

## 🚀 Funcionalidades

* ✔ Criação de chamados
* ✔ Classificação por prioridade (HIGH, MEDIUM, LOW)
* ✔ Fila de atendimento
* ✔ Processamento dos chamados
* ✔ Simulação de atendimento

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

## 🧠 Padrões de Projeto Utilizados

### 🔹 Singleton

Utilizado na classe `TicketQueueManager` para garantir que exista apenas uma instância da fila de chamados.

---

### 🔹 Factory

Utilizado na classe `TicketFactory` para centralizar a criação de objetos `Ticket`.

---

### 🔹 Strategy

Utilizado para definir diferentes comportamentos de atendimento com base na prioridade:

* HIGH → atendimento imediato
* MEDIUM → atendimento em breve
* LOW → pode aguardar

---

## ▶️ Como Executar

1. Clone o repositório:

```
git clone https://github.com/nathalyebelinschi13/service-desk-sla-java.git
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

## 🎓 Contexto

Projeto desenvolvido durante o desafio de Padrões de Projeto em Java da DIO (Digital Innovation One), com implementação prática de padrões como Singleton, Factory e Strategy.

---

## 📚 Tecnologias Utilizadas

* Java
* Programação Orientada a Objetos (POO) (Object-Oriented Programming (OOP)  
* Design Patterns

---

## 👩‍💻 Autora

Nathalye Belinschi
