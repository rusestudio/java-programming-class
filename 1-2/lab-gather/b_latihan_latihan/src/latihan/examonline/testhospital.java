package latihan.examonline;

public class testhospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create a Hospital object
        Hospital hospital = new Hospital();

        // Create a few Patient objects
        Patient patient1 = new Patient();
        patient1.setName("Alice");
        patient1.setAge(10);
        patient1.setDisease("Flu");
        patient1.setAdimDate(new Date(1, 2022, 10));
        patient1.setDischarge(new Date(1, 2022, 15));

        Patient patient2 = new Patient();
        patient2.setName("Bob");
        patient2.setAge(25);
        patient2.setDisease("Appendicitis");
        patient2.setAdimDate(new Date(2, 2022, 20));
        patient2.setDischarge(new Date(3, 2022, 5));

        Patient patient3 = new Patient();
        patient3.setName("Charlie");
        patient3.setAge(5);
        patient3.setDisease("Chickenpox");
        patient3.setAdimDate(new Date(4, 2022, 1));
        patient3.setDischarge(new Date(4, 2022, 10));

        // Add patients to the hospital
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
        hospital.addPatient(patient3);

        // Display all patients
        hospital.displayAllpatient();

        // Display patients less than 12 years old
        hospital.displayKid();
    }
}
	