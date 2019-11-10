# MVP-examples

Trabalho apresentado a disciplina de Proj. e arquitetura de Software referente a utilização do padrão **MVP** (Model-View-Presenter) na linguagem Java.

Neste contexto, será demonstrado a subdivisão das responsabilidades utilizando o padrão em questão além da documentação de cada parte do código. 

![Diagram](https://user-images.githubusercontent.com/45601574/68478678-3b3f7180-020f-11ea-9078-261fd4e5e657.png)

------------

O padrão MVP(Model-View-Presenter) é uma variante do padrão MVC(Model-View-Controller) foi projetado principalmente para tornar mais fácil para o teste de unidade. O gráfico fornecido abaixo descreve a arquitetura do padrão MVP:

![Diagram2](https://user-images.githubusercontent.com/45601574/68483874-0fc28400-021b-11ea-9570-2e1108f30b40.png)

Retirado do livro: RAJ, Pethuru et al. Architectural Patterns. 2017. Packt.

#### Java - Sorveteria 

![Sorveteria](https://user-images.githubusercontent.com/45601574/68550074-4a284e80-03de-11ea-8e59-c6ed337424c7.png)
#### Java - Mercado 

![Mercado](https://user-images.githubusercontent.com/45601574/68550073-4a284e80-03de-11ea-828c-a315aa7f87cc.png)

#### Vantagens: 

As vantagens do MVP estão ligadas ao seu propósito de separar de forma clara os seus componentes, como pôde ser visto anteriormente, a View e o Model não têm referências um do outro e o Presenter utiliza uma interface para se conectar a View. Com essa separação o Presenter pode ser testado independente dos outros componentes e isso faz com que o sistema possa ser testado de forma mais fácil.
A manutenção pode ser feita de forma mais fácil pelo fato de toda a parte lógica está apenas no presenter.
Isso também contribui com a velocidade do desenvolvimento do sistema, pois os desenvolvedores não precisam esperar o término da View para poder começar a fazer o Presenter.

#### Desvantagens:

 As desvantagens estão associadas ao risco do Presenter se tornar grande com o passar do tempo pelo risco de acumulo de métodos adicionais, o que pode dificultar a sua manutenção.
O fato de ter que criar outra forma de conectar a View e o Presenter também pode tornar o MVP mais trabalhoso em relação ao MVC.

#### As diferenças entre o MVC e o MCP

Com todas as pesquisas realizadas podemos perceber que a principal diferença entre o MVP e o MVC está na relação do Presenter e do Controler com a View, onde diferente do Presenter o Controler se relaciona diretamente com a View. Também podemos observar que o MVP é mais utilizado em grandes aplicações, onde há uma grande interação do usuário e as views são mais complexas, essa preferência ocorre pelo fato de que seria necessário contar com vários Controllers para realizar esse papel e no MVP é necessário apenas um Presenter.

#### Implementação - Passive view

Model: Este componente especifica os dados a serem exibidos ou/e enviados de ou para a interface do usuário.

Presenter: Ele é responsável por buscar dados do modelo, aplicar lógica apropriada e enviá-los de volta para exibição na view. Tem uma instância do model para realizar consultas no banco de dados,  e uma instância da interface view para comunicação com a view de forma indireta.

View: O componente view apenas atua como uma interface passiva. Ele exibe dados do modelo e envia entradas e comandos do usuário ao componente do apresentador. Essas entradas e comandos do usuário serão usados para executar operações nos dados. Tem uma instância de presenter e implementa a interface view. O que ela faz? Promove interação do usuário com o sitema, neste caso ela possibilita uma tela consulta por nome do produto, e exibe dados. O usuário final interage apenas com a View. 

Interface view: Métodos necessarios para o presenter

------------

#### Referências:

- FOWLER, Martin. Model-View-Presenter (MVP). Disponível em: <https://martinfowler.com/eaaDev/uiArchs.html#Model-view-presentermvp>. Acesso em: 08 de nov. de 2019.
- FOWLER, Martin et al. Padrões de Arquitetura de Aplicações Corporativas. 2007. Bookman.]]
- OSMANI, Addy.Learning JavaScript Design Patterns.2012. O'Relly
- POTEL, Mike. MVP: Model-View-Presenter The Taligent Programming Model for C++ and Java. Disponível em: <http://www.wildcrest.com/Potel/Portfolio/mvp.pdf>. Acesso em: 08 de nov. de 2019.
- RAJ, Pethuru et al. Architectural Patterns. 2017. Packt


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


