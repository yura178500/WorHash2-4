import java.util.Arrays;
import java.util.Comparator;

class BaseHuman {
    private static final int DEFAULT_LENGTH = 10;

    private Human[] base;
    private int numer;

    public BaseHuman() {
        this.base = new Human[DEFAULT_LENGTH];
    }

    public int getAmountHuman() {
        return this.numer;
    }

    private void dynamicIncrease() {
        if (this.base.length == this.numer) {
            this.base = Arrays.copyOf(this.base, this.base.length * 3 / 2 + 1);
        }
    }

    public boolean addHuman(Human human) {
        boolean result;
        if (result = human != null) {
            dynamicIncrease();
            this.base[this.numer++] = human;
            human.setId(this.numer);
        }
        return result;
    }


    public void sortByNumber() {
        Arrays.sort(this.base, Comparator.comparingInt(Human::getPassportNumber));
    }

    public Human findBySurname(String surname) {
        Human result = null;
        if (surname != null) {
            for (int index = 0; index < this.numer; index++) {
                if (this.base[index].getFirstName().toLowerCase().equals(surname.toLowerCase())) {
                    result = this.base[index];
                    break;
                }
            }
        }
        return result;
    }

    public Human editHumanById(Human human, int id) {
        Human result = null;
        if (human != null) {
            for (int index = 0; index < this.numer; index++) {
                if (id == this.base[index].getId()) {
                    human.setId(id);
                    this.base[index] = human;
                    result = human;
                    break;
                }
            }
        }
        return result;
    }

    public Human[] toArray() {
        return Arrays.copyOf(this.base, this.numer);
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BASE HUMANS:").append(System.lineSeparator());
        for (int index = 0; index < this.numer; index++) {
            sb.append(this.base[index]).append(System.lineSeparator());
        }
        return sb.toString();
    }


}