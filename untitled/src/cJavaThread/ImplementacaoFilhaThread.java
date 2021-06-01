package cJavaThread;

import com.sun.source.tree.SynchronizedTree;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilhaThread extends Thread {//para usar os recursos do thread ai se extender
  //estatico pq essa filha tem que ser única pramim
   private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_filha = new ConcurrentLinkedQueue<ObjetoFilaThread>();
  //vai receber o objeto
   public static void add(ObjetoFilaThread objetoFilaThread) {
     pilha_filha.add(objetoFilaThread); //vai adicionando objetos nessa lista
   }//objeto com os dados da tela vai receber

  @Override
  public void run() { //run control espaço fica processando ent tiver dados na lista

     System.out.println("filha rodando");


    while (true) {

      synchronized (pilha_filha) {//bloquear o acesso a esta lista por outros processos
        Iterator iteracao = pilha_filha.iterator(); //iterador pra pecorrer essa lista
        while (iteracao.hasNext()) {//enquanto tiver dados na lista ira processar

        ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();//pega o objeto atual e processa oque quiser
        //Processar 10 mil notas ficais por exemplo
        //gerar uma lista enorme de pdf
        //gerar um envio em massa de email
        System.out.println("---------------------------------------");
        System.out.println(processar.getEmail());
        System.out.println(processar.getNome());


        iteracao.remove();//e remove qnd faz oque quiser no processo

        try {
          Thread.sleep(100);//da um tempo essencial para descarga de memória
        } catch (InterruptedException e) {
          e.printStackTrace();
        }

      }

    }


    try {
      Thread.sleep(1000); //processou toda a lista da um tempo para a limpeza de memoria
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}

}
