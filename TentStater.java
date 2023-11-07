class TentStater
{
public static void main(String[] args)
{


TentGroup tentgroup;
tentgroup=new TentGroup();
tentgroup.showdetails();
Agent agent=new Agent();
agent.opentent(tentgroup);
agent.closetent(tentgroup);
agent.showinfo();

System.out.println("=============");
		
		Game game;
		game=new Game();
		game.play();
		game.pause();
		game.end();
		game.showinfo();
		
		Player player;
		player=new Player();
		player.playGame(game);
		player.pauseGame(game);
		player.endGame(game);
		player.showInfo();
		
		
	}
}

