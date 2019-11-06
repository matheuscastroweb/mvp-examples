function PostModel(_text) {
    /**
     * No qual o modelo de dados para o widget está definido.
     */

    /**
     * @var ID recebe
     */
    var ID = (

        
    new Date()).getTime();

    this.getID = function () {
     return ID;
    }



    /**
     * @var Text armazena o texto enviado para o parâmetro _text
     */
    var Text = _text;
    this.getText = function () {
        console.log(Text);
        return Text;
    }
    this.setText = function (value) {
        Text = value;
    }
}
