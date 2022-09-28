package by.override;

class Toy {
   public String name = "Vasya";
    public void printName() {
        System.out.println("Toy");
    }

    public void voice() {
        System.out.println("jjj");
    }
}

class Doll extends Toy {
    public String name = "Goga";
    public void printName()  {
        System.out.println("Doll");
    }
    public void voice() {
        System.out.println("La");
    }
}


