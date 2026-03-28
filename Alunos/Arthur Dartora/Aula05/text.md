# Paradigmas: imperativo x declarativo 

## Introdução

Na programação, temos duas formas de resolver problemas, comumente conhecidos como paradigmas. Os dois principais paradigmas são o **imperativo** e o **declarativo**, que se diferenciam principalmente na forma do programador descrever como vai solucionar um problema.

## Paradigma imperativo

O paradigma imperativo é descrever **passo a passo* de como um programa deve realizar uma tarefa. Nele o programador controla a execução, usando por exemplo variáveis, loops e condicionais.

A linguagem **Java** é um exemplo de paradigma imperativo:

```java
int soma = 0;
for(int i = 1; i <= 5; i++) {
    soma += i;
}
System.out.println(soma);
``` 

## Paradigma declarativo

Enquanto isso, o paradigma declarativo é **descrever o que deve ser feito**, sem muitos detalhes de como vai ser executado.

O **Python**, apesar de ser uma linguagem multi-paradigma, pode ser utilizado em um estilo mais declarativo ao focar no resultado desejado com funções prontas, sem detalhar explicitamente cada passo da execução:

```py
soma = sum(range(1, 6))
print(soma)
```

## Comparação entre os codigos

Ambos calculam a soma de valores

**-Java**: define o passo a passo com um laço de repetição
**-Python**: usa função pronta, focando no resultado.

## Conclusão

O imperativo foca em como o problema é resolvido, enquanto o declarativo foca no resultado esperado. Ambos são importantes, sendo o imperativo mais comum e o declarativo mais abstrato.