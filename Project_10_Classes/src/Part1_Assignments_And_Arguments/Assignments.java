package Part1_Assignments_And_Arguments;

public class Assignments {
    public static void main(String[] args) {
        //Part 1.1.2 Creating an object of a class
        AssignmentsExampleClass obj1 = new AssignmentsExampleClass();
        //Part 1.1.3 Creating the references of the object
        AssignmentsExampleClass ReferenceVariableA = obj1;
        AssignmentsExampleClass ReferenceVariableB = obj1;
        //Part 1.1.4 Changing the object's properties with the reference variables
        //Changing the 'Example' property to print out '=)'
        ReferenceVariableA.Example = "=)";
        //In this instance, obj1.Example is equal to '=)'
        System.out.println(ReferenceVariableA.Example);
        //Changing the 'Example' property to print out '=('
        ReferenceVariableB.Example = "=(";
        //In this instance, obj1.Example is equal to '=(', despite the fact that a different reference was used to change the property
        System.out.println(ReferenceVariableA.Example);
    }
}
