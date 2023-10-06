package Part1_Assignments_And_Arguments;

public class Arguments {
    public static void main(String[] args) {
        //Part 1.2.2 Creating an object of a class
        ArgumentsExampleClass obj2 = new ArgumentsExampleClass();
        //Here, we print out the initial 'Example' property of the obj2 and then change it into '=('
        MethodWithAnObjectArgument(obj2);
        //Here, we print out the changed 'Example' property of the obj2
        MethodWithAnObjectArgument(obj2);
        //Part 1.2.5 As we can see, our method changed the 'Example' property changed the variable even outside the method.

    }
    //Part 1.2.3 Passing the object into the method
    public static void MethodWithAnObjectArgument(ArgumentsExampleClass obj2){
        //Part 1.2.4 Changing the property inside the method
        System.out.println(obj2.Example);
        obj2.Example = "=(";
    }
}
