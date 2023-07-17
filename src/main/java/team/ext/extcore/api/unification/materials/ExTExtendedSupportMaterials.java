package team.ext.extcore.api.unification.materials;

import gregtech.api.fluids.fluidType.FluidTypes;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.material.info.MaterialIconSet;
import gregtech.api.unification.material.properties.ToolProperty;

import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.util.GTUtility.gregtechId;
import static team.ext.extcore.api.unification.ExTMaterials.*;

public class ExTExtendedSupportMaterials {

    public ExTExtendedSupportMaterials() {}

    public static void init() {
        Manasteel = new Material.Builder(31500, gregtechId("manasteel"))
                .components(Iron, 1, Mana, 1)
                .fluid().ingot().dust()
                .fluidTemp(1900)
                .color(4605660).iconSet(MaterialIconSet.METALLIC)
                .toolStats(ToolProperty.Builder.of(3, 4, 1000, 4).build())
                .flags(Materials.EXT2_METAL, GENERATE_GEAR, GENERATE_SMALL_GEAR, GENERATE_RING, GENERATE_FRAME, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_FINE_WIRE, GENERATE_DOUBLE_PLATE)
                .build();

        Mana = new Material.Builder(31501, gregtechId("mana"))
                .fluid(FluidTypes.GAS, false).fluidTemp(160)
                .build();
    }

}
