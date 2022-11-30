import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Customer implements Service {
    private String name, surname,email;
    private Country country;
    private LocalDate dateOfBirth;

    public Customer(String name, String surname, String email, LocalDate dateOfBirth, Country country) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.country=country;
    }

    @Override
    public LocalDate getAge() throws InputMismatchException{
        LocalDate age = LocalDate.now().minusYears(dateOfBirth.getYear());
        return age;
    }

    @Override
    public Customer[] getStudentsSameCountry(Customer[]customers) throws MyException {
            String country = new Scanner(System.in).next();
            if (!country.matches("[a-zA-Za-яА-Я]*"))
                throw new MyException("Write the country name! Please!");

        int counter = 0;
        for (Customer customer : customers) {
            if (customer.country.name().equals(country.toUpperCase())) {
                counter++;
            }
        }

        int index = 0;
        Customer[]customers1 = new Customer[counter];
        for (Customer customer : customers) {
            if(customer.country.name().equals(country.toUpperCase())) {
                customers1[index] = customer;
                index++;
            }
        }return customers1;
    }

    @Override
    public Country[] sortCountry(Customer[]customers){
        Country[]countries = new Country[customers.length];
        int index = 0 ;
        for (Customer customer : customers) {
            countries[index]=customer.country;
            index++;
        }
        Arrays.sort(countries);
        return countries;

    }

    @Override
    public Customer[] getAll(Customer[] customers) {
            return customers;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", country='" + country + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
