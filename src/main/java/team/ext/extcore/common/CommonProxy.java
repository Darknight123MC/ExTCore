package team.ext.extcore.common;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import team.ext.extcore.api.utils.ExTLog;

import java.util.Objects;
import java.util.function.Function;

@Mod.EventBusSubscriber(
        modid = "extcore"
)
public class CommonProxy {

    public CommonProxy() {
    }

    public void preLoad() {
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        ExTLog.logger.info("ExTCore Registering blocks...");
        IForgeRegistry<Block> reg = event.getRegistry();
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        ExTLog.logger.info("ExTCore Registering items...");
        IForgeRegistry<Item> reg = event.getRegistry();
    }

    private static <T extends Block> ItemBlock createItemBlock(T block, Function<T, ItemBlock> producer) {
        ItemBlock itemBlock = producer.apply(block);
        itemBlock.setRegistryName(Objects.requireNonNull(block.getRegistryName()));
        return itemBlock;
    }

    @SubscribeEvent
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        ExTLog.logger.info("ExTCore Registering recipes...");
    }

}
