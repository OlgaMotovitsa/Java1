//1) Дана строка sql-запроса "select * from students where ".
// Сформируйте часть WHERE этого запроса, используя StringBuilder.
// Данные для фильтрации приведены ниже в виде json-строки.
//Если значение null, то параметр не должен попадать в запрос.
//Параметры для фильтрации: {"name":"Ivanov", "country":"Russia",
// "city":"Moscow", "age":"null"}

package homeworks.hw2;
import java.util.Scanner;
public class Task1 {
    public void StringRequest() {
        String sqlrequest = "SELECT * FROM students WHERE ";
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String names = in.nextLine();
        System.out.println("Введите страну: ");
        String country = in.nextLine();
        System.out.println("Введите город: ");
        String city = in.nextLine();
        System.out.println("Введите возраст: ");
        String age = in.nextLine();
        StringBuilder fullRequest = new StringBuilder();
        if (names != "") {
            fullRequest.append("name=" + "\'" + names + "\' AND ");
        }
        else{
            int nameLength = fullRequest.indexOf("name=" + "\'" + names + "\' AND ");
            if ( nameLength !=-1) {
                fullRequest.delete(nameLength,nameLength+fullRequest.length());
            }
        }
        if (country != "") {
            fullRequest.append("country=" + "\'" + country + "\' AND ");
        }
        else{
            int countryLength = fullRequest.indexOf("country=" + "\'" + country + "\' AND ");
            if ( countryLength !=-1) {
                fullRequest.delete(countryLength,countryLength+fullRequest.length());
            }
        }
        if (city != "") {
            fullRequest.append("city=" + "\'" + city+  "\' AND ");
        }
        else{
            int cityLength = fullRequest.indexOf("city=" + "\'" + city+  "\' AND ");
            if ( cityLength !=-1) {
                fullRequest.delete(cityLength,cityLength+fullRequest.length());
            }
        }
        if (age != "") {
            fullRequest.append("age=" + "\'" + age + "\'");
        }
        else
        {
            int ageLength = fullRequest.indexOf("age=" + "\'" + age + "\'");
            if ( ageLength !=-1) {
                fullRequest.delete(ageLength,ageLength+fullRequest.length());
            }
        }
        System.out.println(sqlrequest + fullRequest);
        in.close();
    }

}
