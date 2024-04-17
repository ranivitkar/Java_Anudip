class Lady {
}

class Mother extends Lady {
    String name = "";
    String surname = "";

    public Mother(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}

class Kid {
    static String name = " ";

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Kid myself = new Kid();

        myself.setName("Rani");

        Mother mname = new Mother("Anita", "Vitkar");

        System.out.println("My name is: " + name + " " + mname.surname);
        System.out.println("My mother's name is: " + mname.name + " " + mname.surname);

    }
}