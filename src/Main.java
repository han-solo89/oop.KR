public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            label:
            while (true) {
                printMenu();
                System.out.print("Выберите пункт меню: ");
                if (scanner.hasNextInt()) {
                    int menu = scanner.nextInt();
                    switch (menu) {
                        case 1:
                            MyCalendar.addTask(scanner);
                            break;
                        case 2:
                            MyCalendar.editTask(scanner);
                            break;
                        case 3:
                            MyCalendar.deleteTask(scanner);
                        case 4:
                            MyCalendar.getTaskByDay(scanner);
                            break;
                        case 5:
                            MyCalendar.printActualTasks(scanner);
                            break ;
                        case 6:
                            MyCalendar.getGroupedByDate();
                            break;
                        case 0:
                            break label;
                    }
                } else {
                    scanner.next();
                    System.out.println("Выберите пункт меню из списка!");
                }
            }
        }
    }


    private static void printMenu() {
        System.out.println("""
                        1. Добавить задачу
                        2. Редактировать задачу
                        3. Удалить задачу
                        4. Получить задачу на указанный день
                        5. Получить архивные задачи
                        6. Получить сгруппированые по датам задачи
                        0. Выход """
        );

    }
}