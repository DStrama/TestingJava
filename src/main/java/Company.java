import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Company {


    public Company(Person CEO, Person CTO, Person CFO) {
        this.CEO = CEO;
        this.CTO = CTO;
        this.CFO = CFO;
        this.localisationList = new ArrayList<Localisation>();
    }

    private Person CEO;
    private Person CTO;
    private Person CFO;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(CEO, company.CEO) &&
                Objects.equals(CTO, company.CTO) &&
                Objects.equals(CFO, company.CFO) &&
                Objects.equals(localisationList, company.localisationList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CEO, CTO, CFO, localisationList);
    }

    public Person getCEO() {
        return CEO;
    }

    public void setCEO(Person CEO) {
        this.CEO = CEO;
    }

    public Person getCTO() {
        return CTO;
    }

    public void setCTO(Person CTO) {
        this.CTO = CTO;
    }

    public Person getCFO() {
        return CFO;
    }

    public void setCFO(Person CFO) {
        this.CFO = CFO;
    }

    public List<Localisation> getLocalisationList() {
        return localisationList;
    }

    public void setLocalisationList(List<Localisation> localisationList) {
        this.localisationList = localisationList;
    }

    private List<Localisation> localisationList;

    @Override
    public String toString() {
        return "Company{" +
                "CEO=" + CEO +
                ", CTO=" + CTO +
                ", CFO=" + CFO +
                ", localisationList=" + localisationList +
                '}';
    }

    /*public int checkAmount(){
     for(Localisation i : this.localisationList){
           for( Department e ){

            }
        }
    }

*/
}

