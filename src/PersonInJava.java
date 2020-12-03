public class PersonInJava {

    private String name;
    private String surname;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonInJava personInJava = (PersonInJava) o;

        if (name != null ? !name.equals(personInJava.name) : personInJava.name != null) return false;
        if (surname != null ? !surname.equals(personInJava.surname) : personInJava.surname != null)
            return false;
        return id != null ? id.equals(personInJava.id) : personInJava.id == null;

    }

    @Override public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        return result;
    }

    @Override public String toString() {
        return "Person{" +
                "name='" + name + "'" +
                ", surname='" + surname + "'" +
                ", id='" + id + "'" + '}';
    }
}