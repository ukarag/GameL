

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        Next next = new Next(game);


        for(int i=1;i<8;i++){
            game.newRound();
            game.printstuff();



            while (game.running){


                if (next.click){
                    game.running = false;

                    next.click = false;

                }
            }


        }
    }
}
