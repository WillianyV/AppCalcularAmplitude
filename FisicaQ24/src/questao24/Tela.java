package questao24;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela extends JFrame{

	private JLabel mMaiorLabel,mMenorLabel,kLabel,ueLabel,calcAmplitudeLabel;
	private JTextField mMaiorField,mMenorField,kField,ueField;
	private JButton calcularButton;
	
	public Tela(){
		setSize(200,280);
		setResizable(false);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		calcAmplitudeLabel = new JLabel("**Calcular Amplitude**");
		mMaiorLabel = new JLabel("MASSA DO BLOCO MAIOR:");
		mMaiorField = new JTextField(10);
		mMenorLabel = new JLabel("MASSA DO BLOCO MENOR:");
		mMenorField = new JTextField(10);
		kLabel = new JLabel("CONSTANTE ELASTICA:");
		kField = new JTextField(10);
		ueLabel = new JLabel("COEFICIENTE DO ATRITO");
		ueField = new JTextField(10);
		calcularButton = new JButton("Calcular");
		
		add(calcAmplitudeLabel);
		add(mMaiorLabel);
		add(mMaiorField);
		add(mMenorLabel);
		add(mMenorField);
		add(kLabel);
		add(kField);
		add(ueLabel);
		add(ueField);
		add(calcularButton);
		
		setVisible(true);		
	}

	public JLabel getmMaiorLabel() {
		return mMaiorLabel;
	}

	public void setmMaiorLabel(JLabel mMaiorLabel) {
		this.mMaiorLabel = mMaiorLabel;
	}

	public JLabel getmMenorLabel() {
		return mMenorLabel;
	}

	public void setmMenorLabel(JLabel mMenorLabel) {
		this.mMenorLabel = mMenorLabel;
	}

	public JLabel getkLabel() {
		return kLabel;
	}

	public void setkLabel(JLabel kLabel) {
		this.kLabel = kLabel;
	}

	public JLabel getUeLabel() {
		return ueLabel;
	}

	public void setUeLabel(JLabel ueLabel) {
		this.ueLabel = ueLabel;
	}

	public JLabel getCalcAmplitudeLabel() {
		return calcAmplitudeLabel;
	}

	public void setCalcAmplitudeLabel(JLabel calcAmplitudeLabel) {
		this.calcAmplitudeLabel = calcAmplitudeLabel;
	}

	public JTextField getmMaiorField() {
		return mMaiorField;
	}

	public void setmMaiorField(JTextField mMaiorField) {
		this.mMaiorField = mMaiorField;
	}

	public JTextField getmMenorField() {
		return mMenorField;
	}

	public void setmMenorField(JTextField mMenorField) {
		this.mMenorField = mMenorField;
	}

	public JTextField getkField() {
		return kField;
	}

	public void setkField(JTextField kField) {
		this.kField = kField;
	}

	public JTextField getUeField() {
		return ueField;
	}

	public void setUeField(JTextField ueField) {
		this.ueField = ueField;
	}

	public JButton getCalcularButton() {
		return calcularButton;
	}

	public void setCalcularButton(JButton calcularButton) {
		this.calcularButton = calcularButton;
	}
	
	
}
