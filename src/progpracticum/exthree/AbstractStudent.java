package progpracticum.exthree;

import java.util.Date;
/**
 * 
 * @author Tarik Merzouk
 * @version 4/8/2015
 */
public abstract class AbstractStudent implements Cloneable {
    
    /**
     * First name of a student.
     */
    protected String myFirstName;
    
    /**
     * Last name of a student.
     */
    protected String myLastName;
    
    /**
     * Student 9-digit ID.
     */
    protected String myID;
    
    /**
     * Number of credit hours completed by a student.
     */
    protected int myCreditHours;
    
    /**
     * Current student GPA.
     */
    protected double myGPA;
    
    /**
     * Student gender.
     */
    protected Gender myGender;
    
    /** Student date of birth.
     * 
     */
    protected Date myBirth;
    
    /**
     * this is the constructor for student type objects.
     * 
     * @param theFirstName students first name
     * @param theLastName students last name
     * @param theID the students ID
     * @param theCreditHours the students credit hours
     * @param theGPA the students gpa
     * @param theGender the students gender
     * @param theBirth the students birth date
     * @custom.post Abstract Student object instantiated.
     */
    public AbstractStudent(final String theFirstName, final String theLastName, 
                                               final String theID, 
                                               final int theCreditHours, final double theGPA,
                                               final Gender theGender, 
                                               final Date theBirth) {
                 
        myFirstName = theFirstName;
        myLastName = theLastName;
        myID = theID;
        myCreditHours = theCreditHours;
        myGPA = theGPA;
        myGender = theGender;
        myBirth = new Date(theBirth.getTime());
    }
    
    /**
     * this is a copy constructor for AbstractStudent.
     * @param theOther AbstractStudent to be copied.
     * @custom.post copy of theOther instantiated.
     */
    public AbstractStudent(final AbstractStudent theOther) {
        this(theOther.myFirstName, theOther.myLastName, theOther.myID,
                theOther.myCreditHours, theOther.myGPA, theOther.myGender,
                theOther.myBirth);
    }
    
    
    /**
     * Returns student's first name.
     * @return myFirstName (student's first name)
     */
    public String getFirstName() {
        return myFirstName;
    }
    
    /**
     * Returns student's last name.
     * @return (myLastName) student's last name.
     */
    public String getLastName() {
        return myLastName;
    }
    
    /**
     * Assigns the last name to a student.
     * @param theLastName is a string representing student's last name, != null
     * @custom.post student's last name assigned 
     */
    public void setLastName(final String theLastName) {
        myLastName = theLastName;
    }
    
    /**
     * Returns student's ID.
     * @return myID (student's ID)
     */
    public String getID() {
        return myID;
    }
    
    /**
     * Returns student's credit hours.
     * @return myCreditHours (student's credit hours)
     */
    public int getCreditHours() {
        return myCreditHours;
    }
    
    /**
     * Assigns number of credit hours to a student.
     * @param theCreditHours  (the number of credit hours, >= 0)
     * @custom.post student's credit hours assigned; if hours invalid, object in invalid state
     */
    public void setCreditHours(final int theCreditHours) {
        myCreditHours = theCreditHours;
    }
    
    /**
     * Returns student's GPA.
     * @return myGPA (student's GPA)
     */
    public double getGPA() {
        return myGPA;
    }
    
    /**
     * Assigns student's GPA.
     * @param theGPA (student's current GPA, >= 0, <= 4.0)
     * @custom.post student's GPA assigned
     */
    public void setGPA(final double theGPA) {
        myGPA = theGPA;
    }
    
    /**
     * Returns student's gender.
     * @return myGender (student's gender)
     */
    public Gender getGender() {
        return myGender;
    }
    
    /**
     * Returns student's date of birth.
     * @return Date(myBirth.getTime) (copy of student's date of birth)
     */
    public Date getBirth() {
        return new Date(myBirth.getTime());
    }
    
    /**
     * Assigns birth date to a student.
     * @param theDate (the date.)
     * @custom.post birth date assigned; if invalid date passed, object in invalid state
     */
    public void setBirth(final Date theDate) {
        myBirth = new Date(theDate.getTime());
    }
    
    /**
     * toString returns a string representation of AbstractStudent.
     * @return rep.toString
     */
    @Override
    public String toString() {
        final StringBuilder rep = new StringBuilder(100);
        final String bracket = "]";
        rep.append("Student [myFirstName=");
        rep.append(myFirstName);
        rep.append(", myLastName=");
        rep.append(myLastName);
        rep.append(", myID=");
        rep.append(myID);
        rep.append(", myCreditHours=");
        rep.append(myCreditHours);
        rep.append(", myGPA=");
        rep.append(myGPA);
        rep.append(", myStatus=");
        rep.append(", myGender=");
        rep.append(myGender);
        rep.append(", myBirth=");
        rep.append(myBirth);
        rep.append(bracket);
        return rep.toString();
    }

    /**
     * the hash code for Abstract Student.
     * @return result
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((myBirth == null) ? 0  : myBirth.hashCode());
        result = prime * result + myCreditHours;
        result = prime * result + ((myFirstName == null) ? 0 : myFirstName.hashCode());
        long temp;
        temp = Double.doubleToLongBits(myGPA);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((myGender == null) ? 0 : myGender.hashCode());
        result = prime * result + ((myID == null) ? 0 : myID.hashCode());
        result = prime * result + ((myLastName == null) ? 0 : myLastName.hashCode());
        return result;
    }

    /**
     * equals compares this instance against theOther by
     * their first name, last name, ID, and birth date.
     * @param theOther the student being compared against
     * @return result
     */
    @Override 
    public boolean equals(final Object theOther) {
        boolean result = false;
        if (theOther instanceof AbstractStudent) {
            final AbstractStudent that = (AbstractStudent) theOther;
            
            result = myFirstName.equals(that.myFirstName) //fix these with Object.equals
                      && this.getLastName().equals(that.getLastName()) 
                      && this.getID().equals(that.getID()) 
                      && this.getBirth().equals(that.getBirth());
        
        }
        
        return result;
    }
    /**
     * constructor for deep copy.
     * @return cloned (a cloned AbstractStudent)
     * @throws CloneNotSupportedException (
     * 
     */
        public AbstractStudent clone() 
        throws CloneNotSupportedException  {
        AbstractStudent cloned = (AbstractStudent) super.clone();
        cloned.myBirth = (Date) myBirth.clone();
        
        return cloned;
        
    }
    

}
