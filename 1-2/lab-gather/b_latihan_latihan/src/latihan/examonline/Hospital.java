package latihan.examonline;
import java.util.*;

public class Hospital {
	
	private ArrayList patients;
	
	 public Hospital ( ){
		 patients = new ArrayList ();
     } 

	public void addPatient(Patient p) {
		patients.add (p) ;
	}
	
    public void deletePatient(Patient p) {
    	patients.remove (p);
	}
    
   public void displayAllpatient() {
	   Iterator it = patients.iterator ( ) ;
	   System.out.println(" ALl Patients in the hospital:") ;
	   while (it.hasNext () )
	   { Patient pat = (Patient) it.next ( ) ;
	   pat.display( ) ;
	   } 
	}
   
   public void displayKid() {
	   Iterator it = patients.iterator ( );
	   System.out.println(" Patients less than 12 years old:");
	   while (it.hasNext () )
	   { Patient pat = (Patient) it.next ( );
	   if (pat.getAge() < 12)
	   pat.display( );
	   } 
  	}
}
