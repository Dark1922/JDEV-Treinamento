package mod9;
import mod9.calcMedia;
public class Aluno {
	
	public static void main(String[] args) {
		
		calcMedia calc = new calcMedia();
		calc.setNota1(90);
		calc.setNota2(80);
		calc.setNota3(77);
		calc.setNota4(60);
		System.out.println("Média da nota é: " + calc.getMedia());
	}

}
