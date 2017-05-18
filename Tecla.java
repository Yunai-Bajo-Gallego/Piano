import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Tecla
  extends JPanel
{
  private JLabel sep;
  private JLabel sep1;
  private JLabel tx1;
  private JLabel tx2;
  
  public Tecla()
  {
    initComponents();
    setVisible(true);
  }
  
  public int ancho()
  {
    return getWidth();
  }
  
  public int altura()
  {
    return getHeight();
  }
  
  public void setTx1(String tx1)
  {
    this.tx1.setText(tx1);
  }
  
  public void setTx2(String tx2)
  {
    this.tx2.setText(tx2);
  }
  
  public JLabel getTx1()
  {
    return this.tx1;
  }
  
  public JLabel getTx2()
  {
    return this.tx2;
  }
  
  public void paint(Graphics2D g)
  {
    g.setColor(Color.pink);
    g.fillRect(getX(), getY(), 20, 20);
  }
  
  private void initComponents()
  {
    this.sep = new JLabel();
    this.sep1 = new JLabel();
    this.tx1 = new JLabel();
    this.tx2 = new JLabel();
    
    setBackground(new Color(255, 255, 255));
    setForeground(new Color(0, 0, 255));
    setPreferredSize(new Dimension(50, 200));
    
    this.sep.setBackground(new Color(255, 204, 0));
    this.sep.setOpaque(true);
    
    this.sep1.setBackground(new Color(255, 204, 0));
    this.sep1.setOpaque(true);
    
    this.tx1.setHorizontalAlignment(0);
    this.tx1.setText("Q");
    
    this.tx2.setText("DO / C");
    
    GroupLayout layout = new GroupLayout(this);
    setLayout(layout);
    layout.setHorizontalGroup(layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
      .addComponent(this.sep1, -2, 2, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
      .addComponent(this.tx2, -1, -1, 32767)
      .addComponent(this.tx1, -1, -1, 32767))
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 8, 32767)
      .addComponent(this.sep, -2, 2, -2)));
    
    layout.setVerticalGroup(layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.sep, -1, -1, 32767)
      .addComponent(this.sep1, -1, 200, 32767)
      .addGroup(layout.createSequentialGroup()
      .addGap(41, 41, 41)
      .addComponent(this.tx1)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
      .addComponent(this.tx2)
      .addGap(34, 34, 34)));
  }
}
