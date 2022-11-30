import java.time.LocalDate;

public interface Service {

     LocalDate getAge() throws Exception;
     Customer[] getStudentsSameCountry(Customer[]customers) throws Exception;
     Country[] sortCountry(Customer[]customers);
     Customer[] getAll(Customer[]customers);
}
