package z.texas.commons;

import java.util.ArrayList;

public class TexasBean {
	private PlayerBean player;
	private ArrayList<PlayerBean> others;
	private ArrayList<CardBean> flops;
	private CardBean turn;
	private CardBean river;
	private int maxBet;
	private int bigBlind;
	private int bankPos;
	private int maxPlayerNum;
	private String tableState;
	private ArrayList<Integer> pools; // 底池，边池
	private int winnerType;

	public TexasBean(){
		others = new ArrayList<PlayerBean>();
		flops = new ArrayList<CardBean>();
		pools = new ArrayList<Integer>();
	}
	
	public ArrayList<CardBean> getFlops() {
		return flops;
	}

	public void setFlops(ArrayList<CardBean> flops) {
		this.flops = flops;
	}

	public CardBean getTurn() {
		return turn;
	}

	public void setTurn(CardBean turn) {
		this.turn = turn;
	}

	public CardBean getRiver() {
		return river;
	}

	public void setRiver(CardBean river) {
		this.river = river;
	}

	public ArrayList<PlayerBean> getOthers() {
		return others;
	}

	public void setOthers(ArrayList<PlayerBean> others) {
		this.others = others;
	}

	public PlayerBean getPlayer() {
		return player;
	}

	public void setPlayer(PlayerBean player) {
		this.player = player;
	}

	public int getMaxBet() {
		return maxBet;
	}

	public void setMaxBet(int maxBet) {
		this.maxBet = maxBet;
	}

	public int getBigBlind() {
		return bigBlind;
	}

	public void setBigBlind(int bigBlind) {
		this.bigBlind = bigBlind;
	}

	public int getBankPos() {
		return bankPos;
	}

	public void setBankPos(int bankPos) {
		this.bankPos = bankPos;
	}

	public int getMaxPlayerNum() {
		return maxPlayerNum;
	}

	public void setMaxPlayerNum(int maxPlayerNum) {
		this.maxPlayerNum = maxPlayerNum;
	}

	public String getTableState() {
		return tableState;
	}

	public void setTableState(String tableState) {
		this.tableState = tableState;
	}

	public ArrayList<Integer> getPools() {
		return pools;
	}

	public void setPools(ArrayList<Integer> pools) {
		this.pools = pools;
	}

	public int getWinnerType() {
		return winnerType;
	}

	public void setWinnerType(int winnerType) {
		this.winnerType = winnerType;
	}

}
