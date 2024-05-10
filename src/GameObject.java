import java.awt.Color;
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
                g.draw(x, y, width, height);
            } else {
                // Draw the rectangle
                g.fillRectangle(x, y, width, height);
            }
        }
    
    }

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
