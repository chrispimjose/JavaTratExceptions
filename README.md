# Tratamento de Exceção em Java.
Este projeto foi desenvolvido em Java.
![Imagem do Java](java.svg)

- Exemplo básico de tratamento de uma exceção causada por uma divisão por zero em Java.

## Objetivo

Demonstrar o uso dos blocos:

- `try`
- `catch`
- `finally`

Também são apresentadas informações básicas sobre a exceção utilizando métodos da classe `Exception`.

## Referências básicas

### `try`

Utilizado para envolver o código que pode gerar uma exceção.

```java
try {
    // Código que pode gerar uma exceção
} catch (ArithmeticException e) {
    // Tratamento da exceção
} finally {
    // Código executado ao final da operação
}
````
## Métodos utilizados

| Método | Descrição |
|---|---|
| `e.getMessage()` | Retorna a mensagem da exceção |
| `e.getClass().getName()` | Retorna o nome completo do tipo da exceção |
| `e.getCause()` | Retorna a causa da exceção, quando existir |
| `e.printStackTrace(System.out)` | Exibe o caminho completo do erro no console |

## Exceção utilizada
- `ArithmeticException`

## Exemplo de mensagem exibida
A saída pode ser semelhante a:
``` java
===================
  Erro: / by zero | Tipo: java.lang.ArithmeticException | Causa: não especificada
  Stack trace:
  java.lang.ArithmeticException: / by zero
      at TratamentoExcecao.main(TratamentoExcecao.java:12)
  Operação finalizada.
```
## Conceitos demonstrados
- Exceções em Java;
- ArithmeticException;
- Bloco try;
- Bloco catch;
- Bloco finally;
- getMessage();
- getClass().getName();
- getCause();
- printStackTrace();
- Tratamento de divisão por zero.

## Execução
```
javac NomeDoArquivo.java
java NomeDaClasse
```
## Licença
Este projeto pode ser utilizado livremente para fins de estudo e aprendizado.
