package mod7;

public class repForContinue {
	
	public static void main(String[] args) {
		
		for (int numero = 0; numero <= 10; numero ++) {
			if (numero == 3 || 	numero == 6 || numero == 9) {
				System.out.println("Opa, escontrei o numero: " + numero);
				//pode se usar em uma lista de produtos  processando eles pelos nome 
				//tipo ma�a e um dos produto que est� em desconto
				continue; //ignora oq tem pra baixo volta o c�digo e processa a instru��o acima
			}
			System.out.println("Processando la�o de repeti��o");
			
		}  
	}

}
