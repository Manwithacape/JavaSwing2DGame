import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.Graphics;
/**
 * GameObject is the base class for all objects in the game
 * It provides the basic functionality for all objects in the game
 * It is an abstract class, so it cannot be instantiated
 * It has abstract methods that must be implemented by the subclasses
 * It has concrete methods that can be used by the subclasses
 * 
 * @author Daniel Paxton
 * @version 1.0
 * @since 1.0
 */
public abstract class GameObject {
    private int x;      // x-coordinate of the top-left corner of the object
    private int y;      // y-coordinate of the top-left corner of the object
    private int width;  // width of the object
    private int height; // height of the object

    private boolean active; // activity of the object

    private boolean visible; // visibility of the object
    private Color color; // color of the object
    private Image image; // image of the object
    private float xScale; // x-scale of the object
    private float yScale; // y-scale of the object

    public GameObject(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public GameObject(int x, int y, int width, int height, Color color) {
        this(x, y, width, height);
        this.color = color;
    };

    public GameObject(int x, int y, Image image) {
        this(x, y,image.getWidth(null), image.getHeight(null));
        this.image = image;
    };


    /**
     * To be called every 'step' of the game loop, i.e. every frame
     * Update the object's state. object code goes here
     */
    public abstract void update();

    /**
     * To be called every 'step' of the game loop, i.e. every frame
     * Render the object. Rendering code goes here. i.e. drawing the object on the screen
     */
    public void render(Graphics g) {
        if (visible) {
            if (image != null) {
                // Draw the image
                //g.drawImage(x, y, width, height);
            } else {
                // Draw the rectangle
                Color oldColor = g.getColor();
                g.setColor(color);
                g.fillRect(x, y, width, height);
                g.setColor(oldColor);
            }
        }
    
    }

    // Methods related to the object's position -------------------------------------------------------------------------------------------------------------
    /**
     * Get the x-coordinate of the top-left corner of the object 
     * @return x-coordinate of the top-left corner of the object
     */
    public int getX() {
        return x;
    }

    /**
     * Get the y-coordinate of the top-left corner of the object 
     * @return y-coordinate of the top-left corner of the object
     */
    public int getY() {
        return y;
    }

    /**
     * Get the position of the object 
     * @return position of the object
     */
    public Point getPosition() {
        return new Point(x, y);
    }

    /**
     * Set the position of the object 
     * @param x x-coordinate of the top-left corner of the object
     * @param y y-coordinate of the top-left corner of the object
     */
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Set the position of the object 
     * @param position position of the object
     */
    public void setPosition(Point position) {
        this.x = position.x;
        this.y = position.y;
    }

    /**
     * Get the color of the object
     * @param x x-coordinate of the top-left corner of the object
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Get the y-coordinate of the top-left corner of the object 
     * @param y y-coordinate of the top-left corner of the object
     */
    public void setY(int y) {
        this.y = y;
    }

    // Methods related to the object's size -------------------------------------------------------------------------------------------------------------
    /**
     * Get the width of the object 
     * @return width of the object
     */
    public int getWidth() {
        return width;
    }

    /**
     * Get the height of the object 
     * @return height of the object
     */
    public int getHeight() {
        return height;
    }

    /**
     * Get the size of the object 
     * @return size of the object
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Get the size of the object 
     * @return size of the object
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Get the size of the object
     * @return size of the object
     */
    public Dimension getSize() {
        return new Dimension(width, height);
    }

    /**
     * Set the x-scale of the object
     * @param xScale 
     */
    public void setXScale(float xScale) {
        this.xScale = xScale;
    }

    /**
     * Set the y-scale of the object
     * @param yScale
     */
    public void setYScale(float yScale) {
        this.yScale = yScale;
    }


    /**
     * Set the scale of the object
     * @param xScale x-scale of the object
     * @param yScale y-scale of the object
     */
    public void setScale(float xScale, float yScale) {
        this.setXScale(xScale);
        this.setYScale(yScale);
    }

    /**
     * Get the activity of the object 
     * @return activity of the object
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Set the activity of the object 
     * @param active activity of the object
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    /**
     * Get the visibility of the object 
     * @return visibility of the object
     */
    public boolean isVisible() {
        return visible;
    }

}
