import java.security.InvalidParameterException;
import java.util.ArrayList;
public class AssignmentOne {
    private static final ArrayList<Appointment> appointments = new ArrayList<>();
    public static void main(String[] args) {
        // Part 3 – Using classes and objects
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

        // Part 5 - Collection of Appointment
        // Create an appointment with a general practitioner.
        createAppointment("Na", "11122233344", "2024-11-20 10:00", "GeneralPractitioner", 1, "Dr. Mako");
        createAppointment("Hi", "22233344455", "2024-11-20 11:00", "GeneralPractitioner", 2, "Dr. Noah");

        // Creating Appointments with Nurses
        createAppointment("Sa", "33344455566", "2024-11-20 14:00", "Nurse", 4, "Nurse Zhang");
        createAppointment("Mi", "44455566677", "2024-11-20 09:30", "Nurse", 5, "Nurse Lee");

        // Print existing appointments
        System.out.println("Existing Appointments:");
        printExistingAppointments();

        // Cancel
        String mobilePhoneToCancel = "11122233344";
        cancelBooking(mobilePhoneToCancel);

        // Print the existing appointments again to show the updated set of appointments
        System.out.println("Updated Appointments:");
        printExistingAppointments();
    }

    // Create a method called createAppointment
    private static void createAppointment(String patientName, String mobilePhone,
                                          String preferredTimeStr, String HealthProfessionalType,
                                          int doctorId, String doctorName) {
        try {
            Appointment appointment = new Appointment(patientName, mobilePhone,
                    preferredTimeStr, HealthProfessionalType,
                    doctorId, doctorName);
            appointments.add(appointment);
            System.out.println("Successfully create an appointment： " + appointment);
        } catch (InvalidParameterException e) {
            System.out.println("Unable to create an appointment: " + e.getMessage());
        }
    }

    // Create a method called printExistingAppointments
    private static void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("There are no existing appointments.");
        } else {
            for (Appointment appointment : appointments) {
                appointment.printAppointmentDetails();
                System.out.println("------------------------------");
            }
        }
    }

    // Create a method called cancelBooking
    private static void cancelBooking(String mobilePhone) {
        boolean found = false;
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getMobilePhone().equals(mobilePhone)) {
                System.out.println("Cancel appointment: " + appointments.get(i));
                appointments.remove(i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No appointments were found for this cell phone number.");
        }
    }

}