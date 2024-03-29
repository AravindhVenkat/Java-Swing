import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int generatedNumber = (int) (Math.random()*100 + 1);
        int userGuessedNumber = 0;    
        int count = 0;
        int score = 100;

        while (userGuessedNumber != generatedNumber)
        {
            String response = JOptionPane.showInputDialog(null,
                    "Enter a guess between 1 and 100", "Guessing Game", JOptionPane.QUESTION_MESSAGE);
            userGuessedNumber = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, ""+ determineGuess(userGuessedNumber, generatedNumber, count, score));
            count++;
        }
    }

    public static String determineGuess(int userGuessedNumber, int generatedNumber, int count, int score){
        if (userGuessedNumber <=0 || userGuessedNumber >100) {
            return "Your guess is invalid";
        }
        else if (userGuessedNumber == generatedNumber){
            return "Correct!\nTotal Guesses : " + (count+1) + System.lineSeparator() +"Score : " + (score - (count * 10));
        }
        else if (userGuessedNumber > generatedNumber) {
            return "Your guess is Greater, try a Lesser Number.\nTry Number: " + (userGuessedNumber - 1);
        }
        else {
            return "Your guess is Lesser, try a Greater Number.\nTry Number: " + (userGuessedNumber + 1);
        }
    }
}
