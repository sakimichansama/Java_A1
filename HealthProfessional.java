import java.security.InvalidParameterException;

public class HealthProfessional {
    private int ID;
    private String name;
    private String basicInfo;

    // 默认构造函数Default Constructor
    public HealthProfessional() {
    }

    // 第二个构造函数初始化所有实例变量The second constructor initializes all instance variables
    public HealthProfessional(int ID, String name, String basicInfo) {
        this.ID = ID;
        this.name = name;
        this.basicInfo = basicInfo;
    }

    // Getter Setter
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        if (ID <= 0) {
            throw new InvalidParameterException("ID must be a positive number.");
        }
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new InvalidParameterException("Names cannot be empty.");
        }
        this.name = name;
    }

    public String getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(String basicInfo) {
        if (basicInfo == null || basicInfo.isEmpty()) {
            throw new InvalidParameterException("basicInfo cannot be empty.");
        }
        this.basicInfo = basicInfo;
    }

    // 打印方法Print Methods
    public void printDetails() {
        System.out.println("ID: " + getID());
        System.out.println("Name: " + getName());
        System.out.println("Basic Info: " + getBasicInfo());
    }
}


