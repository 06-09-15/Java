public void playGame() {
    int player1Coins = startingCoins;
    int player2Coins = startingCoins;

    for (int round = 1; round <= maxRounds; round++) {
        int player1Move = getPlayer1Move();
        int player2Move = getPlayer2Move(round);

        player1Coins -= player1Move;
        player2Coins -= player2Move;

            if (player1Move == player2Move) 
            {
            player2Coins++;             
            } 
            else if (Math.abs(player1Move - player2Move) == 1) 
            {
            player2Coins++;  
            } 
            else if (Math.abs(player1Move - player2Move) == 2) 
            {
            player1Coins += 2;  
            }

            if (player1Coins < 3 || player2Coins < 3 || round == maxRounds) {

            if (player1Coins == player2Coins) 
            {
                System.out.println("tie game");
            } 
            else if (player1Coins > player2Coins) 
            {
                System.out.println("player 1 wins");
            } 
            else 
            {
                System.out.println("player 2 wins");
            }
            break;
        }
    }
}
