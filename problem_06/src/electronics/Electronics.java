package electronics;

public class Electronics {
	protected String serialNo; // 일련번호
	protected String modelName; // 전자기기 모델명
	protected String companyName; // 제조 회사명
	protected String dateOfMade; // 생산일자
	protected String authMethod; // 본인인증
	
	// Constructor
	public Electronics() {}

	
	// getter, setter
	public String getSerialNo() {
		return serialNo;
	}

	public String getModelName() {
		return modelName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getDateOfMade() {
		return dateOfMade;
	}

	public String getAuthMethod() {
		return authMethod;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setDateOfMade(String dateOfMade) {
		this.dateOfMade = dateOfMade;
	}

	public void setAuthMethod(String authMethod) {
		this.authMethod = authMethod;
	}
	
	@Override
	public String toString() {
		return String.format("Serial Num : %s, Model Name : %s, Company Name : %s, Date of Made : %s\n", serialNo, modelName, companyName, dateOfMade);
	}
	
	@Override
	public boolean equals(Object o) {
		return this.serialNo.equals(((Electronics)o).serialNo)
				&& this.modelName.equals(((Electronics)o).modelName)
				&& this.companyName.equals(((Electronics)o).companyName)
				&& this.dateOfMade.equals(((Electronics)o).dateOfMade)
				&& this.authMethod.equals(((Electronics)o).authMethod);
	}

}
