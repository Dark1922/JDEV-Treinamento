package mod7;

public class repForBreak {
	
	public static void main(String[] args) {
		
		for (int numero = 0; numero <= 10; numero ++) {
			if (numero == 3) {//qnd encontrar o numero 3 vai dar a msg abaixo
				System.out.println("Oba, encontrei o numero 3 ");
				System.out.println("estou parando de executar..");
				break;
			}
		}
		
	}

}
