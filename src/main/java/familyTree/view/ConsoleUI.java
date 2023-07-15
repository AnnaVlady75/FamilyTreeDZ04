package familyTree.view;

import familyTree.model.human.Gender;
//import familyTree.presenter.Presenter;

import java.time.LocalDate;
import java.util.Scanner;

//public class ConsoleUI implements View{
//    private Presenter presenter;
//    private Scanner scanner;
//
//    public ConsoleUI() {
//        presenter = new Presenter(this);
//        scanner = new Scanner(System.in);
//    }
//
//    @Override
//    public void start() {
//        System.out.println("Добрый день!");
//        while (true){
//            System.out.println("выберите действие  \n"+
//                    "1. Вывести сем дерево "+
//                    "2. Отсортировать по имени \n"+
//                    "3. Отсортировать по возрасту\n"+
//                    "4. Завершить работу");
//            String choice = scanner.nextLine();
//            switch (choice){
//                case "1.":
//                    addHuman();
//                    break;
//                case "2.":
//                    break;
//                case "3.":
//                    break;
//                case "4.":
//                    break;
//            }
//        }
//
//    }
//
//    private void addHuman() {
//        System.out.println("Введите имя");
//        String name = scanner.nextLine();
//        presenter.addHuman(name);
//    }
//
//    @Override
//    public void printAnswer(String text) {
//        System.out.println(text);
//
//    }
//}
