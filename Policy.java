public class Policy {
    private int policyNumber;
    private String providerName;
    private String policyholderFirstName;
    private String policyholderLastName;
    private int policyholderAge;
    private String policyholderSmokingStatus;
    private int policyholderHeight;
    private int policyholderWeight;

    
    public Policy() {
        this.policyNumber = 0; 
        this.providerName = "Unknown"; 
        this.policyholderFirstName = "Unknown"; 
        this.policyholderLastName = "Unknown"; 
        this.policyholderAge = 0; 
        this.policyholderSmokingStatus = "non-smoker"; 
        this.policyholderHeight = 0; 
        this.policyholderWeight = 0; 
    }

    
    public Policy(int policyNumber, String providerName, String policyholderFirstName, String policyholderLastName,
                  int policyholderAge, String policyholderSmokingStatus, int policyholderHeight, int policyholderWeight) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyholderFirstName = policyholderFirstName;
        this.policyholderLastName = policyholderLastName;
        this.policyholderAge = policyholderAge;
        this.policyholderSmokingStatus = policyholderSmokingStatus;
        this.policyholderHeight = policyholderHeight;
        this.policyholderWeight = policyholderWeight;
    }

    
    public int getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getPolicyholderFirstName() {
        return policyholderFirstName;
    }

    public void setPolicyholderFirstName(String policyholderFirstName) {
        this.policyholderFirstName = policyholderFirstName;
    }

    public String getPolicyholderLastName() {
        return policyholderLastName;
    }

    public void setPolicyholderLastName(String policyholderLastName) {
        this.policyholderLastName = policyholderLastName;
    }

    public int getPolicyholderAge() {
        return policyholderAge;
    }

    public void setPolicyholderAge(int policyholderAge) {
        this.policyholderAge = policyholderAge;
    }

    public String getPolicyholderSmokingStatus() {
        return policyholderSmokingStatus;
    }

    public void setPolicyholderSmokingStatus(String policyholderSmokingStatus) {
        this.policyholderSmokingStatus = policyholderSmokingStatus;
    }

    public int getPolicyholderHeight() {
        return policyholderHeight;
    }

    public void setPolicyholderHeight(int policyholderHeight) {
        this.policyholderHeight = policyholderHeight;
    }

    public int getPolicyholderWeight() {
        return policyholderWeight;
    }

    public void setPolicyholderWeight(int policyholderWeight) {
        this.policyholderWeight = policyholderWeight;
    }
    public double calculateBMI() {
    double heightInInches = policyholderHeight;
    double weightInPounds = policyholderWeight;
    return (weightInPounds * 703) / (heightInInches * heightInInches);
}

   public double calculatePolicyPrice() {
    double baseFee = 600.0;
    double additionalFee = 0.0;
    
    if (policyholderAge > 50) {
        additionalFee += 75.0;
    }
    
    if (policyholderSmokingStatus.equalsIgnoreCase("smoker")) {
        additionalFee += 100.0;
    }
    
    double bmi = calculateBMI();
    
    if (bmi > 35) {
        additionalFee += (bmi - 35) * 20;
    }
    
    return baseFee + additionalFee;
}

}
