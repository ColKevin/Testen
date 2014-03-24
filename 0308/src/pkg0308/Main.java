package pkg0308;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Main extends JFrame {
    public static void main( String arg[] ) {
        JFrame frame = new Main();
        frame.setSize( 400 , 400 );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setTitle( "Voorbeeld 0308" );
        frame.setContentPane( new CirkelPaneel() );
        frame.setVisible(true);
    }
}

class CirkelPaneel extends JPanel {
    private JButton knop;
    private int diameter;
    
    public CirkelPaneel() {
        setBackground( Color.WHITE );
        diameter = 10; 
        knop = new JButton( "Groter" );
        knop.addActionListener( new knopHandler() );
        add( knop ); 
    }
    
    public void paintComponent( Graphics g ) {
        super.paintComponent( g );
        g.setColor( Color.BLUE );
        g.fillOval(diameter, diameter, diameter, diameter);
    }
    
    class knopHandler implements ActionListener{
        public void actionPerformed( ActionEvent e ) {
            diameter++;
            repaint(); 
        }
    }
}

