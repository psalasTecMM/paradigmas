class Person{
    private String name;
    private String lastName;

    Person(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }

    public String getName(){
        return name;
    }

    public String getLastName(){
        return lastName;
    }

    public void setName(String s){
        name = s;
    }

    public void setLastName(String s){
        lastName = s;
    }

    public String getFullName(){
        return name + " " + lastName;
    }

    public static void main(String[] args) {
        Person n = new Person("Jose","Perez");
        System.out.println(n.getFullName());
    }
}