import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedInputStream;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

public class Main
  extends JFrame
{
  private final int ANCHO = 50;
  private final int ALTO = 200;
  private final int ANCHO_N = 25;
  private final int ALTO_N = 100;
  private Clip sonido_do1;
  private Clip sonido_do1s;
  private Clip sonido_re1;
  private Clip sonido_re1s;
  private Clip sonido_mi1;
  private Clip sonido_fa1;
  private Clip sonido_fa1s;
  private Clip sonido_sol1;
  private Clip sonido_sol1s;
  private Clip sonido_la1;
  private Clip sonido_la1s;
  private Clip sonido_si1;
  private Clip sonido_do2;
  private Clip sonido_do2s;
  private Clip sonido_re2;
  private Clip sonido_re2s;
  private Clip sonido_mi2;
  private Clip sonido_fa2;
  private Clip sonido_fa2s;
  private Clip sonido_sol2;
  private Clip sonido_sol2s;
  private Clip sonido_la2;
  private Clip sonido_la2s;
  private Clip sonido_si2;
  Tecla do1;
  Tecla do1s;
  Tecla re1;
  Tecla re1s;
  Tecla mi1;
  Tecla fa1;
  Tecla fa1s;
  Tecla sol1;
  Tecla sol1s;
  Tecla la1;
  Tecla la1s;
  Tecla si1;
  Tecla do2;
  Tecla do2s;
  Tecla re2;
  Tecla re2s;
  Tecla mi2;
  Tecla fa2;
  Tecla fa2s;
  Tecla sol2;
  Tecla sol2s;
  Tecla la2;
  Tecla la2s;
  Tecla si2;
  private JLabel jLabel1;
  private JLabel jLabel2;
  
  public Main()
  {
    initComponents();
    
    getContentPane().setBackground(new Color(242, 235, 246));
    setTitle("Piano || Yunai");
    
    setBounds(0, 0, (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth(), (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight() - 30);
    
    int altura = getHeight() / 2 - 150;
    this.do1 = new Tecla();add(this.do1);this.do1.setBounds(10, altura, 50, 200);int cont = 60;
    this.do1s = new Tecla();add(this.do1s);this.do1s.setBounds(cont, altura, 25, 100);cont += 25;this.do1s.setBackground(Color.black);this.do1s.getTx1().setForeground(Color.blue);
    this.re1 = new Tecla();add(this.re1);this.re1.setBounds(cont, altura, 50, 200);cont += 50;
    this.re1s = new Tecla();add(this.re1s);this.re1s.setBounds(cont, altura, 25, 100);cont += 25;this.re1s.setBackground(Color.black);this.re1s.getTx1().setForeground(Color.blue);
    this.mi1 = new Tecla();add(this.mi1);this.mi1.setBounds(cont, altura, 50, 200);cont += 50;
    this.fa1 = new Tecla();add(this.fa1);this.fa1.setBounds(cont, altura, 50, 200);cont += 50;
    this.fa1s = new Tecla();add(this.fa1s);this.fa1s.setBounds(cont, altura, 25, 100);cont += 25;this.fa1s.setBackground(Color.black);this.fa1s.getTx1().setForeground(Color.blue);
    this.sol1 = new Tecla();add(this.sol1);this.sol1.setBounds(cont, altura, 50, 200);cont += 50;
    this.sol1s = new Tecla();add(this.sol1s);this.sol1s.setBounds(cont, altura, 25, 100);cont += 25;this.sol1s.setBackground(Color.black);this.sol1s.getTx1().setForeground(Color.blue);
    this.la1 = new Tecla();add(this.la1);this.la1.setBounds(cont, altura, 50, 200);cont += 50;
    this.la1s = new Tecla();add(this.la1s);this.la1s.setBounds(cont, altura, 25, 100);cont += 25;this.la1s.setBackground(Color.black);this.la1s.getTx1().setForeground(Color.blue);
    this.si1 = new Tecla();add(this.si1);this.si1.setBounds(cont, altura, 50, 200);cont += 50;
    this.do2 = new Tecla();add(this.do2);this.do2.setBounds(cont, altura, 50, 200);cont += 50;
    this.do2s = new Tecla();add(this.do2s);this.do2s.setBounds(cont, altura, 25, 100);cont += 25;this.do2s.setBackground(Color.black);this.do2s.getTx1().setForeground(Color.blue);
    this.re2 = new Tecla();add(this.re2);this.re2.setBounds(cont, altura, 50, 200);cont += 50;
    this.re2s = new Tecla();add(this.re2s);this.re2s.setBounds(cont, altura, 25, 100);cont += 25;this.re2s.setBackground(Color.black);this.re2s.getTx1().setForeground(Color.blue);
    this.mi2 = new Tecla();add(this.mi2);this.mi2.setBounds(cont, altura, 50, 200);cont += 50;
    this.fa2 = new Tecla();add(this.fa2);this.fa2.setBounds(cont, altura, 50, 200);cont += 50;
    this.fa2s = new Tecla();add(this.fa2s);this.fa2s.setBounds(cont, altura, 25, 100);cont += 25;this.fa2s.setBackground(Color.black);this.fa2s.getTx1().setForeground(Color.blue);
    this.sol2 = new Tecla();add(this.sol2);this.sol2.setBounds(cont, altura, 50, 200);cont += 50;
    this.sol2s = new Tecla();add(this.sol2s);this.sol2s.setBounds(cont, altura, 25, 100);cont += 25;this.sol2s.setBackground(Color.black);this.sol2s.getTx1().setForeground(Color.blue);
    this.la2 = new Tecla();add(this.la2);this.la2.setBounds(cont, altura, 50, 200);cont += 50;
    this.la2s = new Tecla();add(this.la2s);this.la2s.setBounds(cont, altura, 25, 100);cont += 25;this.la2s.setBackground(Color.black);this.la2s.getTx1().setForeground(Color.blue);
    this.si2 = new Tecla();add(this.si2);this.si2.setBounds(cont, altura, 50, 200);cont += 50;
    setBounds(0, 0, cont + 25, 200 + altura + 60);
    setLocationRelativeTo(null);
    this.re1.setTx1("W");this.re1.setTx2("RE / D");
    this.mi1.setTx1("E");this.mi1.setTx2("MI / E");
    this.fa1.setTx1("R");this.fa1.setTx2("FA / F");
    this.sol1.setTx1("T");this.sol1.setTx2("SOL / G");
    this.la1.setTx1("Y");this.la1.setTx2("LA / A");
    this.si1.setTx1("U");this.si1.setTx2("SI / B");
    this.do2.setTx1("Z");this.do2.setTx2("DO / C");
    this.re2.setTx1("X");this.re2.setTx2("RE / D");
    this.mi2.setTx1("C");this.mi2.setTx2("MI / E");
    this.fa2.setTx1("V");this.fa2.setTx2("FA / F");
    this.sol2.setTx1("B");this.sol2.setTx2("SOL / G");
    this.la2.setTx1("N");this.la2.setTx2("LA / A");
    this.si2.setTx1("M");this.si2.setTx2("SI / B");
    
    this.do1s.setTx1("2");this.do1s.setTx2("");
    this.re1s.setTx1("3");this.re1s.setTx2("");
    this.fa1s.setTx1("5");this.fa1s.setTx2("");
    this.sol1s.setTx1("6");this.sol1s.setTx2("");
    this.la1s.setTx1("7");this.la1s.setTx2("");
    
    this.do2s.setTx1("S");this.do2s.setTx2("");
    this.re2s.setTx1("D");this.re2s.setTx2("");
    this.fa2s.setTx1("G");this.fa2s.setTx2("");
    this.sol2s.setTx1("H");this.sol2s.setTx2("");
    this.la2s.setTx1("I");this.la2s.setTx2("");
  }
  
  public void sonido(String nombre, Clip a)
  {
    try
    {
      BufferedInputStream bis = new BufferedInputStream(getClass().getResourceAsStream("sonidos/" + nombre + ".wav"));
      AudioInputStream ais = AudioSystem.getAudioInputStream(bis);
      a = AudioSystem.getClip();
      
      a.open(ais);
      
      a.start();
    }
    catch (Exception e)
    {
      System.out.println("" + e);
    }
  }
  
  private void initComponents()
  {
    this.jLabel1 = new JLabel();
    this.jLabel2 = new JLabel();
    
    setDefaultCloseOperation(3);
    setTitle("Piano || Yunai");
    setBackground(new Color(204, 102, 0));
    setForeground(Color.white);
    addKeyListener(new KeyAdapter()
    {
      public void keyPressed(KeyEvent evt)
      {
        Main.this.formKeyPressed(evt);
      }
      
      public void keyReleased(KeyEvent evt)
      {
        Main.this.formKeyReleased(evt);
      }
    });
    this.jLabel1.setBackground(new Color(255, 255, 255));
    this.jLabel1.setFont(new Font("Copperplate Gothic Bold", 0, 12));
    this.jLabel1.setForeground(new Color(153, 153, 153));
    this.jLabel1.setText("(C) Creado y programado por Yunai");
    
    this.jLabel2.setFont(new Font("Segoe UI Semibold", 0, 36));
    this.jLabel2.setHorizontalAlignment(0);
    this.jLabel2.setText("Free Piano");
    
    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
      .addContainerGap()
      .addComponent(this.jLabel1)
      .addContainerGap(551, 32767))
      .addComponent(this.jLabel2, -1, -1, 32767));
    
    layout.setVerticalGroup(layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
      .addContainerGap()
      .addComponent(this.jLabel1)
      .addGap(26, 26, 26)
      .addComponent(this.jLabel2, -2, 110, -2)
      .addContainerGap(179, 32767)));
    
    pack();
  }
  
  private void formKeyPressed(KeyEvent evt)
  {
    char x = evt.getKeyChar();
    switch (x)
    {
    case 'q': 
      sonido("do3", this.sonido_do1);this.do1.setBackground(Color.cyan); break;
    case '2': 
      sonido("do3s", this.sonido_do1s);this.do1s.setBackground(Color.GRAY); break;
    case 'w': 
      sonido("re3", this.sonido_re1);this.re1.setBackground(Color.cyan); break;
    case '3': 
      sonido("re3s", this.sonido_re1s);this.re1s.setBackground(Color.GRAY); break;
    case 'e': 
      sonido("mi3", this.sonido_mi1);this.mi1.setBackground(Color.cyan); break;
    case 'r': 
      sonido("fa3", this.sonido_fa1);this.fa1.setBackground(Color.cyan); break;
    case '5': 
      sonido("fa3s", this.sonido_fa1s);this.fa1s.setBackground(Color.GRAY); break;
    case 't': 
      sonido("sol3", this.sonido_sol1);this.sol1.setBackground(Color.cyan); break;
    case '6': 
      sonido("sol3s", this.sonido_sol1s);this.sol1s.setBackground(Color.GRAY); break;
    case 'y': 
      sonido("la3", this.sonido_la1);this.la1.setBackground(Color.cyan); break;
    case '7': 
      sonido("la3s", this.sonido_la1s);this.la1s.setBackground(Color.GRAY); break;
    case 'u': 
      sonido("si3", this.sonido_si1);this.si1.setBackground(Color.cyan); break;
    case 'z': 
      sonido("do4", this.sonido_do2);this.do2.setBackground(Color.cyan); break;
    case 's': 
      sonido("do4s", this.sonido_do2s);this.do2s.setBackground(Color.GRAY); break;
    case 'x': 
      sonido("re4", this.sonido_re2);this.re2.setBackground(Color.cyan); break;
    case 'd': 
      sonido("re4s", this.sonido_re2s);this.re2s.setBackground(Color.GRAY); break;
    case 'c': 
      sonido("mi4", this.sonido_mi2);this.mi2.setBackground(Color.cyan); break;
    case 'v': 
      sonido("fa4", this.sonido_fa2);this.fa2.setBackground(Color.cyan); break;
    case 'g': 
      sonido("fa4s", this.sonido_fa2s);this.fa2s.setBackground(Color.GRAY); break;
    case 'b': 
      sonido("sol4", this.sonido_sol2);this.sol2.setBackground(Color.cyan); break;
    case 'h': 
      sonido("sol4s", this.sonido_sol2s);this.sol2s.setBackground(Color.GRAY); break;
    case 'n': 
      sonido("la4", this.sonido_la2);this.la2.setBackground(Color.cyan); break;
    case 'j': 
      sonido("la4s", this.sonido_la2s);this.la2s.setBackground(Color.GRAY); break;
    case 'm': 
      sonido("si4", this.sonido_si2);this.si2.setBackground(Color.cyan);
    }
  }
  
  private void formKeyReleased(KeyEvent evt)
  {
    char x = evt.getKeyChar();
    switch (x)
    {
    case 'q': 
      this.do1.setBackground(Color.white); break;
    case '2': 
      this.do1s.setBackground(Color.black); break;
    case 'w': 
      this.re1.setBackground(Color.white); break;
    case '3': 
      this.re1s.setBackground(Color.black); break;
    case 'e': 
      this.mi1.setBackground(Color.white); break;
    case 'r': 
      this.fa1.setBackground(Color.white); break;
    case '5': 
      this.fa1s.setBackground(Color.black); break;
    case 't': 
      this.sol1.setBackground(Color.white); break;
    case '6': 
      this.sol1s.setBackground(Color.black); break;
    case 'y': 
      this.la1.setBackground(Color.white); break;
    case '7': 
      this.la1s.setBackground(Color.black); break;
    case 'u': 
      this.si1.setBackground(Color.white); break;
    case 'z': 
      this.do2.setBackground(Color.white); break;
    case 's': 
      this.do2s.setBackground(Color.black); break;
    case 'x': 
      this.re2.setBackground(Color.white); break;
    case 'd': 
      this.re2s.setBackground(Color.black); break;
    case 'c': 
      this.mi2.setBackground(Color.white); break;
    case 'v': 
      this.fa2.setBackground(Color.white); break;
    case 'g': 
      this.fa2s.setBackground(Color.black); break;
    case 'b': 
      this.sol2.setBackground(Color.white); break;
    case 'h': 
      this.sol2s.setBackground(Color.black); break;
    case 'n': 
      this.la2.setBackground(Color.white); break;
    case 'j': 
      this.la2s.setBackground(Color.black); break;
    case 'm': 
      this.si2.setBackground(Color.white);
    }
  }
  
  public static void main(String[] args)
  {
    try
    {
      for (UIManager.LookAndFeelInfo info :  UIManager.getInstalledLookAndFeels()  ) {
        if ("Nimbus".equals(info.getName()))
        {
          UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    }
    catch (ClassNotFoundException ex)
    {
      Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (InstantiationException ex)
    {
      Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (IllegalAccessException ex)
    {
      Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (UnsupportedLookAndFeelException ex)
    {
      Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    }
    EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        new Main().setVisible(true);
      }
    });
  }
}
