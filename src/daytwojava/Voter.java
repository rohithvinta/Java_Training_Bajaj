package daytwojava;

public class Voter {
  public void validateAge(int age) {
	  try {
	  if(age >= 18) {
	  }
	  else{
		  throw new AgeInvalidException("Invalid Age Exception Get Raised");
	  }
	  }catch(AgeInvalidException e) {
		  System.out.println(e);
		  System.out.println(e.getMessage());
		  e.printStackTrace();
  }
}
  public void justFun() {
	  System.out.println("No Problem");
  }
}
