package aplicattion;

import view.MainView;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Hogwarts System!");
        MainView view = new MainView();
        view.showMenu();
    }
}