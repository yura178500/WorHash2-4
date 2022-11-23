import java.util.HashSet;
import java.util.Set;

class Main {
    public static void main(String[] args) {

        BaseHuman base = new BaseHuman();

        Set<Human>  human = new HashSet<>();
        base.addHuman(new Human("Иванов", "Петр", "Иванович", 1983, 48888888));
        base.addHuman(new Human("Кузмин", "Артём", "Николаевич", 2001, 785558888));
        base.addHuman(new Human("Петров", "Антон", "Васильевич", 2000, 422888888));
        base.addHuman(new Human("Павлов", "Иван", "Владимирович", 1998, 105588888));
        base.addHuman(new Human("Кошкин", "Алексей", "Сергеевич", 1999, 357458888));
        base.addHuman(new Human("Сидоров", "Александр", "Антонович", 1975, 4881288));
        base.addHuman(new Human("Попов", "Сергеё", "Николаевич", 2001, 48588588));
        base.addHuman(new Human("Гусаров", "Никита", "Петрович", 1999, 48858588));
        base.addHuman(new Human("Сватков", "Илья", "Владимирович", 1986, 488588888));
        base.addHuman(new Human("Сёмин", "Василиё", "Владимирович", 1983, 48888888));


        System.out.println();
        System.out.println(human);

        System.out.println();
        //сортируем по номеру паспорта
        base.sortByNumber();
        System.out.println("Сортировка по номеру паспорта");
        System.out.println(base);
        System.out.println();

        //поиск по фамилии
        System.out.println("Поиск по фомиилии [Попов]");
        System.out.println(base.findBySurname("Попов"));
        System.out.println();

        //редактируем человека с id = 1
        System.out.println("Изменения данных по ID = 1");
        System.out.println(base.editHumanById(new Human("Ивашев", "Иван", "Иванович", 2004, 320000000), 1));
    }
}