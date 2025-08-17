# 💱 Conversor de Moedas em Java  

![Java](https://img.shields.io/badge/Java-17+-red?logo=openjdk&logoColor=white)  
![API](https://img.shields.io/badge/REST%20API-ExchangeRate%20Host-blue)  
![Gson](https://img.shields.io/badge/Library-Gson-green)  

Um **conversor de moedas** desenvolvido em **Java**, que consome uma API de câmbio em tempo real para converter valores entre diferentes moedas.  
O projeto foi construído com **orientação a objetos**, uso de **bibliotecas externas** (Gson) e boas práticas de organização em pacotes.

---

## 📋 Funcionalidades
- 🌍 Conversão entre diferentes moedas (USD, EUR, BRL, etc).  
- 🔄 Consumo de API de taxas de câmbio em tempo real.  
- 🧾 Menu interativo no console.  
- 📑 Tratamento de erros (como falta de conexão ou API inválida).  

---

## 🛠 Tecnologias utilizadas
- **Java 17+** (compatível com versões superiores a 11).  
- **Gson** para leitura de JSON.  
- **API de câmbio** ([ExchangeRate Host](https://exchangerate.host) ou [Open Exchange Rates](https://openexchangerates.org/)).  

---

## ⚙️ Como rodar o projeto

1 - Clonar o repositório
```bash
git clone https://github.com/seuusuario/conversor-de-moedas.git
cd conversor-de-moedas

2 - Baixar dependências

Certifique-se de ter o Gson dentro da pasta lib/.
Se não tiver, faça o download: Gson

3 - Compilar o projeto
javac -cp lib/gson.jar -d bin src/conversor/*.java

4 - Executar o projeto
java -cp "bin;lib/gson.jar" conversor.Main


⚠️ No Linux/Mac, troque ; por :

java -cp "bin:lib/gson.jar" conversor.Main

🔑 Configuração da API

Se estiver usando o ExchangeRate Host, não precisa de chave.

Se estiver usando o Open Exchange Rates, edite a classe ServicoCambio.java e adicione sua API Key na URL:

private static final String URL_API = "https://openexchangerates.org/api/latest.json?app_id=SUA_KEY";

---
📸 Exemplo de execução
=== Conversor de Moedas ===
1. Converter moeda
2. Sair
Escolha uma opção: 1

Digite o valor: 100
Moeda de origem (ex: USD): USD
Moeda de destino (ex: BRL): BRL

Resultado: 100 USD = 498.50 BRL

---
📚 Formação

Este projeto foi desenvolvido com base na Formação Java e Orientação a Objetos, pelos cursos da Alura em parceria com a Oracle, como parte da 8ª turma do Programa ONE (Oracle Next Education).

---
✍️ Autora

Projeto desenvolvido por Andrielly Patrícia como prática de Java + APIs.

---
🙏 Agradecimentos

Quero agradecer à **Alura** e à **Oracle**, pela oportunidade de participar da formação em Java e Orientação a Objetos através do programa **ONE - Oracle Next Education**.  
