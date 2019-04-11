import java.util.Date;
import java.util.Objects;

public class Person {
    private String name; private String surname; private Date birthDate;
    private String pesel;
    private Position position;
    PeselValidator peselValidator;



    public Person(String name, String surname, Date birthDate, String pesel, Position position) throws IllegalArgumentException{



            if(SingletonPeselList.getInstance().getPeselList().contains(pesel)) {
                throw new IllegalArgumentException("Exception person with this pesel already exists");
            }
            else{

                if( !(name.equals("") || surname.equals("")) ){
                    this.name = name;
                    this.surname = surname;
                }
                else{
                    throw new IllegalArgumentException("Exception name and surname is incorrect");
                }

                if( birthDate.getYear() > 18 ){
                    this.birthDate = birthDate;
                }
                else{
                    throw new IllegalArgumentException("Exception age is incorrect");
                }

                peselValidator= new PeselValidator(pesel);
                if( peselValidator.isValid()){
                    this.pesel = pesel;
                }
                else{
                    throw new IllegalArgumentException("Exception pesel is is incorrect");
                }
                this.position = position;
             }

    }



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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname) &&
                Objects.equals(birthDate, person.birthDate) &&
                Objects.equals(pesel, person.pesel) &&
                position == person.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthDate, pesel, position);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + birthDate +
                ", pesel='" + pesel + '\'' +
                ", position=" + position +
                '}';
    }
}

