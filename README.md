# MVP-posts

Trabalho apresentado a disciplina de Proj. e arquitetura de Software referente a utilização do padrão **MVP** (Model-View-Presenter) nas linguagens JavaScript e Java.

Neste contexto, será demonstrado a subdivisão das responsabilidades utilizando o padrão em questão além da documentação de cada parte do código. 

A documentação do projeto justamente com a explicação do padrão estará disponível abaixo.

------------

Contexto real: 

Um profissional precisa se logar em um sistema em um supermercado e consultar seu preço.

------------
REFORMULAR 

Projeto em Java:

Implementação Passive view!

Consulta de preços de mercadorias.

Model: fica a conexão com o banco de dados. Seria o DAO

Presenter: tem uma instância do model para realizar consultas no  bd, 
e uma instância da interface view para comunicação com a view de forma indireta.

View: tem uma instância de presenter e implementa a interface view.
O que ela faz?
prove interação do usuário com o sitema, neste caso ela possibilita uma tela consulta por nome do produto, e exibe dados
 
Interface view:
metodos necessarios para o presenter

------------

Informações sobre o trabalho - 

**Professor:** Thiago Delgado Pinto <br>
**Universidade:** Centro Federal de Educação Tecnológica Celso Suckow da Fonseca <br>

**Alunos:**
Matheus de Castro Pelegrino 	- matheuscastroweb@gmail.com  <br>
Gabrielly Ezequiel Corrêa  	- gabriellyezequiel_@hotmail.com <br>
Cleiton da Silva Baloneker	- cleitonbaloneker@gmail.com <br>
Aldair Camargo Duarte Klein 	- camargoterabyte@gmail.com <br>
Artur Pedroza Ferreira 		- petsqui@gmail.com <br>
Conrado de Menezes Schuenck 	- conradomschuenck54@gmail.com <br>


