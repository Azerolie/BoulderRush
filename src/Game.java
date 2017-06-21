import java.io.*;
import java.awt.*;
import java.util.*;
import javax.imageio.*;
import javax.swing.*;
import com.sun.javafx.geom.*;

@SuppressWarnings({ "serial", "unused" })

public class Game
{
    public static void main(String[] args)
    {
    	//--- Initialize frame
    	JFrame _frame = initializeFrame();
    	
    	//Container _container = _frame.getContentPane();
    	
    	JLayeredPane _container = new JLayeredPane();
    	_container.setLayout(null);
    	_frame.setContentPane(_container);

    	
    	JComponent _brush1 = new Entity.Brush(0,0,64,64,Color.red);
    	JComponent _brush2 = new Entity.Brush(32,0,64,64,Color.blue);
    	JComponent _brush3 = new Entity.Brush(0,64,64,64,Color.black);

    	_container.add(_brush2);
    	_container.add(_brush3);
    	_container.add(_brush1);
    }
    
    public static JFrame initializeFrame()
    {
    	JFrame _frame = new JFrame();
    	_frame.setTitle("Default");
    	_frame.setSize(512, 512);
    	_frame.setLocationRelativeTo(null);
    	_frame.setResizable(false);
    	_frame.setVisible(true);
    	_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	return _frame;
    }
    
}
