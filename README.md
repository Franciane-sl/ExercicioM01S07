# 🎓 API - Gestão de Estudantes

Sistema desenvolvido em **Java com Spring Boot**, como parte das atividades da semana do **curso de Desenvolvimento Web – SENAI/SC**.

O objetivo foi aplicar conceitos de API REST, validações e boas práticas de arquitetura para gerenciar registros de estudantes.  
A aplicação permite **cadastrar, listar, buscar e deletar estudantes**, com respostas claras e padronizadas.

---

## 📚 Tabela de Conteúdos

- [✅ Funcionalidades Disponíveis](#✅-funcionalidades-disponíveis)
- [🚧 Status do Projeto](#🚧-status-do-projeto)
- [🔧 Features](#🔧-features)
- [📋 Pré-requisitos](#📋-pré-requisitos)
- [▶️ Como rodar o projeto](#️como-rodar-o-projeto)
- [🛠️ Tecnologias Utilizadas](#🛠️-tecnologias-utilizadas)
- [👩‍💻 Autor](#👩‍💻-autor)
- [📄 Licença](#📄-licença)

---

## ✅ Funcionalidades Disponíveis

- [x] Cadastro de estudantes com validação de dados
- [x] Listagem de todos os estudantes registrados
- [x] Busca por registro (ID)
- [x] Exclusão de estudante por registro
- [x] Retorno de mensagens de erro personalizadas com `BindingResult`

---

## 🚧 Status do Projeto

📌 **Finalizado**

---

## 🔧 Features

- **Spring Boot**: Framework principal para construção da API REST
- **Validação com Jakarta Validation** (`@NotBlank`, `@Email`, etc)
- **Arquitetura em camadas**: separação entre controller, modelo e "banco" em memória
- **Uso de ArrayList como simulação de banco de dados**
- **Mensagens claras e status HTTP adequados para cada situação**

---

## 📋 Pré-requisitos

- Java JDK 21
- Maven
- IDE Java (IntelliJ, Eclipse ou VS Code com extensão Java)

---

## ▶️ Como rodar o projeto

```bash
# 1. Clone o repositório
git clone https://github.com/Franciane-sl/estudantes.git

# 2. Acesse a pasta do projeto
cd estudantes

# 3. Compile e rode a aplicação
./mvnw spring-boot:run
```
---

## 📍 A aplicação estará disponível em:

📍 `http://localhost:8080/Estudante`

---

## 🛠️ Tecnologias Utilizadas

| Tecnologia                    | Descrição                                           |
|-------------------------------|-----------------------------------------------------|
| ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)    | Linguagem principal do projeto                      |
| ![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white) | Framework para desenvolvimento da API               |
| 📦 **Maven**                   | Gerenciador de dependências                         |
| 🧾 **Jakarta Validation**      | Validação dos dados de entrada da API               |
| 📋 **REST API**                | Padrão de arquitetura adotado para os endpoints     |
| 🧠 **POO**                     | Organização e estruturação de dados com boas práticas de orientação a objetos |

---

## 📄 Licença

Este projeto está sob a licença **MIT**.  
Você pode usar, modificar e distribuir este código livremente, desde que mantenha os devidos créditos à autora.

---

## 👩‍💻 Autor

Desenvolvido com 💜 por **Franciane Schier**

<p align="left">
  <a href="https://www.linkedin.com/in/franciane-schier-63b885342/" target="_blank">
    <img alt="LinkedIn" src="https://img.shields.io/badge/LinkedIn-%230077B5.svg?&style=for-the-badge&logo=linkedin&logoColor=white" />
  </a>
  <a href="mailto:franschierl@gmail.com">
    <img alt="Gmail" src="https://img.shields.io/badge/E--mail-D14836?style=for-the-badge&logo=gmail&logoColor=white" />
  </a>
  <a href="https://github.com/Franciane-sl" target="_blank">
    <img alt="GitHub" src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white" />
  </a>
  <a href="https://www.facebook.com/franciane.schierl/" target="_blank">
    <img alt="Facebook" src="https://img.shields.io/badge/Facebook-1877F2?style=for-the-badge&logo=facebook&logoColor=white" />
  </a>
</p>

