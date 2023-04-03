
public class Main {
    public static void main(String[] args) {

        int ticket_price = 5010; // стоимость билета
        int bonus_mile_cost = 20; // стоимость бонусной мили
        int number_miles = ticket_price / bonus_mile_cost; // количество миль


        System.out.println("Количество миль за купленный билет:");
        System.out.println((number_miles) + " миль");


    }
}