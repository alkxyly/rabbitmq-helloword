# RabbitMQ - Primeiros Passos com Spring boot

1. Instalação do RabbitMQ com Docker

```
docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.9-management
```

2. Criando uma imagem do projeto producer a partir do Dockerfile
```
 docker image build -t rabbitmq-producer .
```

3. Executando o container da imagem criada
```
 docker container run --rm -p 8081:8081 rabbitmq-producer
``` 
