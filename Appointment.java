import java.security.InvalidParameterException;

public class Appointment {
    private String patientName;
    private String mobilePhone;
    private String preferredTime;
    private String HealthProfessionalType;
    private int doctorId;
    private String doctorName;

    // Default Constructor
    public Appointment() {
        this.patientName = "";
        this.mobilePhone = "";
        this.preferredTime = "";
        this.HealthProfessionalType = "";
        this.doctorId = 0;
        this.doctorName = "";
    }

    // Constructor with parameters
    public Appointment(String patientName, String mobilePhone, String preferredTime,
                       String HealthProfessionalType, int doctorId, String doctorName) {
        setPatientName(patientName);
        setMobilePhone(mobilePhone);
        setPreferredTime(preferredTime);
        setHealthProfessionalType(HealthProfessionalType);
        setDoctorId(doctorId);
        setDoctorName(doctorName);
    }

    // Getter and Setter methods

    // Patient Name
    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        if (patientName == null || patientName.isEmpty()) {
            throw new InvalidParameterException("Patient name cannot be empty.");
        }
        this.patientName = patientName;
    }

    // Mobile Phone
    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        if (mobilePhone == null || mobilePhone.isEmpty()) {
            throw new InvalidParameterException("Mobile phone cannot be empty.");
        }
        this.mobilePhone = mobilePhone;
    }

    // Preferred Time
    public String getPreferredTime() {
        return preferredTime;
    }

    public void setPreferredTime(String preferredTime) {
        if (preferredTime == null || preferredTime.isEmpty()) {
            throw new InvalidParameterException("Preferred time cannot be empty.");
        }
        this.preferredTime = preferredTime;
    }

    // Doctor Role
    public String getHealthProfessionalType() {
        return HealthProfessionalType;
    }

    public void setHealthProfessionalType(String HealthProfessionalType) {
        this.HealthProfessionalType = HealthProfessionalType; // Doctor role can be empty or null
    }

    // Doctor ID
    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        if (doctorId <= 0) {
            throw new InvalidParameterException("Doctor ID must be greater than 0.");
        }
        this.doctorId = doctorId;
    }

    // Doctor Name
    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName; // Doctor name can be empty or null
    }

    // Print appointment details
    public void printAppointmentDetails() {
        System.out.println("Patient Name: " + getPatientName());
        System.out.println("Mobile Phone: " + getMobilePhone());
        System.out.println("Preferred Time: " + getPreferredTime());
        System.out.println("Selected Doctor ID: " + getDoctorId());
        System.out.println("Selected Doctor Name: " + getDoctorName());
        System.out.println("Doctor Role: " + getHealthProfessionalType());
    }
}