from timeit import repeat

while True:
    p1choice = input("Enter what player1 has choosen")
    p2choice = input("Enter what p2ayer1 has choosen")

    if p1choice == p2choice:
        print("tie")
    elif p1choice == 'paper':
        if p2choice == 'rock':
            print("paper beats rock i.e., player1 wins")
        else:
            print("scissor wins ")
    elif p1choice == 'rock':
        if p2choice == 'scissor':
            print('rock beats scissor i.e, olayer1 wins')
        else:
            print("paper wins")
    elif p1choice == 'scissor':
        if p2choice == 'paper':
            print('scissor beats rock i.e., player1 wins')
        else:
            print('rock wins')
    else:
        print('invalid input')

    playagain = input('do u want to play again? yes/no ')
    if(playagain == 'yes'):
        pass
    elif(playagain == 'no'):
        raise SystemExit
    else:
        print('invalid option')
        raise SystemExit

