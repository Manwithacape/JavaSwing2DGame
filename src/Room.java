import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.util.ArrayList;

public class Room extends JPanel {
    private int width;
    private int height;
    private Color backgroundColor;

    ArrayList<GameObject> gameInstances = new ArrayList<GameObject>();


    /**
     * Create a room with the given width, height, and background color
     * @param width the width of the room
     * @param height the height of the room
     * @param backgroundColor the background color of the room
     */
    public Room(int width, int height, Color backgroundColor) {
        this.width = width;
        this.height = height;
        this.backgroundColor = backgroundColor;
    }

    /**
     * Get the width of the room
     * @return the width of the room
     */
    public int getWidth() {
        return width;
    }

    /**
     * Get the height of the room
     * @return the height of the room
     */
    public int getHeight() {
        return height;
    }

    /**
     * Set the width of the room
     * @param width
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Set the height of the room
     * @param height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Get the background color of the room
     * @return the background color of the room
     */
    public void addGameObject(GameObject gameObject) {
        gameInstances.add(gameObject);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the background of the room
        g.setColor(backgroundColor);
        g.fillRect(0, 0, width, height);


    }


    /**
     * Draw the game instances in the room
     * @param g
     * @param gameInstances
     */
    public void drawGameInstances(Graphics g, ArrayList<GameObject> gameInstances) {
        for (GameObject gameInstance : gameInstances) {
            gameInstance.render(g);
        }
    }
}
