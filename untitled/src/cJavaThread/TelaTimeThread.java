package cJavaThread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TelaTimeThread extends JDialog {
//JDialog freamework do java pa criar algo com desktop
  private JPanel jpanel = new JPanel(new GridBagLayout());//painel de componentes

  private JLabel descricaoHora = new JLabel("time thread1");
  private JTextField mostraTempo = new JTextField();

  private JLabel descricaoHora2 = new JLabel("time thread2"); //titulo para o texto abaixo
  private JTextField mostraTempo2 = new JTextField(); //escrever o texto

  private JButton jButton = new JButton("Start"); //button

  private JButton jButton2 = new JButton("Stop"); //button

  private Runnable thread1 = new Runnable() {
    @Override
    public void run() {
     while (true) {
       mostraTempo.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").format(Calendar.getInstance().getTime()));
       try {
         Thread.sleep(1000);//pausa de 1 segundo a cada interação pra n travar
       }catch (InterruptedException e) {
           e.printStackTrace();
       }
     }
    }
  };

  private Thread thread1Time; //instacia ele encima pra ser acessivel das área abaixo

  private Runnable thread2 = new Runnable() {
    @Override
    public void run() {
      while (true) {
        mostraTempo2.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").format(Calendar.getInstance().getTime()));
        try {
          Thread.sleep(1000);//pausa de 1 segundo a cada interação pra n travar
        }catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
  };

  private Thread thread2Time;

  //construtor
  public TelaTimeThread() {//executa oque tiver dentro na abertura de execução

    setTitle("Minha tela de time com Thread"); //vem da super classe JDialog extendida
    setSize(new Dimension(240, 240));//largura e altura da tela
    setLocationRelativeTo(null);//executa a tela no meio
    setResizable(false); //n deixa mais almentar ou diminuir a tela fica no tamanho padrão decidido
     /* Primeira parte concluida*/

    //Controlador de posicionamentos  de componentes
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0; //posição  que via ficar os textos etc
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 2; //2 de espaço os componente de baixo ocupa o de button 1
    gridBagConstraints.insets = new Insets(5, 10, 5, 5); //distanciamento dos componentes
    gridBagConstraints.anchor = GridBagConstraints.WEST; //alinha eles a esquerda

    //tamanho que vai ficar em tela label
    descricaoHora.setPreferredSize(new Dimension(200, 24));
    //onde ele vai ficar dentro do painel
    jpanel.add(descricaoHora, gridBagConstraints); //adicionar os dados do panel que criamos

    mostraTempo.setPreferredSize(new Dimension(200, 25));
    gridBagConstraints.gridy ++; //adiciona uma posição no painel pro elemento fica embaixo dele
    mostraTempo.setEditable(false); //não deixa o campo editavel para ecrevel dentro dele
    jpanel.add(mostraTempo, gridBagConstraints);

    descricaoHora2.setPreferredSize(new Dimension(200, 25));
    gridBagConstraints.gridy ++; //anda de posição
    jpanel.add(descricaoHora2, gridBagConstraints); //gridbag descriçao do layout da telinha

    mostraTempo2.setPreferredSize(new Dimension(200, 25));
    gridBagConstraints.gridy ++; //adiciona uma posição no painel pro elemento fica embaixo dele
    mostraTempo2.setEditable(false);
    jpanel.add(mostraTempo2, gridBagConstraints);//gerenciado de layout grid

    //------------------------------------------------------------------------------------------------------------------
    gridBagConstraints.gridwidth = 1; //tamanho que os button volta a ocupar em largura são 1 ai fica alinhado

    jButton.setPreferredSize(new Dimension(92, 25));
    gridBagConstraints.gridy ++; //anda mais uma posição em nossa coluna
    jpanel.add(jButton, gridBagConstraints);

    jButton2.setPreferredSize(new Dimension(92, 25));//tamanho do button
    gridBagConstraints.gridx ++; //anda mais uma posição na linha fica do lado do button acima
    jpanel.add(jButton2, gridBagConstraints);//adiciona ele ao painel

    jButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) { //executa o clique no button
         thread1Time = new Thread(thread1); //passa o runnable, thread1 que é o Thread instaciado os dois
        //que vai ficar executando nossa data com nosso campo de texto
        thread1Time.start();//qnd der esse start ele vai ficar executando por trás dos panos esse run colocando as data
      }
    });

    jButton2.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        thread1Time.stop(); //pro button stop parar o relogio
      }
    });

    jButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) { //executa o clique no button
        thread2Time = new Thread(thread2); //passa o runnable, thread1 que é o Thread instaciado os dois
        //que vai ficar executando nossa data com nosso campo de texto
        thread2Time.start();//qnd der esse start ele vai ficar executando por trás dos panos esse run colocando as data
      }
    });

    jButton2.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        thread2Time.stop(); //pro button stop parar o relogio
      }
    });



    add(jpanel, BorderLayout.WEST);//adicionando o painel
     //sempre sera o último comando executa os comando de cima primeiro
    setVisible(true);//torna a tela visivel para o usuario
  }
}
