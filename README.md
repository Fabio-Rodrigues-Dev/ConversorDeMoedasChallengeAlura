# Conversor de Moedas #

## O Conversor de Moedas é um programa em Java que permite ao usuário converter diferentes tipos de moedas, como Dólar Canadense, Real, Euro, Peso Chileno, Yen e Peso Argentino. ##

### Funcionalidades ###

### O programa oferece as seguintes opções de conversão: ###

Dólar Canadense para Real

Real para Dólar Canadense

Dólar Canadense para Euro

Euro para Peso Chileno

Real para Yen

Real para Peso Argentino

Sair

O usuário pode selecionar a opção desejada e, em seguida, digitar o valor a ser convertido. O programa então exibe o resultado da conversão.

### Tecnologias Utilizadas ###

Java

Biblioteca Gson para deserialização de JSON

### Como Usar ###

Certifique-se de ter o Java instalado em seu computador.

Execute o programa Conversor.java.

Siga as instruções exibidas no menu para selecionar a opção de conversão desejada.

Digite o valor a ser convertido quando solicitado.

O programa exibirá o resultado da conversão.

### Estrutura do Código ###

### O código está dividido em quatro partes principais: ###

Passo 1: Impressão do menu: O programa exibe um menu com as opções de conversão disponíveis.

Passo 2: Entrada dos dados e seleção: O usuário seleciona a opção de conversão desejada, e o programa configura os códigos de moeda de origem e destino.

Passo 3: Consumo da API, Deserialização: O programa cria uma instância da classe ApiGet para fazer uma chamada a uma API de taxa de câmbio e deserializa o resultado usando a biblioteca Gson.

Passo 4: Impressão do resultado: O programa exibe as informações da conversão, incluindo o código da moeda de origem, o código da moeda de destino, o valor a ser convertido e o resultado da conversão.

### Contribuição ###

Contribuições são bem-vindas! Se você encontrar algum problema ou tiver sugestões de melhorias, sinta-se à vontade para abrir uma issue ou enviar um pull request.
