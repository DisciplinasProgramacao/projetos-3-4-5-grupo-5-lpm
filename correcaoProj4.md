# Projeto 4 - Gestão de Frota (parte 2)

## Nota: 4,2

## Comentários
	- Ainda sem modularização de tanque e de combustível
	- Sem compilar (linha 85 de Veiculo)
	- Continuamos com print em meio das classes (preencherTanque). Isso na 5ª etapa gera penalização da nota
	- nada feito nos requisitos da empresa
	
## Correção

### Modelagem: 1,2/2   
	- Modularização de tanque e combustível
	
### Requisitos dos veículos, de acordo com a modelagem: 3/9  
	- Restrição de combustível: 0/3
	- Abastecimento e autonomia: 1,5/3 -- tem a autonomia, mas pode ser alterada pelo 'set' que não devia existir. Abastecimento não é usado por ninguém
	- Custos fixos e variáveis: 1,5/3 -- só custos fixos
	
### Requisitos da empresa no programa principal: 0/9 
	- Quilometragem média das rotas da empresa: 0/3 
	- Filtro para busca de rotas por data: 0/3  
	- Um dos dois abaixo: 0/3
		- Os 3 veículos que mais fizeram rotas 
		- Lista de veículos ordenada decrescentemente por custos gerados 

