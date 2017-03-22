/**
 * 
 */
package org.pjay.arrays;

import java.util.Arrays;

/**
 * @author vijayk
 *
 */
// http://stackoverflow.com/questions/22588518/lambda-expression-and-generic-method
public class App1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Player vijay = new Player(1, "vijay", 26, 13456, 500000, 5);
		Player peter = new Player(2, "peter", 35, 8000, 400999, 7);
		Player tim = new Player(3, "tim", 29, 9800, 500999, 3);
		Player john = new Player(4, "john", 33, 11500, 400111, 2);
		Player andy = new Player(5, "andy", 36, 10600, 466000, 8);
		Player[] players = {peter, tim, vijay, john, andy};
		
		//System.out.println("players data :: " + Arrays.asList(players).toString());

		Arrays.sort(players, (Player player1, Player player2) -> (player2.getCoins() - player1.getCoins()));
		System.out.println("Highest Coins :: " + players[0].toString());
		
		Arrays.sort(players, (Player player1, Player player2) -> (player2.getScore() - player1.getScore()));
		System.out.println("Highest Score :: " + players[0].toString());
		
		Arrays.sort(players, (Player player1, Player player2) -> (player2.getDistance() - player1.getDistance()));
		System.out.println("Highest Distance :: " + players[0].toString());
		
	}

}

class Player {

	private int playerID;
	private String name;
	private int age;
	private int coins;
	private int score;
	private int distance;

	public Player() {
	}

	public Player(int playerID, String name, int age, int coins, int score, int distance) {
		this.playerID = playerID;
		this.name = name;
		this.age = age;
		this.coins = coins;
		this.score = score;
		this.distance = distance;
	}

	public int getPlayerID() {
		return playerID;
	}

	public void setPlayerID(int playerID) {
		this.playerID = playerID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCoins() {
		return coins;
	}

	public void setCoins(int coins) {
		this.coins = coins;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + coins;
		result = prime * result + distance;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + playerID;
		result = prime * result + score;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (age != other.age)
			return false;
		if (coins != other.coins)
			return false;
		if (distance != other.distance)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (playerID != other.playerID)
			return false;
		if (score != other.score)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Player [playerID=" + playerID + ", name=" + name + ", age=" + age + ", coins=" + coins + ", score="
				+ score + ", distance=" + distance + "]";
	}

}
