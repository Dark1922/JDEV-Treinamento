package cJavaThread;

import javax.swing.*;

public class AulaThread {
  public static void main(String[] args) throws InterruptedException {//lança essa exceção

    new Thread() {

      public  void run() {//C[pdogp da rotina
        //código que eu quero executar da rotina em paralelo
        for(int i = 0; i < 10;  i++) {

          //queria enviar isso com um tempo de parada e com tempo de envio determinaddo
          System.out.println("Executando algo " + (i + 1) + " vez ");

          try {

          Thread.sleep(1000);

        }catch (InterruptedException e) {

                 e.printStackTrace();
          }

        }

      }
    }.start();//start liga a thread que fica processando paralelamente por trás


    //Código do usuario continuo o fluxo do trabalho
      System.out.println("\n O CÓDIGO CHEGOU AO FIM ");
    //Fluxo do sistema cadastro de venda ou emissão de nota fiscal algo do tipo
    JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");
  }
}
