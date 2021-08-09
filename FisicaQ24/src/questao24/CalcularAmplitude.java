package questao24;

import javax.swing.JOptionPane;

public class CalcularAmplitude {
	//ATRIBUTOS
	private double k;
	private double mMenor;
	private double mMaior;
	private double ue;
	private double d;
	private double g = 9.8;

	//MÉTODO CONSTRUTOR
	
	public CalcularAmplitude(double k, double mMenor, double mMaior, double ue) {
		super();
		this.k = k;
		this.mMenor = mMenor;
		this.mMaior = mMaior;
		this.ue = ue;
		
		calcAmplitude();
	}

	//MÉTODO ESPECIAL
	public void calcAmplitude(){
		double somaMassas = mMenor + mMaior; 
		
		d = ((ue * g * somaMassas) / k);

		JOptionPane.showMessageDialog(null, "Amplitude: "  + d + " m");

	}

	//MÉTODOS ACESSORES
	public void setK(double k) {
		this.k = k;
	}

	public void setmMenor(double mMenor) {
		this.mMenor = mMenor;
	}

	public void setmMaior(double mMaior) {
		this.mMaior = mMaior;
	}

	public void setUe(double ue) {
		this.ue = ue;
	}

	public void setD(double d) {
		this.d = d;
	}
	
	


}
