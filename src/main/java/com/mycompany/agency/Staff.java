package com.mycompany.agency;

public class Staff {

    private StaffMember[] staffList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of staff members.
    //-----------------------------------------------------------------
    public Staff() {
        staffList = new StaffMember[6];

        // TODO 1: Add 6 emploees to the staffList
        staffList[0] = new Executive("William", "789 Off Rocker", "516-555-0000", "631-20-3040", 1669.23);
        staffList[1] = new Executive("Sam", " 25 New Tree Line", "516-101-3131", "000-000-1234", 21900.5);
        staffList[2] = new TempEmploee("John", "456 Off Line", "516-555-0101", "516-65-4321", 1546.15);
        staffList[3] = new TempEmploee("Julli", "123 wrong Ave", "516-555-0101", "516-65-4321", 2000.15);
        staffList[4] = new Intern("Alex", "987 Wood Blvd.", "516-555-8374");
        staffList[5] = new Intern("Ahmad", "321 Elm Lane", " 516-555-7282");

        ((Executive) staffList[0]).awardBonus(500.00);

        ((TempEmploee) staffList[3]).addHours(40);
    }

    //-----------------------------------------------------------------
    //  Pays all staff members.
    //-----------------------------------------------------------------
    public void payday() {
        double amount;

        for (int count = 0; count < staffList.length; count++) {
            System.out.println(staffList[count]);

            amount = staffList[count].pay();  // polymorphic

            if (amount == 0.0) {
                System.out.println("Thanks!");
            } else {
                System.out.println("Paid: " + amount);
            }

            System.out.println("-----------------------------------");
        }
    }
}
