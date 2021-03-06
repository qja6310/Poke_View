package com.qiu.model;

import java.util.ArrayList;

public abstract class Player {

	private String name;
	private String win;
	private ArrayList<Poke> playerPoke = new ArrayList<Poke>();//手牌的集合
	private int points = 4;//初始分数
	private ArrayList<Poke> outPoke = new ArrayList<Poke>();//出牌的集合
	private int score = 1000;//每个人初始化有1000分
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Poke> getPlayerPoke() {
		return playerPoke;
	}

	public void setPlayerPoke(ArrayList<Poke> playerPoke) {
		this.playerPoke = playerPoke;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public ArrayList<Poke> getOutPoke() {
		return outPoke;
	}

	public void setOutPoke(ArrayList<Poke> outPoke) {
		this.outPoke = outPoke;
	}
	
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getWin() {
		return win;
	}

	public void setWin(String win) {
		this.win = win;
	}

}
