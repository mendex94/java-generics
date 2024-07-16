# Java Generics

## Problema

Uma empresa de consultoria deseja avaliar a performance de produtos,
funcionários, dentre outras coisas. Um dos cálculos que ela precisa é encontrar
o maior dentre um conjunto de elementos. Fazer um programa que leia um
conjunto de produtos a partir de um arquivo, conforme exemplo, e depois
mostre o mais caro deles.

Criar um serviço de calculo:

```plaintext
    CalculationService
    + max<T>(list: List<T>): T
```

## Exemplo

### Entrada

```plaintext
TV,900.00
Mouse,50.00
Tablet,350.50
HD Case,80.90
Computer,850.00
Monitor,290.00
```

### Saída

```plaintext
Most expensive:
Computer, 850.00
```