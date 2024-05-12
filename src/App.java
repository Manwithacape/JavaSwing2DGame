import java.awt.Color;

public class App {
    public static void main(String[] args) {
        // Create a new room
        Room room = new Room(800, 600, Color.WHITE);
        // Create a new window with the room
        Window window = new Window(room, "Game");
        // Create a new game object
        GameObject gameObject = new ExampleGameObject(100, 100, 50, 50, Color.RED);
        // Add the game object to the room
        room.addGameObject(gameObject);
        // Redraw the room
        room.repaint();
    }
}