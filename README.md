<h1 align="center">
  API de Receitas
</h1>

Os dados dessa api podem ser acessados no link [Forkify API](https://forkify-api.herokuapp.com/)

## Tecnologias
 
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Cloud OpenFeign](https://docs.spring.io/spring-cloud-openfeign/docs/current/reference/html)


## Práticas adotadas

- API REST


## Como Executar

- Clonar repositório git
- Construir o projeto:
```
$ ./mvnw clean package
```


A API poderá ser acessada em [localhost:8080](http://localhost:8080).

## API Endpoints


- Criar Tarefa 
```
$ http GET :8080/recipes/dish?name=popcorn

[
  {
  "count": 28,
  "recipes": [
    {
      "publisher": "Two Peas and Their Pod",
      "title": "Twix Caramel Popcorn",
      "source_url": "http://www.twopeasandtheirpod.com/twix-caramel-popcorn/",
      "recipe_id": "54455",
      "image_url": "http://forkify-api.herokuapp.com/images/twixcaramelpopcorn2ddb1.jpg",
      "social_rank": 99,
      "publisher_url": "http://www.twopeasandtheirpod.com"
    }
  ]
  }
]
```

