package me.modmuss50.optifabric.mixin;

import net.minecraft.client.network.AbstractClientPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Pseudo
@Mixin(targets = "net/optifine/player/CapeUtils", remap = false)
public class CapeUtilsAccessor {

    @Inject(method = "downloadCape", at = @At("HEAD"), cancellable = true, remap = true)
    private static void noDownload(AbstractClientPlayerEntity clientPlayer, CallbackInfo ci){
        ci.cancel();
    }
}
