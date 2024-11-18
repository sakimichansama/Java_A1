import java.security.InvalidParameterException;

public class Nurse extends HealthProfessional {
    private String department;        // 全科医生部门
    private String specialization;    // 专业领域
    private String professionalDetail; // 专业详情

    // Default Constructor
    public Nurse() {
        super();
        this.department = "";
        this.specialization = "";
        this.professionalDetail = "";
    }

    // The second constructor, which initializes all instance variables
    public Nurse(int ID, String name, String basicInfo, String department, String specialization, String professionalDetail) {
        super(ID, name, basicInfo);
        this.department = department;
        this.specialization = specialization;
        this.professionalDetail = professionalDetail;
    }

    // Getter method
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if (department == null || department.isEmpty()) {
            throw new InvalidParameterException("Department cannot be empty.");
        }
        this.department = department;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        if (specialization == null || specialization.isEmpty()) {
            throw new InvalidParameterException("Specialization cannot be empty.");
        }
        this.specialization = specialization;
    }

    public String getProfessionalDetail() {
        return professionalDetail;
    }

    public void setProfessionalDetail(String professionalDetail) {
        if (professionalDetail == null || professionalDetail.isEmpty()) {
            throw new InvalidParameterException("Professional details cannot be empty.");
        }
        this.professionalDetail = professionalDetail;
    }

    // print method
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Department: " + getDepartment());
        System.out.println("Specialization: " + getSpecialization());
        System.out.println("Professional Detail: " + getProfessionalDetail());
        System.out.println("Health Professional Type: Nurse");
    }
}
