package org.boulderrush;

import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.geom.Dimension2D;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.*;
import javax.imageio.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;

import org.boulderrush.Entity.*;

@SuppressWarnings({ "serial", "unused" })

public class Game
{
    public static void main(String[] args) throws InterruptedException
    {
    	//--- Initialize frame
    	JFrame _frame = initializeFrame();
    	Container _container = _frame.getContentPane();

    	
    	Image _image = loadImage("img\\cap.png");
    	
    	Sprite _cap = new Sprite(new Rectangle(0, 0, 48, 48), new Dimension(12,12),_image);
    	_container.add(_cap, 0, 0);

    	/*Brush _brush = new Entity.Brush(new Rectangle(0, 0, 256, 256), Color.black);
    	_container.add(_brush, 0, 1);
    	for(int _i = 0; _i < 512; _i++)
    	{
    		_brush.setPosition(new Rectangle(_i,_i,64,64));
        	Thread.sleep(20);
    	}*/
    }
    
    public static JFrame initializeFrame()
    {
    	JFrame _frame = new JFrame();
    	_frame.setTitle("Boulder Rush - 0.1.1");
    	_frame.setSize(512, 512);
    	_frame.setLocationRelativeTo(null);
    	_frame.setResizable(false);
    	_frame.setVisible(true);
    	_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	JLayeredPane _container = new JLayeredPane();
    	_container.setLayout(null);
    	_frame.setContentPane(_container);
    	
    	return _frame;
    }

    public static Image loadImage(String _path)
    {
    	try 
    	{
    	    return (BufferedImage)ImageIO.read(new FileInputStream(_path));
    	} 
    	catch (IOException e) 
    	{
    		return null;
    	}
    }
    public static void deleteImage(Image _image)
    {
    	_image = null;
    }
    public static Image cropImage(Image _image, Rectangle _rectangle) 
    {
    	return ((BufferedImage) _image).getSubimage(_rectangle.x, _rectangle.y, _rectangle.width, _rectangle.height);
     }
}