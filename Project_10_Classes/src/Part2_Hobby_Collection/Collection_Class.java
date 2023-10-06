package Part2_Hobby_Collection;
import java.util.Scanner;

public class Collection_Class {
    public Collection_Class() {
        PropertyCount = 0;
        ObjectArray = new Miniature_Class[100];

    }

    private static int PropertyCount;
    private static Miniature_Class[] ObjectArray;
    public void add(Miniature_Class newObj) {
        ObjectArray[PropertyCount] = newObj;
        PropertyCount = PropertyCount + 1;
    }


    public void printOne(int i) {
        Miniature_Class ChosenMini = ObjectArray[i];
        ChosenMini.PrintDescription();
    }

    public void print() {
        int i = 0;
        while (i < PropertyCount) {
            Miniature_Class ChosenMini = ObjectArray[i];
            ChosenMini.PrintDescription();
            i++;
        }
    }

    public void ChooseSearch() {
        boolean MenuFlag = false;
        int SearchCount = 0;
        while (!MenuFlag) {
            String userChoice = GetUserString("""
                    Choose which search method you prefer:\s
                    1. By name:\s
                    2. By color: \s
                    3. By amount: \s
                    """);
            if (userChoice.toLowerCase().contains("name")) {
                SearchCount = 1;
                MenuFlag = true;
            } else if (userChoice.contains("1")) {
                SearchCount = 1;
                MenuFlag = true;
            } else if (userChoice.toLowerCase().contains("color")) {
                SearchCount = 2;
                MenuFlag = true;
            } else if (userChoice.toLowerCase().contains("2")) {
                SearchCount = 2;
                MenuFlag = true;
            } else if (userChoice.toLowerCase().contains("amount")) {
                SearchCount = 3;
                MenuFlag = true;
            } else if (userChoice.toLowerCase().contains("3")) {
                SearchCount = 3;
                MenuFlag = true;
            }
        }
        find(SearchCount);
    }


    public void find(int SearchCount) {
        Scanner userScan = new Scanner(System.in);
        if (SearchCount == 0) {
            System.exit(0);
        } else if (SearchCount == 1) {
            String s = GetUserString("Please write the name of the object you're looking for");
            findByName(s);
        } else if (SearchCount == 2) {
            String r = GetUserString("Please write the color of the object you're looking for");
            findByColor(r);
        } else if (SearchCount == 3) {
            GetUserInt("Please write the amount of the miniatures in the object you're looking for");
            int t = userScan.nextInt();
            findByAmount(t);
        }
    }

    public void findByName(String s) {
        Scanner userScanner = new Scanner(System.in);
        String UserInput = "";
        while (UserInput.isEmpty()) {
            UserInput = userScanner.nextLine();
        }

        for (int i = 0; i < PropertyCount; i++) {
            if (ObjectArray[i].getName().toLowerCase().contains(UserInput.toLowerCase())) {
                System.out.println(i + 1 + ". " + ObjectArray[i].getAmount() + " " + ObjectArray[i].getColor() + " " + ObjectArray[i].getName() + "s");

            }
        }
    }

    public void findByColor(String r) {
        Scanner userScanner = new Scanner(System.in);
        String UserInput = "";
        while (UserInput.isEmpty()) {
            UserInput = userScanner.nextLine();
        }

        for (int i = 0; i < PropertyCount; i++) {
            if (ObjectArray[i].getColor().toLowerCase().contains(UserInput.toLowerCase())) {
                System.out.println(i + 1 + ". " + ObjectArray[i].getAmount() + " " + ObjectArray[i].getColor() + " " + ObjectArray[i].getName() + "s");

            }
        }
    }

    public void findByAmount(int t) {
        Scanner userScanner = new Scanner(System.in);
        int UserInput = 0;
        while (UserInput == 0) {
            UserInput = userScanner.nextInt();
        }

        for (int i = 0; i < PropertyCount; i++) {
            if (ObjectArray[i].getAmount() == (UserInput)) {
                System.out.println(i + 1 + ". " + ObjectArray[i].getAmount() + " " + ObjectArray[i].getColor() + " " + ObjectArray[i].getName() + "s");
            }
        }
    }

    public static String GetUserString(String systemMessage) {
        Scanner userScanner = new Scanner(System.in);
        System.out.println(systemMessage);
        return userScanner.nextLine();
    }

    public void sort() {
        for (int i = 0; i < PropertyCount; i++) {
            for (int j = 1; j < PropertyCount; j++) {
                if (ObjectArray[j].getAmount() < ObjectArray[j - 1].getAmount()) {
                    BubbleSwap(ObjectArray, j, j - 1);
                }
            }
        }
    }

    public static void BubbleSwap(Miniature_Class[] array, int a, int b) {
        Miniature_Class temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static int GetUserInt(String systemMessage) {
        Scanner userScanner = new Scanner(System.in);
        System.out.println(systemMessage);
        return userScanner.nextInt();
    }

    public Miniature_Class CreateObject() {

        return new Miniature_Class(
                Collection_Class.GetUserString("Please, enter the name of the miniatures"),
                Collection_Class.GetUserString("Please, enter the color of the miniatures"),
                Collection_Class.GetUserInt("Please, enter the amount of the miniatures"));
    }
}
