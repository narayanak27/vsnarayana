package edu.disease.asn2;

import java.util.UUID;

abstract class Disease {
	UUID diseaseld;
	String name;
	
	public abstract String[] getExample();
	
	public UUID getDiseaseld() {
		return diseaseld;
	}


	public void setDiseaseld(UUID diseaseld) {
		this.diseaseld = diseaseld;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((diseaseld == null) ? 0 : diseaseld.hashCode());
		return result;
	}
	/**
	 * 
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disease other = (Disease) obj;
		if (diseaseld == null) {
			if (other.diseaseld != null)
				return false;
		} else if (!diseaseld.equals(other.diseaseld))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Disease [diseaseld=" + diseaseld + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		

	}

}
class InfectiousDisease extends Disease{

	@Override
	public String[] getExample() {
		String str[]= {"COVID-19","Malaria","HIV/AIDS","Tuberculosis"};
		return null;
	}
}
class NonInfectiousDisease extends Disease{

	@Override
	public String[] getExample() {
		String str[]= {"Diabetes","Heart Disease","Cancer","Alzheimer"};
		return null;
	}
	
}
