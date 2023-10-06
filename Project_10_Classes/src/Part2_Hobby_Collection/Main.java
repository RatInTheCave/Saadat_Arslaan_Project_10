package Part2_Hobby_Collection;
public class Main {

    public static void main(String[] args) {
        boolean exitFlag = false;
        while (!exitFlag) {

            exitFlag = executeMenuChoice(Options(), exitFlag);

        }
    }


    public static int Options() {
        boolean MenuFlag = false;
        int ChoiceCount = 0;
        String userChoice;
        while (!MenuFlag) {
            userChoice = Collection_Class.GetUserString("""
                     Welcome to the collection menu, please choose one of the following items:
                     1. Add miniatures
                     2. Show miniatures
                     3. Show ALL miniatures
                     4. Search miniatures
                     5. Sort miniatures by amount per group
                     6. Exit
                    """);
            if (userChoice.toLowerCase().contains("add")) {
                ChoiceCount = 1;
                MenuFlag = true;
            } else if (userChoice.contains("1")) {
                MenuFlag = true;
                ChoiceCount = 1;
            } else if (userChoice.toLowerCase().contains("show")) {
                ChoiceCount = 2;
                MenuFlag = true;
            } else if (userChoice.toLowerCase().contains("2")) {
                ChoiceCount = 2;
                MenuFlag = true;
            } else if (userChoice.toLowerCase().contains("all")) {
                ChoiceCount = 3;
                MenuFlag = true;
            } else if (userChoice.toLowerCase().contains("3")) {
                ChoiceCount = 3;
                MenuFlag = true;
            } else if (userChoice.toLowerCase().contains("search")) {
                ChoiceCount = 4;
                MenuFlag = true;
            } else if (userChoice.contains("4")) {
                ChoiceCount = 4;
                MenuFlag = true;
            } else if (userChoice.toLowerCase().contains("sort")) {
                ChoiceCount = 5;
                MenuFlag = true;
            } else if (userChoice.contains("5")) {
                ChoiceCount = 5;
                MenuFlag = true;
            } else if (userChoice.toLowerCase().contains("exit")) {
                ChoiceCount = 6;
                MenuFlag = true;
            } else if (userChoice.contains("6")) {
                ChoiceCount = 6;
                MenuFlag = true;
            }
        }
        return ChoiceCount;
    }
    public static Collection_Class ArrayObj = new Collection_Class();


    public static boolean executeMenuChoice(int menuItem, boolean exitFlag) {
        switch (menuItem) {
            case 1 -> ArrayObj.add(ArrayObj.CreateObject());
            case 2 -> ArrayObj.printOne(Collection_Class.GetUserInt("Please, input which element of the array you wish to see (Starts with 0)"));
            case 3 -> ArrayObj.print();
            case 4 -> ArrayObj.ChooseSearch();
            case 5 -> ArrayObj.sort();
            case 6 -> exitFlag = true;
        }
        return exitFlag;
    }
}
