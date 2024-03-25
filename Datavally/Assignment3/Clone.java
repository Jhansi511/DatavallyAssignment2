class Organization implements Cloneable {
    private int organizationCode;
    private String organizationName;
    private String organizationAddress;

    // Constructor
    public Organization(int organizationCode, String organizationName, String organizationAddress) {
        this.organizationCode = organizationCode;
        this.organizationName = organizationName;
        this.organizationAddress = organizationAddress;
    }

    // Getter methods
    public int getOrganizationCode() {
        return organizationCode;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public String getOrganizationAddress() {
        return organizationAddress;
    }

    // Method to print object details
    public void printDetails() {
        System.out.println("Organization Code: " + organizationCode);
        System.out.println("Organization Name: " + organizationName);
        System.out.println("Organization Address: " + organizationAddress);
    }

    // Override clone method
    @Override
    public Organization clone() {
        try {
            return (Organization) super.clone();
        } catch (CloneNotSupportedException e) {
            // This should never happen since we implement Cloneable
            throw new InternalError(e);
        }
    }
}

public class  Clone {
    public static void main(String[] args) {
        // Creating an instance of Organization
        Organization org1 = new Organization(1413, "VVIT", "4TH Main Street");

        // Cloning the organization object
        Organization org2 = org1.clone();

        // Printing details of original and cloned objects
        System.out.println("Original Organization:");
        org1.printDetails();

        System.out.println("\nCloned Organization:");
        org2.printDetails();
    }
}