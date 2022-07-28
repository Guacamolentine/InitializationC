package ua.ithilel.java.first;

public class CountryTest {

    public static void main(String[] args) {

        Country firstCountry = new Country();
        Country secondCountry = new Country();
        Country thirdCountry = new Country();

        firstCountry.CountryName = "Ukaraine";
        firstCountry.CountryAge = 31;
        firstCountry.CountryArea = 603_549;
        firstCountry.CountryPopulation = 44_000_000;

        secondCountry.CountryName = "America";
        secondCountry.CountryAge = 246;
        secondCountry.CountryArea = 9_834_000;
        secondCountry.CountryPopulation = 329_500_000;

        thirdCountry.CountryName = "Brazil";
        thirdCountry.CountryAge = 200;
        thirdCountry.CountryArea = 8_500_000;
        thirdCountry.CountryPopulation = 212_600_000;

        System.out.println("First Country Name: " + firstCountry.CountryName);
        System.out.println("First Country Age: " + firstCountry.CountryAge);
        System.out.println("First Country Area: " + firstCountry.CountryArea);
        System.out.println("First Country Population: " + firstCountry.CountryPopulation);

        System.out.println();

        System.out.println("Second Country Name: " + secondCountry.CountryName);
        System.out.println("Second Country Age: " + secondCountry.CountryAge);
        System.out.println("Second Country Area: " + secondCountry.CountryArea);
        System.out.println("Second Country Population: " + secondCountry.CountryPopulation);

        System.out.println();

        System.out.println("Third Country Name: " + thirdCountry.CountryName);
        System.out.println("Third Country Age: " + thirdCountry.CountryAge);
        System.out.println("Third Country Area: " + thirdCountry.CountryArea);
        System.out.println("Third Country Population: " + thirdCountry.CountryPopulation);
    }
}
