import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Array;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Customer c2 = new Customer("Nuriza","Muratova","@nurizm", LocalDate.of(2005, 2,5),Country.KYRGYZSTAN);
        Customer c1 = new Customer("Bek","Asylov","@bek", LocalDate.of(2002, 4,12),Country.KAZAKHSTAN);
        Customer c3 = new Customer("Elif","Gogebakan","@elizm", LocalDate.of(2000, 8,21),Country.TURKEY);

        Customer[]customers = {c1,c2,c3};

//        System.out.println(c1.getAge());
       System.out.println(Arrays.toString(c1.getStudentsSameCountry(customers)));
//        System.out.println(Arrays.toString(c1.sortCountry(customers)));
//       System.out.println(Arrays.toString(c1.getAll(customers)));










    }
    public static void fileWriter(){
        try(FileWriter fileWriter = new FileWriter("task.txt")){
            fileWriter.write("Customer деген класс тузунуз.Полерерин толтурунуз аты, фамилиясы,туулган олкосу,туулган жылы,почтасы болсун.Дагы бир service деген интерфейс ачып аны анын ичине 4 метод жазыныз.\" +\n" +
                    "//                    \"1-кардардын жашын кайтаруучу метод жазыныз,2-мамлекети окшош кардарларды кайтарыныз,3-кардарлардын мамлекетин сорттоп чыгарыныз,4-баардык кардарларды кайтаруучу метод жазыныз.\" +\n" +
                    "//                    \"Ал интерфейсти Customer клласына impliments кылып методдорго логикасын жазыныз.Mainдан жазган логиканызды иштетиниз\");");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void fileReader() {
        try (FileReader fileReader = new FileReader("task.txt")) {
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}