import java.io.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.*;
import javax.imageio.*;
import javax.swing.*;
import com.sun.javafx.geom.*;

@SuppressWarnings("serial")

public class Entity
{
	private static class Default extends JComponent
	{

		/////////////////////////////////////////////////////////////
		
		/////////////////////////////////////////////////////////////
		
		public Default(){}
	}
	
	public static class Brush extends Default
	{
		private Color color;
		
		protected void paintComponent(Graphics _graphics) 
		{
			super.paintComponent(_graphics);
			_graphics.setColor(color);
			_graphics.fillRect(0,0,512,512);
		}
		
		/////////////////////////////////////////////////////////////
		
		
		
		/////////////////////////////////////////////////////////////
		
		public Brush(int _x, int _y, int _w, int _h, Color _color)
		{
			this.setBounds(_x,_y,_w,_h);
			this.color = _color;
		}
	}
	
	public static class Sprite extends Default
	{
		private Image image;
		
		protected void paintComponent(Graphics _graphics) 
		{
			super.paintComponent(_graphics);
			_graphics.drawImage(image,0,0,0,0,this);
		}
		
		public Sprite(int _x, int _y, int _w, int _h, Image _image) 
		{
			this.image = _image;
			this.setBounds(_x,_y,_w,_h);
		}
	}
}
