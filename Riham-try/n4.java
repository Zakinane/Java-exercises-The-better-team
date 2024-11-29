import java.util.Scanner;

public class n4 {
    public static void main(String[] args) {
        String[] t = new String[100];
        int sz = 0;
        Scanner s = new Scanner(System.in);
        int ch;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Find Max");
            System.out.println("2. Find Min");
            System.out.println("3. Sort A-Z");
            System.out.println("4. Sort Z-A");
            System.out.println("5. Add Element");
            System.out.println("6. Delete Element");
            System.out.println("7. Show Table");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            ch = s.nextInt();
            s.nextLine();

            switch (ch) {
                case 1:
                    if (sz == 0) {
                        System.out.println("Table is empty.");
                    } else {
                        String max = t[0];
                        for (int i = 1; i < sz; i++) {
                            if (t[i].compareTo(max) > 0) {
                                max = t[i];
                            }
                        }
                        System.out.println("Max: " + max);
                    }
                    break;
                case 2:
                    if (sz == 0) {
                        System.out.println("Table is empty.");
                    } else {
                        String min = t[0];
                        for (int i = 1; i < sz; i++) {
                            if (t[i].compareTo(min) < 0) {
                                min = t[i];
                            }
                        }
                        System.out.println("Min: " + min);
                    }
                    break;
                case 3:
                    for (int i = 0; i < sz - 1; i++) {
                        for (int j = i + 1; j < sz; j++) {
                            if (t[i].compareTo(t[j]) > 0) {
                                String tmp = t[i];
                                t[i] = t[j];
                                t[j] = tmp;
                            }
                        }
                    }
                    System.out.println("Sorted A-Z.");
                    break;
                case 4:
                    for (int i = 0; i < sz - 1; i++) {
                        for (int j = i + 1; j < sz; j++) {
                            if (t[i].compareTo(t[j]) < 0) {
                                String tmp = t[i];
                                t[i] = t[j];
                                t[j] = tmp;
                            }
                        }
                    }
                    System.out.println("Sorted Z-A.");
                    break;
                case 5:
                    if (sz >= t.length) {
                        System.out.println("Table is full.");
                    } else {
                        System.out.print("Enter element to add: ");
                        t[sz++] = s.nextLine();
                        System.out.println("Added.");
                    }
                    break;
                case 6:
                    if (sz == 0) {
                        System.out.println("Table is empty.");
                    } else {
                        System.out.print("Enter element to delete: ");
                        String del = s.nextLine();
                        boolean f = false;
                        for (int i = 0; i < sz; i++) {
                            if (t[i].equals(del)) {
                                for (int j = i; j < sz - 1; j++) {
                                    t[j] = t[j + 1];
                                }
                                sz--;
                                f = true;
                                System.out.println("Deleted.");
                                break;
                            }
                        }
                        if (!f) {
                            System.out.println("Element not found.");
                        }
                    }
                    break;
                case 7:
                    if (sz == 0) {
                        System.out.println("Table is empty.");
                    } else {
                        System.out.print("Table: ");
                        for (int i = 0; i < sz; i++) {
                            System.out.print(t[i] + (i < sz - 1 ? ", " : ""));
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.out.println("Goodbye.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (ch != 0);

        s.close();
    }
}
