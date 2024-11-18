public class AssignmentOne {
    public static void main(String[] args) {
        //// Part 3 – Using classes and objects
        // Creation of three GP objects
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Mako", "24 year old internist with excellent academic experience", "Outpatient department", "Family Physician", "1 years of experience");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Noah", "Pediatrician with extensive knowledge", "Pediatrics", "Child Specialist", "8 years of experience");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Zhang", "Expert in internal medicine", "Internal Medicine", "Internal Medicine Specialist", "15 years of experience");

        // Create two nurse objects
        Nurse nurse1 = new Nurse(4, "Nurse Zhang", "Male, Proficient in first aid related", "Emergency", "Trauma Care", "5 years of experience in emergency care");
        Nurse nurse2 = new Nurse(5, "Nurse Lee", "Female, Experienced surgical nurse", "Operating Room", "Surgical Assistance", "7 years of experience in surgeries");

        // print GeneralPractitioner
        gp1.printDetails();
        System.out.println("------------------------------");
        gp2.printDetails();
        System.out.println("------------------------------");
        gp3.printDetails();
        System.out.println("------------------------------");

        // print nurse
        nurse1.printDetails();
        System.out.println("------------------------------");
        nurse2.printDetails();
        System.out.println("------------------------------");
    }
}