function ListPresenter(_view) {
	/**
	 * Onde está a lógica por trás da funcionalidade dos widgets, como manipulação de dados, armazenamento e carregamento de dados, eventos de aplicativos, etc.
	 */
	var view;

	function init() {
		view = _view;

		view.addCreateTaskHandler(function (taskTitle) {
			var model = new PostModel(taskTitle);
			var task = new PostPresenter(new PostView());
			task.setModel(model);

			view.addTask(task.getView());
		});

	}

	var public = {
		getView: function () {
			return view;
		}
	}

	init();
	return public;
}
/**
 * Ao trabalhar com o MVP, o apresentador é sua principal pessoa, esse objeto carrega a lógica por trás do seu widget e, portanto, compreende a maior parte do seu código.
 * O apresentador requer a visualização correspondente e um modelo. Quando o apresentador obtém o modelo, ele atualiza a exibição com diferentes manipuladores, e a exibição atualiza a interface do usuário.
 * O apresentador registrará manipuladores na exibição para qualquer evento da interface do usuário que exija alguma lógica.
 * Um grande benefício do MVP é que você pode criar várias visualizações , que podem parecer e se comportar de maneira diferente, mas compartilham o mesmo apresentador. Isso significa que eles compartilham a mesma funcionalidade, mas a interface do usuário parece e se comporta de maneira diferente.
 */