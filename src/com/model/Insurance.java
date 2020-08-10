package com.model;

import java.io.Serializable;
public class Insurance implements Serializable {
	
	public void setGroupNumber(String groupNumber) {
		this.groupNumber = groupNumber;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setHealthcare_provider(String healthcare_provider) {
		this.healthcare_provider = healthcare_provider;
	}

	private String groupNumber;
    private String hospitalName;
    private String address;
    private String healthcare_provider;

	public Insurance(){
    }
    
    public String getGroupNumber() {
        return groupNumber;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public String getAddress() {
        return address;
    }

    public String getHealthcare_provider() {
        return healthcare_provider;
    }

}
