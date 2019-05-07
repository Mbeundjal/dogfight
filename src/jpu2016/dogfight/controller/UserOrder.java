package jpu2016.dogfight.controller;

import java.util.ArrayList;
import java.util.List;

public class UserOrder implements IUserOrder {
	private List<Order> _order =  new ArrayList<Order>();
	public UserOrder() {
		int player;
		Order order;
	}

	@Override
	public Order getOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getPlayer() {
		// TODO Auto-generated method stub
		return 0;
	}

}
