package Mentoring_OmerGoker._14_Constructors._04_Constructor_Questions.Q7;

public class Planet {
    String name;
    int moons;
    public Planet(String name, int moons){
        this.name= name;
        this.moons=moons;
    }
    public static void main(String[] args) {
        Planet[] planets={ 	new Planet("Mercury", 0),
                new Planet("Venus", 0),
                new Planet("Earth", 1),
                new Planet("Mars", 2)};
        System.out.print(planets[2].name);
        System.out.print(planets[2].moons);
    }
}

//	line 15-->System.out.print(planets);

