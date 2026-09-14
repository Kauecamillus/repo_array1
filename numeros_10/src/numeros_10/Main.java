package numeros_10;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		
		String numeros[] = new String[10];
			
			for(int i = 0; i < 10; i++) {
				String num = JOptionPane.showInputDialog(null, "Insira um número.");
				numeros[i] = num;
			}
			JOptionPane.showMessageDialog(null, numeros);
	}

}
