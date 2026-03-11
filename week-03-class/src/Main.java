public class Main{
    public static void main(String[] args){
        //create a human object
        Human mary = new Human();
        //access the object
        mary.name = "Mary Jane";
        mary.year_of_birth = 2010;
        //read the date
        System.out.println("mary.name");
        System.out.println("mary.year_of_birth");

        //create another human:
        Human peter;// new reference
        peter = new Human(); //create a new object, allocate some space to store the data
        peter.name = "Peter Parker";
        peter.year_of_birth = 2009;
        System.out.println("peter.name");
        System.out.println("peter.year_of_birth");
        //create a reference copy of another object:
        Human clone = peter;// It's a new human or just a pointer(reference) to another object?
        clone.name = "Spiderman";
        System.out.println("The clone:");
        System.out.println("clone.name);
                System.out.println("clone.year_of_birth");

    }
