import java.util.*;
import javax.swing.*;
public class helloWorld {
    public static void main(String[] args)
    {
        String title = "Hello World";
        
        System.out.println("hello world");
        String userMessage = JOptionPane.showInputDialog(null, "Say hello to the world", title, JOptionPane.DEFAULT_OPTION);
        JOptionPane.showMessageDialog(null, userMessage, title, JOptionPane.DEFAULT_OPTION);
        
        System.exit(0);
        
    }
    
}
