Algoritmo "LocadoraDeCarros"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 10/04/2024
Var
// Seção de Declarações das variáveis 
km, total: real
dias: inteiro
Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
escreval("Quantos quilômetros foram percorridos?")
leia(km)
escreval("Por quantos dias o carro foi alugado?")
leia(dias)
total<-(90*dias)+(0.20*km)
escreval("O preço total a pagar é R$:" ,total)
Fimalgoritmo