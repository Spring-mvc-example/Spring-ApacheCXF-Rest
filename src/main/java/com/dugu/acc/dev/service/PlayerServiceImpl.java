package com.dugu.acc.dev.service;

import org.springframework.stereotype.Service;

import binding.dev.acc.dugu.Player;
import binding.dev.acc.dugu.PlayerList;

import com.dugu.acc.dev.util.PlayerUtils;

@Service("playerService")
public class PlayerServiceImpl implements PlayerService {

	@Override
	public String createOrSaveNewPLayerInfo(Player playerType) {
		String status = "";
		if (playerType != null) {
			PlayerUtils.players.add(playerType);
			status = "Success saved";
		} else {
			status = "Service gateway failed ";

		}
		return status;
	}

	@Override
	public Player getPlayerInfo(int playerId) {
		return PlayerUtils.players.stream()
				.filter(player -> player.getPlayerId() == playerId).findFirst()
				.get();
	}

	@Override
	public String deletePlayerInfo(int id) {
		String message = "";
		if (PlayerUtils.players.stream().anyMatch(p -> p.getPlayerId() == id)) {
			PlayerUtils.players.removeIf(p -> p.getPlayerId() == id);
			message = "Deletd Success";
		} else {
			message = id + " Not found";
		}
		return message;
	}

	@Override
	public PlayerList getAllPlayerInfo() {
		PlayerList playerList = new PlayerList();
		PlayerUtils.players.forEach(p -> playerList.getPlayer().add(p));
		return playerList;
	}

}
