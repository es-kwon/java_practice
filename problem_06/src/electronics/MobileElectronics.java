package electronics;

public class MobileElectronics extends Electronics {
	protected String userName;
	protected String paymentPolicy;
	protected String communicationMethod;
	protected String weight;
	protected String useCase;
	
	public MobileElectronics() {}

	public String getUserName() {
		return userName;
	}

	public String getPaymentPolicy() {
		return paymentPolicy;
	}

	public String getCommunicationMethod() {
		return communicationMethod;
	}

	public String getWeight() {
		return weight;
	}

	public String getUseCase() {
		return useCase;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPaymentPolicy(String paymentPolicy) {
		this.paymentPolicy = paymentPolicy;
	}

	public void setCommunicationMethod(String communicationMethod) {
		this.communicationMethod = communicationMethod;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public void setUseCase(String useCase) {
		this.useCase = useCase;
	}
	
	
	

}
