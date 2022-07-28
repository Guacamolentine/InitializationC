package ua.ithilel.java.first;

public class IdentyCardTest {

    public static void main(String[] args) {

        IdentyCard firstPerson = new IdentyCard();
        IdentyCard secondPerson = new IdentyCard();
        IdentyCard thirdPerson = new IdentyCard();

        firstPerson.IdName = "Valentine";
        firstPerson.IdSurName = "Golovatskiy";
        firstPerson.IdSitizenship = "Ukrainian";
        firstPerson.IdCode = "987456123123";

        secondPerson.IdName = "Ivan";
        secondPerson.IdSurName = "Sergeev";
        secondPerson.IdSitizenship = "Canadian";
        secondPerson.IdCode = "5465465465654";

        thirdPerson.IdName = "Andrey";
        thirdPerson.IdSurName = "Golofaev";
        thirdPerson.IdSitizenship = "African";
        thirdPerson.IdCode = "546546516131";

        System.out.println("First Person Name: " + firstPerson.IdName);
        System.out.println("First Person Surname: " + firstPerson.IdSurName);
        System.out.println("First Person Sitizenship: " + firstPerson.IdSitizenship);
        System.out.println("First Person ID Code: " + firstPerson.IdCode);

        System.out.println();

        System.out.println("Second Person Name: " + secondPerson.IdName);
        System.out.println("Second Person Surname: " + secondPerson.IdSurName);
        System.out.println("Second Person Sitizenship: " + secondPerson.IdSitizenship);
        System.out.println("Second Person ID Code: " + secondPerson.IdCode);

        System.out.println();

        System.out.println("Third Person Name: " + thirdPerson.IdName);
        System.out.println("Third Person Surname: " + thirdPerson.IdSurName);
        System.out.println("Third Person Sitizenship: " + thirdPerson.IdSitizenship);
        System.out.println("Third Person ID Code: " + thirdPerson.IdCode);
    }
}
