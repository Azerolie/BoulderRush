package org.boulderrush;

import java.io.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.*;
import javax.imageio.*;
import javax.swing.*;

@SuppressWarnings("serial")

public class Entity
{
		private static class Default extends JComponent
		{
			
			protected Rectangle position;
			
			/////////////////////////////////////////////////////////////
			
			public void setPosition(Rectangle _rectangle)
			{
				this.position = _rectangle;
				this.updateBounds();
			}

			public Rectangle getPosition()
			{
				return this.position;
			}
			
			public void updateBounds()
			{
				this.setBounds
				(
					this.position.x,
					this.position.y,
					this.position.width + this.position.x,
					this.position.height + this.position.y
				);
			}
			
			/////////////////////////////////////////////////////////////
			
			public Default()
			{
				this.setPosition(new Rectangle(0,0,16,16));
			}
		}

	///////////////////////////////////////////////////////////////////////////////////

		public static class Brush extends Default
		{
			private Color color;
			
			protected void paintComponent(Graphics _graphics) 
			{
				super.paintComponent(_graphics);
				_graphics.setColor(color);
				_graphics.fillRect
				(
					super.position.x,
					super.position.y,
					super.position.width,
					super.position.height
				);
			}
			
			/////////////////////////////////////////////////////////////
			

			
			/////////////////////////////////////////////////////////////
			
			public Brush(Rectangle _rectangle,Color _color)
			{
				this.setPosition(_rectangle);
				this.color = _color;
			}
		}

	///////////////////////////////////////////////////////////////////////////////////
	
		public static class Sprite extends Default
		{
			protected Image image;
			protected Dimension tilling ; //= new Dimension();
			
			protected void paintComponent(Graphics _graphics) 
			{
				super.paintComponent(_graphics);
				for(int _i = 0; _i < tilling.height; _i++)
				{
					for(int _y = 0; _y < tilling.width; _y++)
					{
						_graphics.drawImage
						(
							this.image,
							this.position.x + this.position.width * _y,
							this.position.y + this.position.height * _i,
							this.position.width,
							this.position.height,
							this
						);
					}
		         }
			}
			
			/////////////////////////////////////////////////////////////
			
			public void setTilling(Dimension _dimension)
			{
				this.tilling = _dimension;
				this.updateBounds();
			}
			public Dimension getTilling()
			{
				return this.tilling;
			}
			public void updateBounds()
			{
				this.setBounds
				(
					this.position.x,
					this.position.y,
					this.position.width * this.tilling.width + this.position.x,
					this.position.height * this.tilling.height + this.position.y
				);
			}
			public Image getImage() 
			{
				return image;
			}
			public void setImage(Image _image) 
			{
				this.image = _image;
			}
			
			/////////////////////////////////////////////////////////////
		
			/*public Sprite(Rectangle _rectangle, Image _image) 
			{
				this.setTilling(new Dimension(1,1));
				this.setPosition(_rectangle);
				this.setImage(_image);
			}*/
			public Sprite(Rectangle _rectangle, Dimension _dimension, Image _image) 
			{
				//this.setTilling(_dimension);
				//this.setPosition(_rectangle);
				this.setImage(_image);
			}
		}
}
