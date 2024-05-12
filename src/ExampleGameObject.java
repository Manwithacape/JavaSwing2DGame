import java.awt.Color;

public class ExampleGameObject extends GameObject{
    
    public ExampleGameObject(int x, int y, int width, int height, Color color) {
        super(x, y, width, height, color);
    }

    public void update() {
        // Move the object to the right
        setX(getX() + 1);
    }

}
