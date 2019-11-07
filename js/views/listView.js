function ListView() {
	/**
	 * Na qual a lógica por trás da interface do usuário é manipulada, com eventos da interface do usuário, visualização de dados e outra lógica centrada na interface do usuário
	 */

	var html;

	function init() {
		html = $("<div class='text-center mt-3'>" +
			"<h1 class='my-4'>Postagens</h1>" +
			"<ul class=' list-group' id='tasklist'></ul>" +
			"<input id='taskinput' placeholder='Adicione aqui'/> <input class='border-0 btn-sm btn-success' id='submittask' type='submit' value='Enviar'/>" +
			"</div>");
	}

	var public = {

		getHtml: function () {
			return html;
		},

		addCreateTaskHandler: function (handler) {
			html.find("#submittask").click(function () {
				var newTaskTitle = html.find("#taskinput").val();
				html.find("#taskinput").val("");
				handler(newTaskTitle);
			});
		},

		//Adicionar tarefa passa uma View por parâmetro 
		addTask: function (taskView) {

			//Adiciona no ID tasklist a taskview
			html.find("#tasklist").append(taskView.getHtml());
		}
	}

	//Chama a função iniciar 
	init();
	return public;
}

/**
 * O principal objetivo do MVP é dissociar diferentes aspectos do código. Normalmente, em JavaScript, existem três aspectos principais:

Manipulação de eventos
Manipulação de DOM
Comunicação com o servidor (chamadas AJAX)
Para cada uma dessas preocupações, há um termo correspondente do MVP:

EventHandling = Presenter
Manipulação DOM = View
Chamadas AJAX = Model
 */