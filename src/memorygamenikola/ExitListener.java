
package memorygamenikola;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class ExitListener extends MouseAdapter {
    
    @Override
    public void mouseClicked(MouseEvent e){
    super.mouseClicked(e);
    System.exit(0);
    }
    
}
