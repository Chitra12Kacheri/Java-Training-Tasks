package training12;


	class Patient {

	    // Private data members
	    private int patientId;
	    private String patientName;
	    
	    private int age;
	    private String disease;

	    // Setter methods
	    public void setPatientId(int patientId) {
	        this.patientId = patientId;
	    }

	    public void setPatientName(String patientName) {
	        this.patientName = patientName;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public void setDisease(String disease) {
	        this.disease = disease;
	    }

	    // Getter methods
	    public int getPatientId() {
	        return patientId;
	    }

	    public String getPatientName() {
	        return patientName;
	    }

	    public int getAge() {
	        return age;
	    }

	    public String getDisease() {
	        return disease;
	    }

	    // Method to display patient details
	    public void displayDetails() {
	        System.out.println("Patient ID: " + getPatientId());
	        System.out.println("Patient Name: " + getPatientName());
	        System.out.println("Age: " + getAge());
	        System.out.println("Disease: " + getDisease());
	    }
	}
	public class HospitalManagementSystem {

	    public static void main(String[] args) {

	        Patient p = new Patient();

	        p.setPatientId(101);
	        p.setPatientName("Rahul");
	        p.setAge(25);
	        p.setDisease("Fever");

	        System.out.println("Hospital Management System");
	        System.out.println("--------------------------");

	        p.displayDetails();
	    }
	}

