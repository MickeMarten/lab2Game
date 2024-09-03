package maze;
import creature.Monster;
import creature.Player;

public interface Placement {

    void placePlayer(Player player);

    void placeMonster(Monster monster);

}
