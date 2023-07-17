package team.ext.extcore.api.unification.materials;

import gregtech.api.GTValues;
import gregtech.api.unification.material.Material;
import team.ext.extcore.api.unification.ExTMaterials;

import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.info.MaterialIconSet.*;
import static gregtech.api.util.GTUtility.gregtechId;

public class ExTFirstDegreeMaterials {

    public ExTFirstDegreeMaterials() {}

    public static void init() {
        ExTMaterials.RedstoneManasteelAlloy = new Material.Builder(29000, gregtechId("redstone_manasteel_alloy"))
                .dust().fluid().ingot()
                .cableProperties(GTValues.V[0], 1, 0)
                .fluidTemp(2009)
                .color(16401990).iconSet(SHINY)
                .flags(STD_METAL, GENERATE_FINE_WIRE, GENERATE_BOLT_SCREW, DISABLE_DECOMPOSITION)
                .components(Redstone)
                .build();
    }

}
