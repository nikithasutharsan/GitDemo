package selJava;

public class runningClaim {

		    public static void main(String[] args) {
		        Claim healthClaim = new HealthClaim();
		        healthClaim.createClaim("John Doe", "Health");

		        Claim autoClaim = new AutoClaim();
		        autoClaim.createClaim("Jane Smith", "Auto");
		    }
		

	}


