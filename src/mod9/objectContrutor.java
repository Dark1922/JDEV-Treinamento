package mod9;

import mod9.classObject;
public class objectContrutor {
	
	//objeto ainda n existe na memoria
	classObject aluno;
	
	//Agora temos um objeto real na memoria
	//um objeto representa um mundo real
	//ele pega todas classes do msm package ou outro
	//e instancia aqui com suas classes massa
	classObject aluno1 = new classObject();
	
	classObject aluno2 = new classObject();//construtor padrao
	
	classObject aluno3 = new classObject("joao");
	classObject aluno4 = new classObject("john", 10);//construtor com parametro
	
	//classObject aluno5 = new  
	

}
