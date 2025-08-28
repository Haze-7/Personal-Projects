import random

def play_game() :

  game_options = ["rock", "paper", "scissors"]
  winning_combos = {("rock", "scissors"), 
                    ("scissors", "paper"),
                    ("paper", "rock")
                    } #different opttions / conditions for winning
  player = input("Please enter Rock, Paper, or Scissors: ").lower() #get player input, (val 1-3 (validate))  enforce lower forvalidation
  ai = random.choice(game_options)
  while player != "rock" and player != "paper" and player != "scissors" : #until player is able to put valid input, repeat input check
    print("That value is not acceptable, please enter rock, paper, or scissors: ")
    player = input("Please enter Rock, Paper, or Scissors: ") #get player input, (val 1-3 (validate))
  else :
    #Create game mechanics / decisions here

    # Pseudo code
    # Rock beats scissors
    # paper beats rock
    # scissors beat paper
    if player == ai :
      print("That's a Tie!")
      restart()
    elif  (player, ai) in winning_combos :
      print("Player wins!") #if any of the player wins scenarios happen(no tie), print player win
      restart()
    else :
      print("AI Wins") #any sit where player doesn't win or tie, AI wins
      restart()

#Restart Handling
def restart():
  restart = input("Press R to Play again: ").lower()
  while restart != "r" :
    print("I said R, try again")
    restart = input("Press R to Play again: ").lower()
  else :
    play_game()

#Run the game
play_game()