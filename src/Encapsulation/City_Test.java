package Encapsulation;

public class City_Test {

    public static void main(String[] args) {

        City city = new City();

        city.setName("chicago");
        System.out.println(city.getName());

        city.setPopulation(2_700_000);
        System.out.println(city.getPopulation());

        city.setEstablishmentYear(1837);
        System.out.println(city.getEstablishmentYear());



        }

    }

