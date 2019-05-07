package jpu2016.dogfight.view;

import java.util.ArrayList;
import java.util.List;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.controller.UserOrder;
import jpu2016.gameframe.IEventPerformer;

public abstract class EventPerformer implements IEventPerformer, IOrderPerformer {
	private List<IOrderPerformer> _orderPerformer = new ArrayList<IOrderPerformer>();
	public EventPerformer() {
		IOrderPerformer orderPerformer;
	}

	@Override
	public void orderPerform(UserOrder userOrder) {
		// TODO Auto-generated method stub

	}
	private UserOrder keyCodeToUserOrder(int keyCode) {
		return null;
		
	}

}
