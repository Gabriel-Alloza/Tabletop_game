package Game;

import java.util.ArrayList;
import java.util.Random;

public class Board {
    /**
     * Cette classe permet de créer le plateau et d'ajouter le contenu des cases de manière aléatoire..
     */
    String difficulty;
    private ArrayList<Object> squares;

    public Board(String difficulty) {
        this.difficulty = difficulty;
        squares = new ArrayList<>();
        generateBoard(difficulty);
    }

    private void generateBoard(String difficulty) {

        int enemyBornInf = 42;
        int enemyBornSupp = 42;

        int bonusBornInf = 42;
        int bonusBornSupp = 42;

        if(difficulty .equals("UL")){
            enemyBornInf = 7;
            enemyBornSupp = 7;

            bonusBornInf = 1;
            bonusBornSupp = 6;
        }
        else if(difficulty .equals("SE")){
            enemyBornInf = 6;
            enemyBornSupp = 6;

            bonusBornInf = 1;
            bonusBornSupp = 5;
        }
        else if(difficulty .equals("E")){
            enemyBornInf = 6;
            enemyBornSupp = 6;

            bonusBornInf = 1;
            bonusBornSupp = 3;
        }
        else if(difficulty .equals("S")){
            enemyBornInf = 6;
            enemyBornSupp = 6;

            bonusBornInf = 5;
            bonusBornSupp = 5;
        }
        else if(difficulty .equals("H")){
            enemyBornInf = 4;
            enemyBornSupp = 6;

            bonusBornInf = 3;
            bonusBornSupp = 3;
        }
        else if(difficulty .equals("SH")){
            enemyBornInf = 2;
            enemyBornSupp = 6;

            bonusBornInf = 1;
            bonusBornSupp = 1;
        }
        else if(difficulty .equals("UW")){
            enemyBornInf = 1;
            enemyBornSupp = 6;

            bonusBornInf = 7;
            bonusBornSupp = 7;
        }
        else{
            System.out.println("y'a un problème de difficulté chef");
        }



        for (int i = 0; i < 64; i++) {
            int caseContent = dice(6);
            if (caseContent >= enemyBornInf && caseContent<= enemyBornSupp) {
                int enemyType = dice(5);
                if (enemyType == 1) {
                    squares.add(new Square().getcontent("Wizard"));
                } else if (enemyType == 2) {
                    squares.add(new Square().getcontent("Gobelin"));
                } else if (enemyType == 3){
                    squares.add(new Square().getcontent("Dragon"));
                }
                else if(enemyType == 4){
                    squares.add(new Square().getcontent("Orc"));
                }
                else if(enemyType == 5){
                    squares.add(new Square().getcontent("BadSpirit"));
                }

            } else if (caseContent >= bonusBornInf && caseContent <= bonusBornSupp) {
                int bonusType = dice(15);
                if (bonusType <= 3) {
                    squares.add(new Square().getcontent("Lightning"));
                } else if (bonusType <= 6) {
                    squares.add(new Square().getcontent("Club"));
                } else if (bonusType <= 9) {
                    squares.add(new Square().getcontent("Standard potion"));
                } else if (bonusType == 10) {
                    squares.add(new Square().getcontent("Fireball"));
                } else if (bonusType == 11) {
                    squares.add(new Square().getcontent("Sword"));
                } else if (bonusType == 12){
                    squares.add(new Square().getcontent("Big potion"));
                }
                else if(bonusType == 13){
                    squares.add(new Square().getcontent("Bow"));
                }
                else if(bonusType == 14){
                    squares.add(new Square().getcontent("Invisibility"));
                }
                else{
                    squares.add(new Square().getcontent("Thunder potion"));
                }
            } else {
                squares.add(new Square().getcontent("Nothing"));
            }
        }
    }

    public Object getSquare(int index) {
        if (index < squares.size()) {
            return squares.get(index);
        } else {
            return null;
        }
    }

    public int getSize() {
        return squares.size();
    }

    private int dice(int number) {
        return new Random().nextInt(number) + 1;
    }
}
