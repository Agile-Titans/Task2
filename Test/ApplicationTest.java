import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void createJFrame() {
        Application app = new Application();
        JFrame frame = app.frame;

        assertEquals("BorderLayout Demo", frame.getTitle());
        assertEquals(600, frame.getWidth());
        assertEquals(400, frame.getHeight());
    }

    @Test
    void createJLabel() {
        Application app = new Application();
        JLabel label = app.CreateJLabel();

        assertEquals("Application Title", label.getText());
    }

    @Test
    void createJButton() {
        Application app = new Application();
        JButton button = app.CreateJButton();

        assertEquals("Submit", button.getText());
    }

    @Test
    void createbutton1() {
        Application app = new Application();
        JButton bt1 = app.Createbutton1();

        assertEquals("Option1", bt1.getText());
    }

    @Test
    void createbutton2() {
        Application app = new Application();
        JButton btn2 = app.Createbutton2();

        assertEquals("Option2", btn2.getText());
    }

    @Test
    void createbutton3() {
        Application app = new Application();
        JButton bt3 = app.Createbutton3();

        assertEquals("Option3", bt3.getText());
    }

    @Test
    void createJPanel() {
        Application app = new Application();
        JPanel panel = app.CreateJPanel();

        assertTrue(panel.getLayout() instanceof java.awt.GridLayout);
        assertEquals(3, panel.getComponentCount());
    }

    @Test
    void createJScrollPane() {
        Application app = new Application();
        app.CreateJTextArea();
        JScrollPane scroll = app.CreateJScrollPane();

        assertNotNull(scroll.getViewport().getView());
    }

    @Test
    void createJTextArea() {
        Application app = new Application();
        JTextArea area = app.CreateJTextArea();

        assertNotNull(area);
    }

    @Test
    void testBorderLayoutPositions() {
        Application app = new Application();
        BorderLayout layout = (BorderLayout) app.frame.getContentPane().getLayout();
        assertEquals(app.label,      layout.getLayoutComponent(BorderLayout.NORTH));
        assertEquals(app.button,     layout.getLayoutComponent(BorderLayout.SOUTH));
        assertEquals(app.panel,      layout.getLayoutComponent(BorderLayout.WEST));
        assertEquals(app.scrollPane, layout.getLayoutComponent(BorderLayout.CENTER));
    }

}