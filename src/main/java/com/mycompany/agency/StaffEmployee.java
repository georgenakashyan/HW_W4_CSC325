package com.mycompany.agency;


    // TODO 1: Make StaffEmployee a child of StaffMember

public class StaffEmployee 
{
    protected String socialSecurityNumber;
    protected double payRate;

    //-----------------------------------------------------------------
    //  TODO 2: Sets up this staff employee with the specified
    //  information.
    //-----------------------------------------------------------------
    public StaffEmployee(String eName, String eAddress, String ePhone,
            String socSecNumber, double rate)
    {
        super(eName, eAddress, ePhone);

        socialSecurityNumber = socSecNumber;
        payRate = rate;
    }

    //-----------------------------------------------------------------
    // TODO 3: complete the implementation of toString to return information 
    //          about a staff employee as a string.
    //-----------------------------------------------------------------
    public String toString()
    {
    
    }

    //-----------------------------------------------------------------
    // TODO 4:  Returns the pay rate for this staff employee.
    //-----------------------------------------------------------------
    public double pay()
    {
       
    }
}
