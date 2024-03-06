import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppText {
    @Test
    public void testGetX() {
        Circulo c = new Circulo();
        assertEquals(0, c.getX());
    }
    @Test
    public void testSetX() {
        Circulo c = new Circulo();
        c.setX(5);
        assertEquals(5, c.getX());
    }
    @Test
    public void testGetY() {
        Circulo c = new Circulo();
        assertEquals(0, c.getY());
    }
    @Test
    public void testSetY() {
        Circulo c = new Circulo();
        c.setY(5);
        assertEquals(5, c.getY());
    }
    //resto dos testes
    
    
}
