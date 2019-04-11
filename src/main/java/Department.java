import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Department {
    private String name;
    private DepartmentType departmentType;

    public Department(String name, DepartmentType departmentType) {
        this.name = name;
        this.departmentType = departmentType;
        this.personList = new ArrayList<Person>();
    }

    private List<Person> personList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DepartmentType getDepartmentType() {
        return departmentType;
    }

    public void setDepartmentType(DepartmentType departmentType) {
        this.departmentType = departmentType;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(departmentType, that.departmentType) &&
                Objects.equals(personList, that.personList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, departmentType, personList);
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", departmentType=" + departmentType +
                ", personList=" + personList +
                '}';
    }
    public void addPerson(Person person){

        if(person.getPosition() == Position.TRAINING_MANAGER || person.getPosition() == Position.HR_ANALYST && this.departmentType == DepartmentType.HR) {
            personList.add(person);
        }
        else if (person.getPosition()== Position.MARKETING_CONSULTANT || person.getPosition() == Position.MARKETING_RESEARCH_SPECIALIST && this.departmentType == DepartmentType.MARKETING){
            personList.add(person);
        }
        else if (person.getPosition()== Position.JAVA_DEVELOPER || person.getPosition() == Position.CPP_DEVELOPER && this.departmentType == DepartmentType.DEVELOPMENT){
            personList.add(person);
        }

    }

    public void removePerson (Person person){
        personList.remove(person);
    }

    public void shiftPerson(Person person, Department department){
        if(this.personList.contains(person)){
            department.addPerson(person);
            removePerson(person);
        }
    }
}
