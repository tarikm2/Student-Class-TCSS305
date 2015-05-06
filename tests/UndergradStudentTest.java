import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import progpracticum.exthree.Gender;
import progpracticum.exthree.StudentStatus;
import progpracticum.exthree.UndergradStudent;

/**
 * 
 */

/**
 * @author Tarik
 *
 */
public class UndergradStudentTest {

    /**
     * @throws java.lang.Exception for exception.
     */
    @Before
    public void setUp() throws Exception {
        final Date bDay1 = new Date(1994, 7 - 1, 2);
        UndergradStudent theS = new UndergradStudent("Monika", "Sobolewska", "P00011122", 0, 0, 
                    StudentStatus.FRESHMAN, Gender.FEMALE, bDay1);
        
    }

    /**
     * Test method for {@link progpracticum.exthree.UndergradStudent#toString()}.
     */
    @Test
    public void testToString() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link progpracticum.exthree.UndergradStudent#UndergradStudent(java.lang.String, java.lang.String, java.lang.String, int, double, progpracticum.exthree.StudentStatus, progpracticum.exthree.Gender, java.util.Date)}.
     */
    @Test
    public void testUndergradStudentStringStringStringIntDoubleStudentStatusGenderDate() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link progpracticum.exthree.UndergradStudent#UndergradStudent(progpracticum.exthree.UndergradStudent)}.
     */
    @Test
    public void testUndergradStudentUndergradStudent() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link progpracticum.exthree.UndergradStudent#getStatus()}.
     */
    @Test
    public void testGetStatus() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link progpracticum.exthree.UndergradStudent#setStatus(progpracticum.exthree.StudentStatus)}.
     */
    @Test
    public void testSetStatus() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link progpracticum.exthree.UndergradStudent#clone()}.
     */
    @Test
    public void testClone() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link progpracticum.exthree.AbstractStudent#hashCode()}.
     */
    @Test
    public void testHashCode() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link progpracticum.exthree.AbstractStudent#AbstractStudent(java.lang.String, java.lang.String, java.lang.String, int, double, progpracticum.exthree.Gender, java.util.Date)}.
     */
    @Test
    public void testAbstractStudentStringStringStringIntDoubleGenderDate() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link progpracticum.exthree.AbstractStudent#AbstractStudent(progpracticum.exthree.AbstractStudent)}.
     */
    @Test
    public void testAbstractStudentAbstractStudent() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link progpracticum.exthree.AbstractStudent#getFirstName()}.
     */
    @Test
    public void testGetFirstName() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link progpracticum.exthree.AbstractStudent#getLastName()}.
     */
    @Test
    public void testGetLastName() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link progpracticum.exthree.AbstractStudent#setLastName(java.lang.String)}.
     */
    @Test
    public void testSetLastName() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link progpracticum.exthree.AbstractStudent#getID()}.
     */
    @Test
    public void testGetID() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link progpracticum.exthree.AbstractStudent#getCreditHours()}.
     */
    @Test
    public void testGetCreditHours() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link progpracticum.exthree.AbstractStudent#setCreditHours(int)}.
     */
    @Test
    public void testSetCreditHours() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link progpracticum.exthree.AbstractStudent#getGPA()}.
     */
    @Test
    public void testGetGPA() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link progpracticum.exthree.AbstractStudent#setGPA(double)}.
     */
    @Test
    public void testSetGPA() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link progpracticum.exthree.AbstractStudent#getGender()}.
     */
    @Test
    public void testGetGender() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link progpracticum.exthree.AbstractStudent#getBirth()}.
     */
    @Test
    public void testGetBirth() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link progpracticum.exthree.AbstractStudent#setBirth(java.util.Date)}.
     */
    @Test
    public void testSetBirth() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link progpracticum.exthree.AbstractStudent#equals(java.lang.Object)}.
     */
    @Test
    public void testEqualsObject() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link progpracticum.exthree.AbstractStudent#clone()}.
     */
    @Test
    public void testClone1() {
        fail("Not yet implemented");
    }

}
