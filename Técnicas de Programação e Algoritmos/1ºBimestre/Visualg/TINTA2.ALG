Algoritmo "TintaEspecial"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 20/03/2024
Var
// Seção de Declarações das variáveis 
l1, l2, l3, l4, c1, c2, c3, c4, p1, p2, p3, p4, a1, a2, a3, a4, lata, preco, tinta:real
Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreva("Digite a largura da primeira parede: ")
leia(l1)
escreva("Digite o comprimento da primeira parede: ")
leia(c1)
escreva("Digite a largura da segunda parede: ")
leia(l2)
escreva("Digite o comprimento da segunda parede: ")
leia(c2)
escreva("Digite a largura da terceira parede: ")
leia(l3)
escreva("Digite o comprimento da terceira parede: ")
leia(c3)
escreva("Digite a largura da quarta parede: ")
leia(l4)
escreva("Digite o comprimento da quarta parede: ")
leia(c4)
a1<-l1*c1
a2<-l2*c2
a3<-l3*c3
a4<-l4*c4
escreval("A área da primeira parede é:" ,a1)
escreval("A área da segunda parede é:" ,a2)
escreval("A área da terceira parede é:" ,a3)
escreval("A área da quarta parede é:" ,a4)
lata<-a1/25
tinta<-lata*5
escreval("A quantidade de latas de tinta comum utilizadas na primeira parede serão:" , lata , " latas.")
escreval("A quantidade de litros de tinta comum utilizadas na primeira parede serão:" , tinta , " litros.")
preco<-lata*80
escreval("O valor em tinta comum para pintar a primeira parede será de: " , preco , "reais.")
lata<-a2/25
tinta<-lata*5
escreval("A quantidade de latas de tinta comum utilizadas na segunda parede serão:" , lata , " latas.")
escreval("A quantidade de litros de tinta comum utilizadas na segunda parede serão:" , tinta , " litros.")
preco<-lata*80
escreval("O valor em tinta comum para pintar a segunda parede será de: " , preco , "reais.")
lata<-a3/25
tinta<-lata*5
escreval("A quantidade de latas de tintas comum utilizadas na terceira parede serão:" , lata , " latas.")
escreval("A quantidade de litros de tinta comum utilizadas na terceira parede serão:" , tinta , " litros.")
preco<-lata*80
escreval("O valor em tinta comum para pintar a terceira parede será de: " , preco , "reais.")
lata<-a4/7,5
tinta<-lata*5
escreval("A quantidade de latas de tintas especiais utilizadas na quarta parede serão:" , lata , " latas.")
escreval("A quantidade de litros de tinta especial utilizadas na quarta parede serão:" , tinta , " litros.")
preco<-lata*150
escreval("O valor em tinta especial para pintar a quarta parede será de: " , preco , "reais.")

Fimalgoritmo