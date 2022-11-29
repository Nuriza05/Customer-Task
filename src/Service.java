import java.time.LocalDate;

public interface Service {

     LocalDate getAge();
     Customer[] getStudentsSameCountry(Customer[]customers);
     Country[] sortCountry(Customer[]customers);
     Customer[] getAll(Customer[]customers);
}
