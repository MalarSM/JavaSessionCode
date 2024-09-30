package InterfaceConcept;

public class TestHosptial extends FortisHospital {

	public static void main(String[] args) {
		
		FortisHospital fh = new FortisHospital();
		fh.cancerServices();
		fh.cardioServices();
		fh.dentalServices();
		fh.entServices();
		fh.obServices();
		fh.orthoServices();
		fh.physioServices();
		fh.surgeryServices();
		fh.gastroServices();
		//System.out.println(USMedical.MIN_FEE);
		fh.medicalInsurance();
		fh.urgentCareService();
		fh.emergencyServices();
		FortisHospital.billing();
		fh.medicalNews();
		fh.medicalRD();
		
		USMedical.billing();
		
		System.out.println("----");
		
      //Top casting
	   USMedical us = new FortisHospital();
	   us.medicalInsurance();
	   us.physioServices();
	   us.orthoServices();
	   us.entServices();

	}

}
