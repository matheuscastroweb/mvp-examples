package teste;

import javax.swing.JOptionPane;

import model.Model;
import presenter.Presenter;
import view.View;

public class Main {

	public static void main(String[] args) {
		
		View view = new View();
		Model m = new Model();
		
		
		try{
			view.listarSabor();
			view.escolherSabor(2);
		}catch(NullPointerException e) {
			JOptionPane.showMessageDialog(null, "NetDevices list is null - No devices saved", "Saving NetDevices", JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
