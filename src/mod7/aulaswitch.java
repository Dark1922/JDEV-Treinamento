package mod7;

public class aulaswitch {
	public static void main(String[] args) {
		int nota1 = 70;
		int nota2 = 70;
		int nota3 =70;
		int nota4 = 70;
		int media = 0;
		media = (nota1 + nota2 + nota3 + nota4 )/4;
		
		 /*Operações exatas */
		int dia = 2;
		switch (dia) {
		case 1: 
			System.out.print("Domingo");
	    break;
		case 2: 
			System.out.println("Segunda");
		break;
		case 3: 
			System.out.println("Terça");
		break;
		
		default: System.out.println("Outro dia");
			  break;
			
		}
	}

}
