public class App {
    public static void main(String[] args) {
       
        // int money = 1000;
        // int pricephone = 850;
        // boolean hasPhone = false;

        // if (money >= pricephone && !hasPhone) {
        //     System.out.println("Oui tu peux acheter ce tel !");
        // } else {
        //     System.out.println("Tu n'as pas assez d'argent pour t'en procurer et en plus tu as déjà un !");
        // }

        // String pseudo = "Jonathan";
        // String[] names = { "Mathieu", "maThieU", "Elodie" };
        // System.out.println(names[2]);

        // if (names[0].equalsIgnoreCase(names[1])) {
        //     System.out.println("Même chose");
        // } else {
        //     System.out.println("Pas les mêmes");
        // }

        // int[][] numbers = {
        //     {5, 7, 8},
        //     {3, 2, 1},
        //     {9, 4, 2},
        // };

        // System.out.println(numbers[0][2]);

    //     String pseudos = "Jonathan, Maminirina, Rado, Lucas";
    //     String[] psseudos = pseudos.split(",");
    //     System.out.println(psseudos.length);
    //     // System.out.println(psseudos[0]);

    //     for(String str : psseudos) {
    //         // System.out.println(str);
    //     }

    //     int[] notes = {7, 12, 8, 2};
    //     int calcul = 0;
    //     for(int note : notes) {
    //         calcul += note;
    //     }

    //     System.out.println("La moyenne est : " + calcul/notes.length);

    //     int i = 0;

    //     while(i != 7) {
    //         i++;
    //         System.out.println("Fromage " + i);
    //     }

    //     sendMessage("La différence est de : " + getResultat(money, pricephone, hasPhone), 9);

        Player player1 = new Player("Jonathan", 20.0, 50.5);
        System.out.println("vie : " + player1.getName());
        player1.setAttack(10);
        System.out.println("vie : " + player1.getHealth());

        Player player2 = new Player("Elodie", 14.0, 30.3);
        player2.setName("Andrianina");
        player2.damage(player1.getAttack());
        System.out.println("Player 2 : " + player2.getName());

    }

    // private static void sendMessage(String msg, int number) {
    //   System.out.println("Ceci s'affiche dans le console : vous avez " + number + " " + msg);
    // }

    // private static int getResultat(int money, int pricePhone, boolean hasPhone) {
    //     if (money >= pricePhone && !hasPhone) {
    //         System.out.println("Oui tu peux acheter ce tel !");
    //     } else {
    //         System.out.println("Tu n'as pas assez d'argent pour t'en procurer et en plus tu as déjà un !");
    //     }

    //     return money - pricePhone;
    // }

}
