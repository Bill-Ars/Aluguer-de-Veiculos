# 🚗 Projeto Java – Sistema de Locadora de Veículos

Este projeto em Java simula uma **locadora de veículos**, com herança entre as classes `Veiculo` e `Carro`. 
A locadora calcula o valor total de aluguer de forma dinâmica com base no tipo do veículo.

---

📦 Estrutura do Projeto

- `Veiculo.java`: Classe base com marca, modelo, ano e preço.
- `Carro.java`: Herda de `Veiculo` e adiciona atributo `qtdPortas`.
- `Locadora.java`: Contém o método `alugar` que calcula o preço total do aluguer.
- `Main.java`: Testa os métodos, cria instâncias de `Veiculo` e `Carro`.

---

 🔄 Regras de Cálculo do Aluguer

- O valor total é calculado como: `diária * número de dias`.
- Se o veículo for um `Carro` com **mais de 2 portas**, é acrescentada uma taxa adicional de **MZN 500**.

---

