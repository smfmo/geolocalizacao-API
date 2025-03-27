# Geolocalização por IP - Aplicação Spring Boot

## 📋 Descrição
Aplicação Web que consulta informações de geolocalização utilizando a API [ip-api.com](http://ip-api.com).

### Documentação da Api: https://ip-api.com/docs

### Imagem da tela de busca:
![img.png](img.png)

## 🛠️ Tecnologias
- Java 
- Spring Boot 
- Thymeleaf
- Bootstrap 5
- API ip-api.com

# Arquitetura geral (MVC)
O projeto segue o padrão de arquitetura Model-View-Controller

- Model: `IpInformation.java` (dados)


- View: `ipinfo.html` (interface)


- Controller: `IpIformationController.java` e `IpInformationService.java` (lógica)


## Fluxo da aplicação 
1. Usuário acessa e digita o Ip

2. Controller recebe a requisição:

3. Se houver parâmetro ip, chama o Service

4. Service consulta a API externa e retorna os dados

5. Controller passa os dados para a View

6. View renderiza o HTML com os resultados

