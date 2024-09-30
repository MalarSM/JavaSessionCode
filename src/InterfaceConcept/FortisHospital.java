package InterfaceConcept;

public class FortisHospital extends Medical implements USMedical, UKMedical, IndianMedical {
	
	@Override
	public void physioServices() {
		System.out.println("FH -- physioServices ");
		
	}

	@Override
	public void cancerServices() {
		System.out.println("FH -- cancerServices ");
		
	}

	@Override
	public void surgeryServices() {
		System.out.println("FH -- surgeryServices");
		
	}

	@Override
	public void dentalServices() {
		System.out.println("FH -- dentalServices");
		
	}

	@Override
	public void cardioServices() {
		System.out.println("FH -- cardioServices");
		
	}

	@Override
	public void gastroServices() {
		System.out.println("FH -- gastroServices");
		
	}

	@Override
	public void obServices() {
		System.out.println("FH -- obServices");
		
	}

	@Override
	public void orthoServices() {
		System.out.println("FH -- orthoServices");
		
	}

	@Override
	public void entServices() {
		System.out.println("FH -- entServices");
		
	}

	public void urgentCareService() {
		System.out.println("fh --- urgentCareService");
		
	}

	@Override
	public void emergencyServices() {
		System.out.println("fh --- emergencyService");
		
	}
	
	public static void billing() {
		System.out.println("fh Medical -- billing");
	}
	
	//trying to override default method of interface.
//		@Override
//		public void medicalInsurance() {
//			System.out.println("FH -- medical Insurance");
//		}
    @Override
	public void medicalRD() {
		System.out.println("fh -- medicalR&D");
	}

	
}
