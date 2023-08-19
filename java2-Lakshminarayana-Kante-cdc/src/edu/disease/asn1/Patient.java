package edu.disease.asn1;
import java.util.Arrays;
import java.util.UUID;
public class Patient {
	private String firstName;
	private String lastName;
	private Exposure[] exposures;
	private UUID[] diseaseIds;
	private UUID patientId;
	int maxDisease,maxExposures;
	int index=0;
	
	public Patient(int maxDiseaseIds, int maxExposures) {
		if((maxDisease>=0)||(maxExposures>=0)) {
			this.maxDisease = maxDiseaseIds;
			this.maxExposures = maxExposures;
		}
		else
			throw new IllegalArgumentException("Invalid Data");
	}

	void addDiseaseId(UUID Id){
		if(index < maxDisease)
			diseaseIds[index++]=Id;
		else
			throw new IllegalArgumentException("Its maximum");
		
	}
	void addExposure(Exposure exposure) {
		if(index < maxExposures)
			exposures[index++]=exposure;
		else
			throw new IndexOutOfBoundsException("Its maximum");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(diseaseIds);
		result = prime * result + Arrays.hashCode(exposures);
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + index;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + maxDisease;
		result = prime * result + maxExposures;
		result = prime * result + ((patientId == null) ? 0 : patientId.hashCode());
		return result;
	}
	
	public UUID getPatientId() {
		return patientId;
	}

	public void setPatientId(UUID patientId) {
		this.patientId = patientId;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		if (!Arrays.equals(diseaseIds, other.diseaseIds))
			return false;
		if (!Arrays.equals(exposures, other.exposures))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (index != other.index)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (maxDisease != other.maxDisease)
			return false;
		if (maxExposures != other.maxExposures)
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
		return "Patient [firstName=" + firstName + ", lastName=" + lastName + ", exposures="
				+ Arrays.toString(exposures) + ", diseaseIds=" + Arrays.toString(diseaseIds) + ", patientId="
				+ patientId + ", maxDisease=" + maxDisease + ", maxExposures=" + maxExposures + ", index=" + index
				+ "]";
	}

	
	
}
