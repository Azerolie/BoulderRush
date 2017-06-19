import java.awt.*;
import java.awt.List;
import java.util.*;
import javax.swing.*;
import com.sun.javafx.geom.*;

public class BDSystem {	
	public static class Entity
	{
		//--- Unique identifier for the entity.
		private String UID;
		public String getUID()
		{
			return UID;
		}
		public void setUID(String _UID)
		{
			this.UID = _UID;
		}
		
		//--- Position of the entity relative to the screen.
		private Vec3f position;
		public Vec3f getPosition()
		{
			return position;
		}
		public void setPosition(Vec3f _position)
		{
			this.position = _position;
		}

		//--- Rotation of the entity.
		private Vec3f rotation;
		public Vec3f getRotation() 
		{
			return rotation;
		}
		public void setRotation(Vec3f _rotation) 
		{
			this.rotation = _rotation;
		}

		//--- Size of the entity.
		private Vec3f size;
		public Vec3f getSize() 
		{
			return size;
		}
		public void setSize(Vec3f _size) 
		{
			this.size = _size;
		}

		//--- Color shade of the entity.
		private Color color;
		public Color getColor() 
		{
			return color;
		}
		public void setColor(Color _color) 
		{
			this.color = _color;
		}

		//--- Texture of the entity.
		private String texture;
		public String getTexture() 
		{
			return texture;
		}
		public void setTexture(String _texture) 
		{
			this.texture = _texture;
		}
		
		//--- Texture tilling and position.
		private Vec4f mapping;
		public Vec4f getMapping() 
		{
			return mapping;
		}
		public void setMapping(Vec4f _mapping) 
		{
			this.mapping = _mapping;
		}
		
		private boolean solid;
		public boolean isSolid()
		{
			return solid;
		}
		public void setSolid(boolean _solid)
		{
			this.solid = _solid;
		}
		
		public Entity()
		{
			Entity _this = new Entity();
			_this.setPosition(new Vec3f(0.f, 0.f, 0.f));
			_this.setRotation(new Vec3f(0.f, 0.f, 0.f));
			_this.setSize(new Vec3f(0.f, 0.f, 0.f));
			_this.setColor(Color.white);
			_this.setTexture("");
			_this.setMapping(new Vec4f(0.f, 0.f, 1.f, 1.f));
			_this.setSolid(true);
		};
	}
	
	public class Screen
	{
		
		private Vec3f position;
		public Vec3f getPosition() 
		{
			return position;
		}
		public void setPosition(Vec3f _position) 
		{
			this.position = _position;
		}
		
		
		
		
		private Set<Entity> entities;
		
		
		
		
		public Set<Entity> getEntities() 
		{
			return entities;
		}
		
		
		
		
		public void setEntities(Set<Entity> _entities) 
		{
			this.entities = _entities;
		}
		
		
		
		
		
		
		
		public Screen()
		{
			this.entities.add(new Entity());
		}

	}

	public class Game
	{
		
	}
	
	public static class Window extends JFrame
	{
		public Window()
		{
			new JFrame();
			this.setTitle("Default");
			this.setSize(512, 512);
			this.setLocationRelativeTo(null);
			this.setResizable(false);
			this.setVisible(true);
		}
	}
	
	public static void main(String[] args) 
	{
		JFrame _gameWindow = new Window();
		_gameWindow.setTitle("Boulder Rush - 0.1.0");
	}
}
