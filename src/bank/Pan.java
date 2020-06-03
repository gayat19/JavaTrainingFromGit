package bank;

public class Pan {

  private String panNumber;
  protected String fatherName;
	
	
	
	public String getPanNumber() {
	return panNumber;
}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public void printPanDetails() {
		System.out.println(panNumber);
	}
}
