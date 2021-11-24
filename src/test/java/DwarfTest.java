import Player.*;
import behaviours.IWeapon;
import com.sun.xml.internal.fastinfoset.stax.events.StAXEventAllocatorBase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Orc orc;
    Dwarf dwarf;
    IWeapon axe;
    IWeapon axe1;


    @Before
    public void before() {
        axe1 = new Axe("Enemy axe");
        orc = new Orc("Jeremy", axe1);
        axe = new Axe("Big betty");
        dwarf = new Dwarf("Big John", axe);
        }

    @Test
    public void hasWeaponDamage(){
        assertEquals(9, dwarf.attack());
    }

    @Test
    public void canTakeDamage() {
        dwarf.takeDamage(orc);
        assertEquals(91, dwarf.getHealth());
    }

}

