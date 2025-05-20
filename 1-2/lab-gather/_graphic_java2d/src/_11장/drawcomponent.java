package _11장;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class drawcomponent extends JComponent {
	
	private BufferedImage image;
    
    public void paint( Graphics g ) {
        if ( image == null ) {
            image = new BufferedImage( getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB );
        }
        if ( image.getWidth() != getWidth() || image.getHeight() != getHeight() ) {
            BufferedImage temp = new BufferedImage( getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB );
            Graphics tg = temp.getGraphics();
            tg.drawImage( image, 0, 0, this );
            tg.dispose();
            image = temp;
        }
        g.drawImage( image, 0, 0, this );
        g.setColor( Color.black );
        g.drawRect( 0, 0, getWidth(), getHeight() );
    }
     
    public Graphics2D getGraphics2D() {
        if ( image == null ) {
            image = new BufferedImage( getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB );
        }
        return (Graphics2D)image.getGraphics();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 JFrame f = new JFrame( "DrawComponent Test" );
	        final drawcomponent dc = new drawcomponent();
	        dc.addMouseMotionListener( new MouseMotionAdapter() {
	            public void mouseMoved( MouseEvent e ) {
	                Graphics2D g = dc.getGraphics2D();
	                g.drawOval( e.getX() - 5, e.getY() - 5, 10, 10 );
	                dc.repaint();
	            }
	        } );
	        f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	        f.getContentPane().add( dc );
	        f.setSize( 200, 200 );
	        f.setVisible( true );

	}

}
