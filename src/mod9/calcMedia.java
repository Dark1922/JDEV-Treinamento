package mod9;

public class calcMedia {
		
		private double nota1;
		private double nota2;
		private double nota3;
		private double nota4;
		public double getNota1() {
			return nota1;
		}
		public void setNota1(double nota1) {
			this.nota1 = nota1;
		}
		public double getNota2() {
			return nota2;
		}
		public void setNota2(double nota2) {
			this.nota2 = nota2;
		}
		public double getNota3() {
			return nota3;
		}
		public void setNota3(double nota3) {
			this.nota3 = nota3;
		}
		public double getNota4() {
			return nota4;
		}
		public void setNota4(double nota4) {
			this.nota4 = nota4;
		}
		
		//média do aluno metodo que retorna ela
		public double getMedia() {
			return (nota1 + nota2 + nota3 + nota4) /4;
			
		}
		//Método true para aprovado false para reprovado com base na nota
		public boolean getAlunoAprovado() {
			double media = this.getMedia();
			if (media >= 70) {
				return true;
			}else {
				return false;
			}
		}
		
		//método que retorna mensagem pra aprovado e reprovado com base na nota
		public String getAlunoAprovado1() {
			double media = this.getMedia();	
				
			if (media >= 70) {
				return "Aluno aprovado: ";
				
			}else {
				return "Aluno Reprobado";
			}	
			
		}
}
