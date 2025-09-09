Algoritmo "tinta1"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 20/03/2024
Var
// Seção de Declarações das variáveis 
altura, raio, area, total, tinta, areaa, latas, preco:real
Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreva("Digite a altura: ")
leia(altura)
escreva("Digite o raio do cilíndro: ")
leia(raio)
area<-2*pi*raio*altura
areaa<-(pi*raio*raio)*2
total<-area+areaa
escreval("A area é: " , total)
latas<-total/15
escreval("A quantidade de latas usadas serão: " , latas, " latas.")
preco<-latas*100
escreval("O valor será: " , preco , " reais.")
Fimalgoritmo