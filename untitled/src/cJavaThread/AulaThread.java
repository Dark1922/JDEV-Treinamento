package cJavaThread;

import javax.swing.*;

public class AulaThread {
  public static void main(String[] args) throws InterruptedException {//lança essa exceção

   Thread threadEmail = new Thread(thread1);
   threadEmail.start();
    /*******************************Divisão thread****************************************/
    Thread thredEnviaFuncao = new Thread(thread2);
    thredEnviaFuncao.start();



      System.out.println("\n O CÓDIGO CHEGOU AO FIM ");

    JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");
  }
  private static Runnable thread2 = new Runnable() {
    @Override
    public void run() {
      for(int i = 0; i < 10;  i++) {

        //queria enviar isso com um tempo de parada e com tempo de envio determinaddo
        System.out.println("Executando algo " + (i + 1) + " vez ");

        try {//jeito de capturar erro no thread

          Thread.sleep(1000);

        }catch (InterruptedException e) {

          e.printStackTrace();
        }

      }
    }
  };

  private static Runnable thread1 = new Runnable() {
    @Override
    public void run() {
      for(int i = 0; i < 10;  i++) {

        //queria enviar isso com um tempo de parada e com tempo de envio determinaddo
        System.out.println("Executando Envio de email " + (i + 1) + " Efetuado com sucesso ");

        try {//jeito de capturar erro no thread

          Thread.sleep(2000);

        }catch (InterruptedException e) {

          e.printStackTrace();
        }

      }

    }
  };
  //private pq vai só trabalhar com ele nessa classe estatico por causa od método main
}
