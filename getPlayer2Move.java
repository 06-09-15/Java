public int getPlayer2Move (int round)
{ 
    int result;

    if (round % 3 == 0) 
    {
    result = 3; //Player 2 spends 3 coins if the round is divisible by 3.
    } 
    else if (round % 2 == 0) 
    {
    result = 2; //Player 2 spends 2 coins if the round is divisible by 2 but not by 3.
    } 
    else 
    {
    result = 1; //Player 2 spends 1 coin if the round is neither divisible by 2 nor by 3.
    }

    return result;
}        
