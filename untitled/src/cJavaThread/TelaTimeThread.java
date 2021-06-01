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

  private JLabel descricaoHora = new JLabel("Nome");
  private JTextField mostraTempo = new JTextField();

  private JLabel descricaoHora2 = new JLabel("Email"); //titulo para o texto abaixo
  private JTextField mostraTempo2 = new JTextField(); //escrever o texto

  private JButton jButton = new JButton("Add Lista"); //button

  private JButton jButton2 = new JButton("Stop"); //button

  private ImplementacaoFilhaThread fila = new ImplementacaoFilhaThread();//qnd a tela inicia vai ter a fila
  //instanciado dentro

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

    jpanel.add(mostraTempo, gridBagConstraints);

    descricaoHora2.setPreferredSize(new Dimension(200, 25));
    gridBagConstraints.gridy ++; //anda de posição
    jpanel.add(descricaoHora2, gridBagConstraints); //gridbag descriçao do layout da telinha

    mostraTempo2.setPreferredSize(new Dimension(200, 25));
    gridBagConstraints.gridy ++; //adiciona uma posição no painel pro elemento fica embaixo dele

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

        if (fila == null) { //se clicar no stop e ela fica null
          fila = new ImplementacaoFilhaThread(); //iniciar um novo objeto
          fila.start(); //dar um start na fila

        }

        for(int i = 0; i < 100 ; i++) { //simulando 100 envios em massa

        ObjetoFilaThread filaThread = new ObjetoFilaThread();
        filaThread.setNome(mostraTempo.getText());
        filaThread.setEmail(mostraTempo2.getText() + " - "  + (i + 1));

       fila.add(filaThread);
        }
      }
    });

    jButton2.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
           fila.stop();
           fila = null; //stop no thread e mata esse objeto
      }
    });


    fila.start();
    add(jpanel, BorderLayout.WEST);//adicionando o painel
     //sempre sera o último comando executa os comando de cima primeiro
    setVisible(true);//torna a tela visivel para o usuario
  }
}
