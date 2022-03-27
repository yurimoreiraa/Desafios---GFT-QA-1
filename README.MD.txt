###### Desafios - GFT QA #1



**1** **/** **6** **-** **Distância**

## Desafio

Duas motos (X e Y) partem em uma mesma direção. A moto X sai com velocidade constante de 60 Km/h e a moto Y sai com velocidade constante de 90 Km/h.

Em uma hora (60 minutos) a moto Y consegue se distanciar 30 quilômetros da moto X, ou seja, consegue se afastar um quilômetro a cada 2 minutos.

O seu desafio é ler a distância (em Km) e calcular quanto tempo leva (em minutos) para a moto Y tomar essa distância da outra moto.

## Entrada

O arquivo de entrada contém um número inteiro **K** que representa a quantidade de quilômetro que que a moto Y deve estar da moto X.

## Saída

Imprima o tempo necessário para a moto Y ficar com a quantidade **K** de quilômetro da moto X, seguido da mensagem " minutos".

| Exemplo de Entrada | Exemplo de Saída |
| ------------------ | ---------------- |
| 30                 | 60 minutos       |



**2** **/** **6** **-** **Soma Simples**

## Desafio

Leia dois valores inteiros identificados como variáveis A e B. Calcule a soma entre elas e chame essa variável de **SOMA**.
A seguir escreva o valor desta variável.

## Entrada

O arquivo de entrada contém 2 valores inteiros.

## Saída

Imprima a variável **SOMA** com todas as letras maiúsculas, inserindo um espaço em branco antes e depois do símbolo de igualdade, seguido pelo valor correspondente à soma de A e B.

 

| Exemplos de Entrada | Exemplos de Saída |
| ------------------- | ----------------- |
| 30 10               | SOMA = 40         |

| -30 10 | SOMA = -20 |
| ------ | ---------- |
|        |            |

| 0 0  | SOMA = 0 |
| ---- | -------- |
|      |          |



**3** **/** **6** **-** **Dividindo X por Y**

## Desafio

Você terá o desafio de escrever um algoritmo que leia 2 números e imprima o resultado da divisão do primeiro pelo segundo. Caso não for possível, mostre a mensagem “divisao impossivel” para os valores em questão.

## Entrada

A entrada contém um número inteiro **N**. Este **N** será a quantidade de pares de valores inteiros (X e Y) que serão lidos em seguida.

## Saída

Para cada caso mostre o resultado da divisão com um dígito após o ponto decimal, ou “divisao impossivel” caso não seja possível efetuar o cálculo.

| Exemplo de Entrada              | Exemplo de Saída                       |
| ------------------------------- | -------------------------------------- |
| 3<br />3 -2<br />-8 0<br /> 0 8 | -1.5 <br />divisao impossivel<br />0.0 |



**4** **/** **6** **-** **Encaixa ou Não**

Paulinho tem em suas mãos um pequeno problema. A professora lhe pediu que ele construísse um programa para verificar, à partir de dois valores inteiros A e B, se B corresponde aos últimos dígitos de A.

## Entrada

A entrada consiste de vários casos de teste. A primeira linha de entrada contém um inteiro **N** que indica a quantidade de casos de teste. Cada caso de teste consiste de dois inteiros **A** (1 ≤ **A** < 231 ) e **B** (1 ≤ **B** < 231) positivos.

## Saída

Para cada caso de entrada imprima uma mensagem indicando se o segundo valor encaixa no primeiro valor, confome exemplo abaixo.

 

| Exemplo de Entrada                                           | Exemplo de Saída                                          |
| ------------------------------------------------------------ | --------------------------------------------------------- |
| 4<br />5678690 78690 <br />5434554 543 <br />1243 1243 <br />54 654 | encaixa <br />nao encaixa <br />encaixa nao <br />encaixa |



**5** **/** **6** **-** **Múltiplos**

Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem **"Sao Multiplos"** ou **"Nao sao Multiplos"**, indicando se os valores lidos são múltiplos entre si.

## Entrada

A entrada contém valores inteiros.

## Saída

A saída deve conter uma das mensagens conforme descrito acima.

| Exemplo de Entrada | Exemplo de Saída |
| ------------------ | ---------------- |
| 6 24               | Sao Multiplos    |

|      |                   |
| ---- | ----------------- |
| 6 25 | Nao sao Multiplos |



**6** **/** **6** **-** **Tempo de Jogo**

## Desafio

Tento como base a hora inicial e final de um jogo, calcule a duração do dele, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de, 60 minutos e máxima de 24 horas.

## Entrada

A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.

## Saída

Apresente a duração do jogo conforme exemplo abaixo.

| Exemplo de Entrada | Exemplo de Saída        |
| ------------------ | ----------------------- |
| 16 2               | O JOGO DUROU 10 HORA(S) |

|      |                         |
| ---- | ----------------------- |
| 0 0  | O JOGO DUROU 24 HORA(S) |

|      |                         |
| ---- | ----------------------- |
| 2 16 | O JOGO DUROU 14 HORA(S) |