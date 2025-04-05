# 💳 Desafio Conta Bancária em Java

Este projeto é um desafio de prática em **Java** com foco nos princípios da **Programação Orientada a Objetos (POO)**. Ele simula um sistema bancário simples, permitindo criar contas, realizar depósitos, saques e visualizar os dados da conta.

## 🎯 Objetivos do Desafio

- Praticar a criação de classes e objetos em Java.
- Trabalhar com visibilidade de atributos (`private`, `public`).
- Utilizar **getters e setters** para encapsulamento.
- Implementar **construtores** para inicialização de objetos.
- Usar **Enums** para representar tipos fixos de conta (corrente, poupança, salário).
- Aplicar validações básicas de dados.

---

## 🧱 Estrutura do Projeto

- `ContaBancaria.java`: classe principal que representa a conta de um cliente, com métodos para saque, depósito e resumo da conta.
- `TipoConta.java`: enum que define os tipos possíveis de conta.
- `Banco.java`: classe com o método `main` que executa a lógica de teste das funcionalidades da conta bancária.

---

## 📦 Funcionalidades

- Criar uma nova conta com nome do titular, número e tipo de conta.
- Depósito de valores.
- Saque com verificação de saldo.
- Alteração do nome do titular (com validação).
- Exibição do resumo completo da conta.
- Proteção de atributos com visibilidade adequada.
- Enum para controle dos tipos de conta.

---

## 🚀 Como Executar  

1. Clone o repositório:
   ```bash
   git clone https://github.com/NatanVilasBoas/DesafioContaBancaria.git
   ```
2.	Abra o projeto em sua IDE Java preferida (Eclipse, IntelliJ, VS Code, etc).
3.	Compile e execute o arquivo Banco.java, que contém o método main.

## 🛠️ Tecnologias Utilizadas
  •	Java 17+ (ou versão compatível)
	•	Programação Orientada a Objetos
	•	Conceitos fundamentais de Java (Classes, Objetos, Enums, Construtores, Encapsulamento)

## 🧪 Exemplos de Testes
	
  •	Criar contas de diferentes tipos.
	•	Tentar sacar valor maior que o saldo.
	•	Tentar cadastrar nome inválido.
	•	Depositar e sacar valores positivos.
	•	Exibir o resumo da conta após cada operação.
