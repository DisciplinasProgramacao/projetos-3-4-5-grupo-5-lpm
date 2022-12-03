# Projeto 3 - Frota fase 1

## Nota: 7,6

## Comentários
	- não sei o que houve: o projeto veio com cerca de 50MB de plugins do Eclipse no diretório .metadata. Verifiquem isso...
	- a interface de custo está "ao contrário": custo deve ser a interface e manutencao, vistoria etc são as implementações. 
	- esta interface deveria estar ligada à classe mãe.
	- cuidado com classes 'soltas' no diagrama.
	- atenção para método de carregar bastante complicado, desnecessariamente
	- totalmente sem documentação... 
	
### Modelagem: 1,2/2 pontos. 
	- confusão com métodos, atributos e construtores
	- métodos não aderentes: read/write na Frota 
	- veículo sem rota e rota sem veículo: como relacionar?
	- gets e sets desnecessários: destroem o encapsulamento e trazem insegurança com os sets sem validação. 
	- sem métodos abstratos no veículo para override nas filhas. Veículo é quem deveria
	
### Implementação dos requisitos de acordo com a modelagem: 2,6/6 pontos. 
	- Adicionar rota (com autonomia)  0/2 
	- IPVA  0,8/1: deixa o veículo sem IPVA como o get (desnecessário)
	- Seguro 0,8/1: idem
	- Outros custos 1/2: conta errada
	

### Programa principal e seus requisitos: 3,8/7 pontos.
	- Carregar e salvar  1,8/2: nome de arquivo no parâmetro (acoplamento). Usem constantes
	- Incluir veículo 	0,5/1: permite digitação de valores constantes
	- Incluir rotas em veículo 0/1 
	- Localizar um veículo 0/1
	- Imprimir um relatório do veículo 1,5/2: sem gastos
