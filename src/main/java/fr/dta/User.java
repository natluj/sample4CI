package fr.dta;

public class User {

    protected Long id;
//	id en protected et non public + mise en place du getter
    public Long getId() {
		return id;
	}

	private String lastName;

    private String firstName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = "lastName=" + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return id.equals(user.id);
    }

//	ajout de hashCode qui doit être overrridé, comme equals
    @Override
    public int hashCode() {
    	// TODO Auto-generated method stub
    	return super.hashCode();
    }

    @Override
    public String toString() {
        if (id == null) {
//        	doit retourner un String (ici vide) et non un null
            return "";
        }
        return "id=" + id + ", lastName=" + lastName + ", firstName=" + firstName;
    }
}
