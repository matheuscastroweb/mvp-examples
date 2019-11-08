# MVP-examples

Trabalho apresentado a disciplina de Proj. e arquitetura de Software referente a utilização do padrão **MVP** (Model-View-Presenter) na linguagem Java.

Neste contexto, será demonstrado a subdivisão das responsabilidades utilizando o padrão em questão além da documentação de cada parte do código. 

![Diagram](https://user-images.githubusercontent.com/45601574/68478678-3b3f7180-020f-11ea-9078-261fd4e5e657.png)

------------

O padrão MVP(Model-View-Presenter) é uma variante do padrão MVC(Model-View-Controller) foi projetado principalmente para tornar mais fácil para o teste de unidade. O gráfico fornecido abaixo descreve a arquitetura do padrão MVP:

![Diagram2](https://user-images.githubusercontent.com/45601574/68483874-0fc28400-021b-11ea-9570-2e1108f30b40.png)

Retirado do livro: RAJ, Pethuru et al. Architectural Patterns. 2017. Packt.

#### Contexto real: 

Um profissional precisa se logar em um sistema em um supermercado e consultar seu preço.

#### Vantagens: 

Redigir.

#### Desvantagens:

Redigir.

#### As diferenças entre o MVC e o MCP

Redigir.

#### Implementação - Passive view

Model: Este componente especifica os dados a serem exibidos ou/e enviados de ou para a interface do usuário.

Presenter: Ele é responsável por buscar dados do modelo, aplicar lógica apropriada e enviá-los de volta para exibição na view. Tem uma instância do model para realizar consultas no banco de dados,  e uma instância da interface view para comunicação com a view de forma indireta.

View: O componente view apenas atua como uma interface passiva. Ele exibe dados do modelo e envia entradas e comandos do usuário ao componente do apresentador. Essas entradas e comandos do usuário serão usados para executar operações nos dados. Tem uma instância de presenter e implementa a interface view. O que ela faz? Promove interação do usuário com o sitema, neste caso ela possibilita uma tela consulta por nome do produto, e exibe dados. O usuário final interage apenas com a View. 

Interface view: Métodos necessarios para o presenter

------------

#### Referências:

- FOWLER, Martin et al.Padrões de Arquitetura de Aplicações Corporativas. 2007. Bookman.
- RAJ, Pethuru et al. Architectural Patterns. 2017. Packt.

#### Informações sobre o trabalho:

**Professor:** Thiago Delgado Pinto <br>
**Universidade:** Centro Federal de Educação Tecnológica Celso Suckow da Fonseca <br>

**Alunos:**
Matheus de Castro Pelegrino 	- matheuscastroweb@gmail.com  <br>
Gabrielly Ezequiel Corrêa  	- gabriellyezequiel_@hotmail.com <br>
Cleiton da Silva Baloneker	- cleitonbaloneker@gmail.com <br>
Aldair Camargo Duarte Klein 	- camargoterabyte@gmail.com <br>
Artur Pedroza Ferreira 		- petsqui@gmail.com <br>
Conrado de Menezes Schuenck 	- conradomschuenck54@gmail.com <br>


