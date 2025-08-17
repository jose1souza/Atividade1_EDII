# Bubble Sort com Flag de Otimização

Este algoritmo é uma variação do Bubble Sort tradicional. Ele utiliza uma flag chamada `exchange` para verificar se houve alguma troca durante uma fase. 
Se nenhuma troca ocorrer, o vetor já está ordenado e o algoritmo é interrompido antecipadamente.

## Funcionamento

1. O algoritmo percorre o vetor várias vezes (fases).
2. Em cada fase, compara pares adjacentes.
3. Se dois elementos estiverem fora de ordem, eles são trocados e a flag `exchange` é ativada.
4. Se ao final da fase `exchange` permanecer falsa, o vetor está ordenado e o algoritmo termina.
