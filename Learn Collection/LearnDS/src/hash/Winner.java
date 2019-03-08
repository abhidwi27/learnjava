package hash;

public class Winner {
	
	private Student s;
	private School sch;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((s == null) ? 0 : s.hashCode());
		result = prime * result + ((sch == null) ? 0 : sch.hashCode());
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
		Winner other = (Winner) obj;
		if (s == null) {
			if (other.s != null)
				return false;
		} else if (!s.equals(other.s))
			return false;
		if (sch == null) {
			if (other.sch != null)
				return false;
		} else if (!sch.equals(other.sch))
			return false;
		return true;
	}
	public Student getS() {
		return s;
	}
	public void setS(Student s) {
		this.s = s;
	}
	public School getSch() {
		return sch;
	}
	public void setSch(School sch) {
		this.sch = sch;
	}

}
