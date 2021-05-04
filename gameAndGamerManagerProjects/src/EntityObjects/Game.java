package EntityObjects;

import AbstractObjects.Entity;

public class Game implements Entity {

	private int _gameId;
	private String _gameName;
	private String _gameDetails;
	private String _allReviews;
	private String _releaseDate;
	private double _price;
	
	public Game() {}
	
	public Game(int gameId, String gameName, String gameDetails, String allReviews, String releaseDate, double _price) {

		this._gameId = gameId;
		this._gameName = gameName;
		this._gameDetails = gameDetails;
		this._allReviews = allReviews;
		this._releaseDate = releaseDate;
		this._price = _price;
	}

	public int getGameId() {
		return _gameId;
	}

	public void setGameId(int gameId) {
		_gameId = gameId;
	}

	public String getGameName() {
		return _gameName;
	}

	public void setGameName(String gameName) {
		_gameName = gameName;
	}

	public String getGameDetails() {
		return _gameDetails;
	}

	public void setGameDetails(String gameDetails) {
		_gameDetails = gameDetails;
	}

	public String getAllReviews() {
		return _allReviews;
	}

	public void setAllReviews(String allReviews) {
		_allReviews = allReviews;
	}

	public String getReleaseDate() {
		return _releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		_releaseDate = releaseDate;
	}

	public double getPrice() {
		return _price;
	}

	public void setPrice(double price) {
		_price = price;
	}
	
}
