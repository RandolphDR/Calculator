package App;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class FrameDragListener extends MouseAdapter {

    private final JPanel DragPanel;
    private Point mouseDownCompCoords = null;

    public FrameDragListener(JPanel DragPanel) {
        this.DragPanel = DragPanel;
    }

    public void mouseReleased(MouseEvent e) {
        mouseDownCompCoords = null;
    }

    public void mousePressed(MouseEvent e) {
        mouseDownCompCoords = e.getPoint();
    }

    public void mouseDragged(MouseEvent e) {
        Point currCoords = e.getLocationOnScreen();
        GUI.Calculator.setLocation(currCoords.x - mouseDownCompCoords.x, currCoords.y - mouseDownCompCoords.y); 
        GUI.Calculator.repaint();
    }

}
