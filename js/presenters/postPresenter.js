function PostPresenter(_view) {
	/**
	 * Onde está a lógica por trás da funcionalidade dos widgets, como manipulação de dados, armazenamento e carregamento de dados, eventos de aplicativos, etc.
	 */
	var view;
	var model;

	function init() {
		view = _view;
		view.addCheckedHandler(function () {
			view.remove();
		});
	}

	var public = {
		getView: function () {
			return view;
		},
		setModel: function (_model) {
			model = _model;
			view.setModel(model);
		}
	}

	init();
	return public;
}