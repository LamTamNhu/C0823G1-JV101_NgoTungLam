package ss8.prac.refactoring;

public class TennisGame {
    private static final int LOVE = 0;
    private static final int FIFTEEN = 1;
    private static final int THIRTY = 2;
    private static final int FORTY = 3;

    private static String getEqualsScore(int playerScore) {
        switch (playerScore) {
            case LOVE:
                return "Love-All";
            case FIFTEEN:
                return "Fifteen-All";
            case THIRTY:
                return "Thirty-All";
            case FORTY:
                return "Forty-All";
            default:
                return "Deuce";
        }
    }

    private static String getFinalScore(int player1Score, int player2Score) {
        int scoreDifferent = player1Score - player2Score;
        if (scoreDifferent == 1) {
            return "Advantage player1";
        } else if (scoreDifferent == -1) {
            return "Advantage player2";
        } else if (scoreDifferent >= 2) {
            return "Win for player1";
        } else {
            return "Win for player2";
        }
    }

    private static String getNonEqualsScore(int player1Score, int player2Score) {
        String result = "";
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = player1Score;
            else {
                result += "-";
                tempScore = player2Score;
            }
            switch (tempScore) {
                case LOVE:
                    result += "Love";
                    break;
                case FIFTEEN:
                    result += "Fifteen";
                    break;
                case THIRTY:
                    result += "Thirty";
                    break;
                case FORTY:
                    result += "Forty";
                    break;
            }
        }
        return result;
    }

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        boolean isScoreEquals = player1Score == player2Score;
        boolean isScoreFinal = player1Score >= 4 || player2Score >= 4;

        if (isScoreEquals) {
            return getEqualsScore(player1Score);
        } else if (isScoreFinal) {
            return getFinalScore(player1Score, player2Score);
        } else {
            return getNonEqualsScore(player1Score, player2Score);
        }
    }
}