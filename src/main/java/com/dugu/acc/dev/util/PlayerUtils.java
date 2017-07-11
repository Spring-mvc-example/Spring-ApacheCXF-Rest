package com.dugu.acc.dev.util;

import java.util.ArrayList;
import java.util.List;

import binding.dev.acc.dugu.Player;

public class PlayerUtils {

	public static List<Player> players = null;

	static {
		players = new ArrayList<>();
		players.add(new Player(143, "Koholi", 26, 178));
		players.add(new Player(363, "Sachin", 35, 999));
		players.add(new Player(342, "Wattson", 29, 123));
		players.add(new Player(598, "Gayel", 28, 234));
		players.add(new Player(478, "Smith", 30, 111));
		players.add(new Player(835, "Raina", 31, 199));
	}
}
