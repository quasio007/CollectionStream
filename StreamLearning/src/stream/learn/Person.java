package stream.learn;

public class Person implements Comparable<Person>{
	private String id;
	private String country;

	public Person(String id, String country) {
		this.id = id;
		this.country = country;

	}

	@Override
	public String toString() {

		return getId();
	}

	public String getId() {
		return id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Person other = (Person) obj;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public String getCountry() {
		return country;
	}

	@Override
	public int compareTo(Person person) {
		return id.compareTo(person.getId());
	}

}
