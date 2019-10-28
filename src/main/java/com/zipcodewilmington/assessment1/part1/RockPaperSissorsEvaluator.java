package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {

        if (handSign.equalsIgnoreCase(ROCK)) {
            return PAPER;
        }
        if (handSign.equalsIgnoreCase(PAPER)) {
            return SCISSOR;
        }
        if (handSign.equalsIgnoreCase(SCISSOR)) {
            return ROCK;
        }
        else{
            return null;
        }

    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {


        if (handSign.equalsIgnoreCase(PAPER)) {
            return ROCK;
        }
        if (handSign.equalsIgnoreCase(SCISSOR)) {
            return PAPER;
        }
        if (handSign.equalsIgnoreCase(ROCK)) {
            return SCISSOR;
        } else {

            return null;
        }
    }
        /**
         * @param handSignOfPlayer1 a string representative of a hand sign of a player
         * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
         * @return a string representative of the winning hand sign between the two players
         */
        public String getWinner (String handSignOfPlayer1, String handSignOfPlayer2){
            return null;
        }

    }