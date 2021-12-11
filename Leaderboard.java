////////////////////////////////////////////////////////////////////////////////////

// Garrett Wiese

// Professor Lundin

// CSC 160 Computer Science I

// December 10th, 2021

// ***FINAL PROJECT***

////////////////////////////////////////////////////////////////////////////////////
// Creates class Leaderboard.
public class Leaderboard {
    // Initializes private int of Player One Score
    private int playerOneScore = 0;
    // Initializes private int of Player Two Score
    private int playerTwoScore = 0;

    // Establishes setPlayerOneScore method and sets Player One's score.
    public void setPlayerOneScore(int playerOneScore) {
        this.playerOneScore = playerOneScore;
    }
    // Creates getPlayerOneScore method and returns Player One's score.
    public int getPlayerOneScore() {
        return playerOneScore;
    }
    // Establishes method setPlayerTwoScore and sets Player Two's score.
    public void setPlayerTwoScore(int playerTwoScore) {
        this.playerTwoScore = playerTwoScore;
    }
    // Creates getPlayerTwoScore method and returns Player Two's score.
    public int getPlayerTwoScore() {
        return playerTwoScore;
    }
}