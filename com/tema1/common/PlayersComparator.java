package com.tema1.common;

import com.tema1.players.Player;

import java.util.Comparator;

public class PlayersComparator implements Comparator<Player> {
    // for sorting the players at the end
    public final int compare(final Player a, final Player b) {
        return b.getProfit() - a.getProfit();
    }
}
