class Person implements Comparable<Person> {
    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public int compareTo(Person otherPerson) {
        // add your code here!
        int flag = compare(this.getName(), otherPerson.getName());
        if (flag == 0) {
            return  compare(this.getAge(), otherPerson.getAge());
        }else{
            return flag;
        }

    }

    private int compare(int age, int age1) {
        return Integer.compare(age, age1);
    }

    private int compare(String name, String name1){
        return name.compareTo(name1);
    }
}