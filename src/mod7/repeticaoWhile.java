package mod7;

public class repeticaoWhile {
	// m�todo auto executavel
	public static void main(String[] args) {

		/* estrutura de repeti��o while */
		int numero = 0;
		
		while (numero <= 15) {//verifica e depois executa
			System.out.println("Numero: " + numero);
			numero ++;
		}
		/*********************************/
		int numero1 = 0;
		do { //primeiro executa e depois verifica
			System.out.println("N�mero atual: " + numero1);
			numero1 ++;
		}while(numero1 <= 5); 
		
	}

}
