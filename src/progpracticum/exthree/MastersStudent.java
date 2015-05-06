package progpracticum.exthree;

import java.util.Date;

/**
 * Represents a Masters student.
 * @author Tarik Merzouk
 * @version 4/8/2015
 * @custom.inv none
 */
public class MastersStudent extends AbstractStudent implements Cloneable {
    
    /**
     * represents deadline to graduate.
     */
    private static final int TIME_LIMIT = 4;
    
    /**
     * status of a masters student, either applicant or candidate.
     */
    private MastersStatus myGradStatus;

    /**
     * the date the student started in the program.
     */
    private  Date myStartDate;
    
    /** 
     * number of years in the program.
     */
    private int myYears;
    

    /**
     * Parameterized constructor - constructors a MastersStudent object.
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
     * @param theDate is date the student started in the program
     * @custom.post MastersStudent object constructed; if invalid parameters passed, 
     *          student is in an invalid state.
     */
    public MastersStudent(final String theFirstName, final String theLastName, 
              final String theID, final int theCreditHours, final double theGPA, 
              final MastersStatus theStatus, final Gender theGender, final Date theBirth, 
              final Date theDate) {
        super(theFirstName, theLastName, theID, theCreditHours, theGPA, 
              theGender, theBirth);
        myGradStatus = theStatus;
        myYears = 0;
        myStartDate = new Date(theDate.getTime());
    }
    
    /**
     * this is the copy constructor for MasterStudent objects.
     * @param theOther the MasterStudent to be copied.
     * @custom.post an identical masterstudent is created.
     */
    public MastersStudent(final MastersStudent theOther) {
        super(theOther);
        myGradStatus = theOther.myGradStatus;
        myYears = theOther.myYears;
        theOther.myStartDate = (Date) theOther.myStartDate.clone();
    }
    /**
     * Returns time limit to finish the degree.
     * @return timeLimit
     */
    public static int getTimeLimit() {
        return TIME_LIMIT;
    }

    /**
     * Returns graduate student status.
     * @return graduate student status
     */
    public MastersStatus getGradStatus() {
        return myGradStatus;
    }

    /**
     * Returns the starting date for a student.
     * @return copy ofthe starting date for a student
     */
    public Date getMyStartDate() {
        return new Date(myStartDate.getTime());
    }

    /**
     * Returns number of years in the program.
     * @return the myYears
     */
    public int getMyYears() {
        return myYears;
    }

    /**
     * Assigns graduate student status.
     * @param theGradStatus is a student status to be assigned
     * @custom.post graduate student status assigned
     */
    public void setGradStatus(final MastersStatus theGradStatus) {
        this.myGradStatus = theGradStatus;
    }
    
    /**
     * Assigns the number of years in the program.
     * @param theYears to be assigned
     * @custom.post years assigned
     */
    public void setMyYears(final int theYears) {
        this.myYears = theYears;
    }
    
    /**
     * Represents master's student object as a string.
     * @see java.lang.Object#toString()
     * @return string representing a master student object
     */
    @Override
    public String toString() {
        return super.toString() + "MastersStudent [myGradStatus=" + myGradStatus 
               + ", myStartDate=" + myStartDate + ", myYears=" + myYears + "]";
    }

    /**
     * the hashcode for this Class.
     * @return result
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((myGradStatus == null) ? 0 : myGradStatus.hashCode());
        result = prime * result + ((myStartDate == null) ? 0 : myStartDate.hashCode());
        result = prime * result + myYears;
        return result;
    }

    /**
     * this equals method tests a mastersStudent against another 
     * masterstudent based on all their fields.
     * @param theOther the student to be compared against.
     * @return result (true if students equal, false if not)
     */
    @Override
    public boolean equals(final Object theOther) {
        boolean result = false;
        if (theOther instanceof MastersStudent) {
            final MastersStudent that = (MastersStudent) theOther;
            result = this.getFirstName().equals(that.getFirstName())
                            && this.getLastName().equals(that.getLastName()) 
                            && this.getID().equals(that.getID())
                            && this.getBirth().equals(that.getBirth())
                            && this.getGradStatus().equals(that.getGradStatus())
                            && this.getMyYears() == that.getMyYears();
        }
        
        return result;
    }
    
    /**
     * this is the cloning method for Masterstudent objects.
     * @return cloned the clone of MasterStudent.
     * @custom.post a clone of MasterStudent is created.
     * @throws CloneNotSupportedException
     */
    @Override
    public MastersStudent clone()
        throws CloneNotSupportedException {
        final MastersStudent cloned = (MastersStudent) super.clone();
        cloned.myStartDate = (Date) myStartDate.clone(); 
        
        return cloned;
    }
        
    

}
