import org.junit.Test;

import static org.junit.Assert.*;

public class C2Test {

    @Test
    public void R1TestCase() {
        Student student = new Student(102, 3.0);
        assertEquals(output.InvalidInput, student.checkDistinction());
    }

    @Test
    public void R2TestCase() {
        Student student = new Student(85, 3.5);
        assertEquals(output.Distinction, student.checkDistinction());
    }

    @Test
    public void R3TestCase() {
        Student student = new Student(85, 2);
        assertEquals(output.NotDistinction, student.checkDistinction());
    }

}