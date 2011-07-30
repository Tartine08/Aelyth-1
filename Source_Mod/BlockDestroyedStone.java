package net.minecraft.src;

import java.util.Random;

public class BlockDestroyedStone extends Block
{
	
    public BlockDestroyedStone(int i, int j)
    {
        super(i, j, Material.rock);
    }
    
    
    public int idDropped(int i, Random random)
    {
        return mod_Aelyth.DestroyedStone.blockID;
    }
}
