function TaskView() {
	/**
	 * Na qual a lógica por trás da interface do usuário é manipulada, com eventos da interface do usuário, visualização de dados e outra lógica centrada na interface do usuário
	 */
	var html;

	function init() {
		html = $("<li><input class='btn-sm border-0' type='button' value='x'/><label class=''></label></li>");
	}

	//Imaginar como um json
	var public = {
		
		getHtml: function () {
			return html;
		},
		setModel: function (model) {
			html.find("input").attr("id", model.getID());
			html.find("label").attr("for", model.getID());
			html.find("label").html(model.getText());
		},
		addCheckedHandler: function (handler) {
			html.find("input").click(handler);
		},
		remove: function () {
			html.remove();
		}
	}

	init();
	return public;
}