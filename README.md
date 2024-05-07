# Java Persistence API (JPA) com Hibernate
Uma breve introdução ao Java Persistence API (JPA) em conjunto com o framework Hibernate para facilitar o mapeamento objeto-relacional em uma aplicação Java. O objetivo principal é demonstrar a integração dessas tecnologias para fornecer uma solução robusta e eficiente para persistência de dados em um ambiente Java.
Além disso, foi utilizado o banco de dados MySQL para a persistência dos dados, garantindo um armazenamento seguro e confiável das informações.

## Sobre as tecnologias
### JPA
O Java Persistence API (JPA) é uma especificação do Java EE que define uma interface comum para mapeamento objeto-relacional em aplicações Java. Ela permite que os desenvolvedores usem classes Java simples (POJOs) para representar dados de banco de dados relacionais.
O JPA simplifica o desenvolvimento de aplicações ao fornecer um modelo de programação baseado em objetos para interagir com o banco de dados.

Arquitetura de uma aplicação que utiliza JPA:
![image](https://github.com/rodrigovalim07/introducao-JPA-Hibernate/assets/109677118/b1fafc26-9517-44dc-ba0d-d0f60684a943)
### Hibernate
O Hibernate é uma das implementações mais populares do JPA. É um framework de mapeamento objeto-relacional (ORM) que facilita o armazenamento e recuperação de objetos Java em um banco de dados relacional.
O Hibernate simplifica o desenvolvimento de aplicações Java ao abstrair muitas das complexidades do acesso ao banco de dados e fornecer uma camada de persistência de alto nível.

Antes do surgimento do Hibernate, lidar com dados relacionais em uma aplicação Java envolvia um processo manual de mapeamento de dados entre tabelas de banco de dados e objetos em memória.
Isso exigia que os desenvolvedores escrevessem muito código redundante/monótono para realizar operações de CRUD (create, read, update, delete) e manter a consistência entre os dados armazenados no banco de dados e os objetos na aplicação.

Arquitetura:

![hibernate](https://github.com/rodrigovalim07/introducao-JPA-Hibernate/assets/109677118/1ba9b05a-bbc1-4dc9-bc9b-5aa969a1e42e)

## Conclusão
No geral, o uso do JPA com o Hibernate simplifica o desenvolvimento de aplicações Java que precisam interagir com bancos de dados relacionais, fornecendo uma abstração poderosa sobre o banco de dados e eliminando a necessidade de lidar diretamente com SQL e detalhes de baixo nível do banco de dados.
Isso permite que os desenvolvedores se concentrem mais na lógica de negócios da aplicação.
