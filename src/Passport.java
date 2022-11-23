class Human implements Comparable<Human> {
    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    private int dateBirth;
    private int passportNumber;


    public String toString() {
        return "Human{" +
                "id=" + id +
                ", Имя='" + firstName + '\'' +
                ", Фомилия='" + middleName + '\'' +
                ", Отчество='" + lastName + '\'' +
                ", Дата рождения =" + dateBirth +
                ", Номер паспорта =" + passportNumber +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDateBirth() {
        return dateBirth;
    }

    public int getPassportNumber() {
        return passportNumber;
    }

    public Human(String firstName, String middleName, String lastName, int dateBirth, int passportNumber) {
        this.firstName = formatString(firstName);
        this.middleName = formatString(middleName);
        this.lastName = formatString(lastName);
        this.dateBirth = formatInt(dateBirth);
        this.passportNumber = formatInt(passportNumber);
    }

    private String formatString(String name) {
        String result = name != null ? name.trim() : "";
        if (result.length() > 0) {
            result = String.format("%s%s", Character.toUpperCase(result.charAt(0)), result.substring(1, result.length()).toLowerCase());
        }
        return result;
    }

    private int formatInt(int number) {
        return number < 0 ? 0 : number;
    }

    public String getFullName() {
        return String.format("%s %s %s", this.firstName, this.middleName, this.lastName);
    }


    public int compareTo(Human o) {
        return o != null ? this.getFullName().compareTo(o.getFullName()) : 0;
    }

}
