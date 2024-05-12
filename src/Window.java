import javax.swing.JFrame;

public class Window extends JFrame {
    private Room room;

    /**
     * Create a window with the given room
     * @param room the room to display in the window
     */
    public Window(Room room, String title) {
        this.room = room;
        this.setTitle(title);
        this.setSize(room.getWidth(), room.getHeight());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(room);
        this.setVisible(true);
    }

    /**
     * Get the room displayed in the window
     * @return the room displayed in the window
     */
    public Room getRoom() {
        return room;
    }

    /**
     * Set the room displayed in the window
     * @param room the room to display in the window
     */
    public void setRoom(Room room) {
        this.room = room;
        this.setSize(room.getWidth(), room.getHeight());
        this.add(room);
        this.revalidate();
    }
    
}
