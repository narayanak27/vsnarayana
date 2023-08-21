package edu.disease.asn1;

import java.time.LocalDateTime;
import java.util.UUID;

public class Exposure {
	private UUID patientId;
	private LocalDateTime dateTime;
	private String exposureType;

	public Exposure(LocalDateTime dateTime, String exposureType) {
		this.dateTime = dateTime;
		this.exposureType = exposureType;
	}

		
	public void setPatientId(UUID patientId) {
		this.patientId = patientId;
	}


	public UUID getPatientId() {
		return patientId;
	}
	
	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public String getExposureType() {
		return exposureType;
	}

	public void setExposureType(String exposureType) {
		if((exposureType.equalsIgnoreCase("D")) || (exposureType.equalsIgnoreCase("I")))
			this.exposureType = exposureType;
		else
			throw new IllegalArgumentException("Enter Only D or I");
		
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateTime == null) ? 0 : dateTime.hashCode());
		result = prime * result + ((patientId == null) ? 0 : patientId.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exposure other = (Exposure) obj;
		if (dateTime == null) {
			if (other.dateTime != null)
				return false;
		} else if (!dateTime.equals(other.dateTime))
			return false;
		if (exposureType == null) {
			if (other.exposureType != null)
				return false;
		} else if (!exposureType.equals(other.exposureType))
			return false;
		if (patientId == null) {
			if (other.patientId != null)
				return false;
		} else if (!patientId.equals(other.patientId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Exposure [patientId=" + patientId + ", dateTime=" + dateTime + ", exposureType=" + exposureType + "]";
	}
	
	
}
