/**
 * Represents an insurance policy, including details about the policy holder.
 */
public class Policy {
    private int policyNumber;
    private String providerName;
    private String policyholderFirstName;
    private String policyholderLastName;
    private int policyholderAge;
    private String policyholderSmokingStatus;
    private int policyholderHeight;
    private int policyholderWeight;

    /**
     * Default constructor initializing the policy with default values.
     */
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

    /**
     * Constructor initializing the policy with specific details.
     *
     * @param policyNumber The policy number.
     * @param providerName The name of the provider.
     * @param policyholderFirstName The first name of the policy holder.
     * @param policyholderLastName The last name of the policy holder.
     * @param policyholderAge The age of the policy holder.
     * @param policyholderSmokingStatus The smoking status of the policy holder.
     * @param policyholderHeight The height of the policy holder in inches.
     * @param policyholderWeight The weight of the policy holder in pounds.
     */
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

    /**
     * Gets the policy number.
     *
     * @return The policy number.
     */
    public int getPolicyNumber() {
        return policyNumber;
    }

    /**
     * Sets the policy number.
     *
     * @param policyNumber The policy number to set.
     */
    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    /**
     * Gets the provider name.
     *
     * @return The provider name.
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * Sets the provider name.
     *
     * @param providerName The name of the provider to set.
     */
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /**
     * Gets the policy holder's first name.
     *
     * @return The first name of the policy holder.
     */
    public String getPolicyholderFirstName() {
        return policyholderFirstName;
    }

    /**
     * Sets the policy holder's first name.
     *
     * @param policyholderFirstName The first name of the policy holder.
     */
    public void setPolicyholderFirstName(String policyholderFirstName) {
        this.policyholderFirstName = policyholderFirstName;
    }

    /**
     * Gets the policy holder's last name.
     *
     * @return The last name of the policy holder.
     */
    public String getPolicyholderLastName() {
        return policyholderLastName;
    }

    /**
     * Sets the policy holder's last name.
     *
     * @param policyholderLastName The last name of the policy holder.
     */
    public void setPolicyholderLastName(String policyholderLastName) {
        this.policyholderLastName = policyholderLastName;
    }

    /**
     * Gets the policy holder's age.
     *
     * @return The age of the policy holder.
     */
    public int getPolicyholderAge() {
        return policyholderAge;
    }

    /**
     * Sets the policy holder's age.
     *
     * @param policyholderAge The age of the policy holder to set.
     */
    public void setPolicyholderAge(int policyholderAge) {
        this.policyholderAge = policyholderAge;
    }

    /**
     * Gets the policy holder's smoking status.
     *
     * @return The smoking status of the policy holder.
     */
    public String getPolicyholderSmokingStatus() {
        return policyholderSmokingStatus;
    }

    /**
     * Sets the policy holder's smoking status.
     *
     * @param policyholderSmokingStatus The smoking status of the policy holder.
     */
    public void setPolicyholderSmokingStatus(String policyholderSmokingStatus) {
        this.policyholderSmokingStatus = policyholderSmokingStatus;
    }

    /**
     * Gets the policy holder's height in inches.
     *
     * @return The height of the policy holder.
     */
    public int getPolicyholderHeight() {
        return policyholderHeight;
    }

    /**
     * Sets the policy holder's height in inches.
     *
     * @param policyholderHeight The height of the policy holder to set.
     */
    public void setPolicyholderHeight(int policyholderHeight) {
        this.policyholderHeight = policyholderHeight;
    }

    /**
     * Gets the policy holder's weight in pounds.
     *
     * @return The weight of the policy holder.
     */
    public int getPolicyholderWeight() {
        return policyholderWeight;
    }

    /**
     * Sets the policy holder's weight in pounds.
     *
     * @param policyholderWeight The weight of the policy holder to set.
     */
    public void setPolicyholderWeight(int policyholderWeight) {
        this.policyholderWeight = policyholderWeight;
    }

    /**
     * Calculates the Body Mass Index (BMI) of the policy holder.
     *
     * @return The BMI of the policy holder.
     */
    public double calculateBMI() {
        double heightInInches = this.policyholderHeight;
        double weightInPounds = this.policyholderWeight;
        return (weightInPounds * 703) / (heightInInches * heightInInches);
    }

    /**
     * Calculates the policy price based on age, smoking status, and BMI of the policy holder.
     *
     * @return The calculated policy price.
     */
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
