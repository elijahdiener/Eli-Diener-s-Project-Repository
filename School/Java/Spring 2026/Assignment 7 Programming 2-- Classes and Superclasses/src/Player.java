import static java.lang.System.*;

public class Player
{
    private String name;
    private Weapon[] arsenal;
    private Weapon currentWeapon;
    private int currentWeaponIndex;

    public Player(String name)
    {
        this.name = name;
        arsenal = new Weapon[4];
        arsenal[0] = new Knife();
        arsenal[1] = new Sword();
        arsenal[2] = new Pistol();
        arsenal[3] = new Rifle();
        currentWeapon = arsenal[0];
        currentWeaponIndex = 0;
    }

    public Player()
    {
        this("Hello");
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Weapon getCurrentWeapon()
    {
        return arsenal[currentWeaponIndex];
    }

    public int getCurrentWeaponIndex()
    {
        return currentWeaponIndex;
    }

    @Override
    public String toString()
    {
        return String.format("PLAYER: %s\nCURRENT WEAPON: %s\nINVENTORY: %s | %s | %s | %s\n", name, arsenal[currentWeaponIndex], arsenal[0], arsenal[1], arsenal[2], arsenal[3]);
    }

    public void cycleForward()
    {
        currentWeaponIndex = (currentWeaponIndex + 1) % 4;
    }

    public void cycleBackward()
    {
        currentWeaponIndex = (currentWeaponIndex + 3) % 4;
    }
}
