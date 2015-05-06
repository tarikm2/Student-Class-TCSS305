/**
 * MS
 * TCCS 305 A Spring 2015
 * Student Assignment
 */

package progpracticum.exthree;

import java.util.Date;

/**
 * Represents university student.
 * @author Tarik Merzouk
 * @version 4/8/2015
 * @custom.inv none
 */

public class UndergradStudent extends AbstractStudent implements Cloneable{
    
    /**
     *  Student status.
     */
    private StudentStatus myStatus;
    
    /**
     * Private constructor to prohibit default instantiation.
     
    private UndergradStudent() {
       
        
    }
    **/
    
    /**
     * Parameterized constructor - constructors a Student object.
     * @param theFirstName is a string representing the first name of a student, != null
     * @param theLastName is a string representing the last name of a student, != null
     * @param theID is a string of 9 characters representing student ID
     * @param theCreditHours is an integer number >=0 representing number of credit hours 
     *          taken by a student
     * @param theGPA is a double number representing GPA, a GPA must be >= 0 and <= 4.0
     * @param theStatus is a string representing student status, != null
     * @param theGender is a character representing student gender, != null
     * @param theBirth is a date representing student birth date; a student cannot be younger 
     *          than 10 years old 
     * @custom.post Student object constructed; if invalid parameters passed, 
     *          student is in an invalid state.
     */
    public UndergradStudent(final String theFirstName, final String theLastName, 
                            final String theID, 
                            final int theCreditHours, final double theGPA,
                            final StudentStatus theStatus, final Gender theGender, 
                            final Date theBirth) {
        
        super(theFirstName, theLastName, theID, theCreditHours, 
              theGPA, theGender, theBirth);
        myStatus = theStatus;
    }
    
    /**
     *  copy constructor for UndergradStudent.
     * @param theOther (student to be copied)
     */
    public UndergradStudent(final UndergradStudent theOther) {
        super(theOther);
    }
    
    /**
     * Returns student's status.
     * @return student's status
     */
    public StudentStatus getStatus() {
        return myStatus;
    }
    
    /**
     * Assigns status to a student.
     * @param theStatus is a String that represents student's status, != null
     * @custom.post student's status assigned 
     */
    public void setStatus(final StudentStatus theStatus) {
        myStatus = theStatus;
    }
    
   
   
    /**
     * Overrides Object toString method; returns a String containing all object's information.
     * @return a String object containing all object's information
     */
   /* @Override
    public String toString() {
        return "Student [myFirstName=" + myFirstName + ", myLastName=" + myLastName
               + ", myID=" + myID + ", myCreditHours=" + myCreditHours + ", myGPA=" + myGPA
               + ", myStatus=" + myStatus + ", myGender=" + myGender + ", myBirth=" + myBirth
               + "]";
    }*/
    @Override
    public String toString() {
        final StringBuilder rep = new StringBuilder(100);
        rep.append(super.toString());
        rep.append(", myStatus = ");
        rep.append(myStatus);
        return rep.toString();
    }
    
    @Override
    public UndergradStudent clone()
        throws CloneNotSupportedException {
        UndergradStudent cloned = (UndergradStudent) super.clone();
        
        return cloned;
    }
}