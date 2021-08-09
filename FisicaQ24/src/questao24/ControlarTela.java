package questao24;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ControlarTela {
	Tela tela;

	public ControlarTela(Tela tela) {
		this.tela = tela;
		controlar();
	}
	
	public void controlar(){
		tela.getCalcularButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					CalcularAmplitude ca = new CalcularAmplitude(Double.parseDouble(tela.getkField().getText()), 
							Double.parseDouble(tela.getmMenorField().getText()),
							Double.parseDouble(tela.getmMaiorField().getText()),
							Double.parseDouble(tela.getUeField().getText()));
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "ERRO");
				}
				
				tela.getmMaiorField().setText(null);
				tela.getmMenorField().setText(null);
				tela.getkField().setText(null);
				tela.getUeField().setText(null);
			}
		});
	}
	
}
