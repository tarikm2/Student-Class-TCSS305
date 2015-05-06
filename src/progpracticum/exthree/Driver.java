
package progpracticum.exthree;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Utility class to run the program.
 * @author Tarik Merzouk
 * @version 4/8/2015
 * @custom.inv none
 */
public final class Driver {
    
    /**
     * Default constructor.
     */
    private Driver() {   
    }
    
    
    /**
     * Method to run the program.
     * @param theArgs command line arguments
     */
    public static void main(final String[] theArgs)  {
        final List<AbstractStudent> testList = new ArrayList<AbstractStudent>();
        
        final Date bDay1 = new Date(1994, 7 - 1, 2);
        final Date bDay2 = new Date();
        final Date bDay3 = new GregorianCalendar(1994, 7 - 1, 26).getTime();
        testList.add(new UndergradStudent("Monika", "Sobolewska", "P00011122", 0, 0, 
                    StudentStatus.FRESHMAN, Gender.FEMALE, bDay1));
        testList.add(new UndergradStudent("Nadeem", "Ansari", "P00011123", 120, 3.45, 
                   StudentStatus.SENIOR, Gender.MALE, bDay2));
        testList.add(new UndergradStudent("Alex", "Witoslawski", "P00011124", 0, 0, 
                   StudentStatus.FRESHMAN, Gender.MALE, bDay3));
        
        testList.add(new MastersStudent("Hanna", "Roszczenko", "P123123123", 0, 0,
                    MastersStatus.APPLICANT, Gender.FEMALE, bDay1, bDay2));
        for (final AbstractStudent s: testList) {
            System.out.println(s);
        }
        
        Date armagedon = testList.get(0).getBirth();
        armagedon.setYear(3000);
        
        System.out.println(testList.get(0));
        
    }

}
