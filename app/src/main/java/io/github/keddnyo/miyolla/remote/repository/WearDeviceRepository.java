package io.github.keddnyo.miyolla.remote.repository;

import java.util.ArrayList;

import io.github.keddnyo.miyolla.R;
import io.github.keddnyo.miyolla.remote.entities.WearDevice;
import io.github.keddnyo.miyolla.remote.implementations.ApplicationImpl;

public class WearDeviceRepository {

    /**
     * Used for initializing wearable device list for retrieving firmwares from Xiaomi server
     */
    public ArrayList<WearDevice> initDeviceList() {
        ArrayList<WearDevice> wearDeviceEntities = new ArrayList<>();

        // Amazfit Band
        wearDeviceEntities.add(new WearDevice("Amazfit Band 5", R.drawable.amazfit_band_5, 73, 256, ApplicationImpl.ZEPP, R.string.tag_empty));
        wearDeviceEntities.add(new WearDevice("Amazfit Band 7", R.drawable.amazfit_band_7, 254, 259, ApplicationImpl.ZEPP, R.string.tag_empty));

        // Mi Band
        wearDeviceEntities.add(new WearDevice("Mi Band 3i", R.drawable.mi_band_3i, 31, 256, ApplicationImpl.ZEPP_LIFE, R.string.tag_empty));
        wearDeviceEntities.add(new WearDevice("Mi Band 4", R.drawable.mi_band_4, 25, 257, ApplicationImpl.ZEPP_LIFE, R.string.tag_empty));
        wearDeviceEntities.add(new WearDevice("Mi Band 4", R.drawable.mi_band_4, 24, 256, ApplicationImpl.ZEPP_LIFE, R.string.tag_nfc));
        wearDeviceEntities.add(new WearDevice("Mi Band 5", R.drawable.mi_band_5_nfc, 59, 257, ApplicationImpl.ZEPP_LIFE, R.string.tag_empty));
        wearDeviceEntities.add(new WearDevice("Mi Band 5", R.drawable.mi_band_5_nfc, 58, 256, ApplicationImpl.ZEPP_LIFE, R.string.tag_nfc));
        wearDeviceEntities.add(new WearDevice("Mi Band 6", R.drawable.mi_band_6, 212, 257, ApplicationImpl.ZEPP_LIFE, R.string.tag_empty));
        wearDeviceEntities.add(new WearDevice("Mi Band 6", R.drawable.mi_band_6, 211, 256, ApplicationImpl.ZEPP_LIFE, R.string.tag_nfc));
        wearDeviceEntities.add(new WearDevice("Mi Band 7", R.drawable.mi_band_7, 260, 256, ApplicationImpl.ZEPP_LIFE, R.string.tag_empty));
        wearDeviceEntities.add(new WearDevice("Mi Band 7", R.drawable.mi_band_7, 262, 258, ApplicationImpl.ZEPP_LIFE, R.string.tag_empty));
        wearDeviceEntities.add(new WearDevice("Mi Band 7", R.drawable.mi_band_7, 263, 259, ApplicationImpl.ZEPP_LIFE, R.string.tag_empty));
        wearDeviceEntities.add(new WearDevice("Mi Band 7", R.drawable.mi_band_7, 264, 260, ApplicationImpl.ZEPP_LIFE, R.string.tag_empty));
        wearDeviceEntities.add(new WearDevice("Mi Band 7", R.drawable.mi_band_7, 265, 261, ApplicationImpl.ZEPP_LIFE, R.string.tag_empty));

        // Amazfit Ares
        wearDeviceEntities.add(new WearDevice("Amazfit Ares", R.drawable.amazfit_ares, 65, 256, ApplicationImpl.ZEPP, R.string.tag_empty));

        // Amazfit Bip
        wearDeviceEntities.add(new WearDevice("Amazfit Bip", R.drawable.amazfit_bip, 12, 256, ApplicationImpl.ZEPP_LIFE, R.string.tag_empty));
        wearDeviceEntities.add(new WearDevice("Amazfit Bip Lite", R.drawable.amazfit_bip, 39, 256, ApplicationImpl.ZEPP_LIFE, R.string.tag_empty));
        wearDeviceEntities.add(new WearDevice("Amazfit Bip Lite", R.drawable.amazfit_bip, 42, 257, ApplicationImpl.ZEPP_LIFE, R.string.tag_global));
        wearDeviceEntities.add(new WearDevice("Amazfit Bip S", R.drawable.amazfit_bip_s, 20, 256, ApplicationImpl.ZEPP, R.string.tag_empty));
        wearDeviceEntities.add(new WearDevice("Amazfit Bip S", R.drawable.amazfit_bip_s, 28, 258, ApplicationImpl.ZEPP, R.string.tag_global));
        wearDeviceEntities.add(new WearDevice("Amazfit Bip S Lite", R.drawable.amazfit_bip_s, 29, 259, ApplicationImpl.ZEPP, R.string.tag_empty));
        wearDeviceEntities.add(new WearDevice("Amazfit Bip 3", R.drawable.amazfit_bip_3, 257, 257, ApplicationImpl.ZEPP, R.string.tag_empty));
        wearDeviceEntities.add(new WearDevice("Amazfit Bip 3 Pro", R.drawable.amazfit_bip_3, 256, 256, ApplicationImpl.ZEPP, R.string.tag_empty));

        // Amazfit Pop
        wearDeviceEntities.add(new WearDevice("Amazfit Pop", R.drawable.amazfit_bip_u, 68, 258, ApplicationImpl.ZEPP, R.string.tag_empty));
        wearDeviceEntities.add(new WearDevice("Amazfit Pop Pro", R.drawable.amazfit_bip_u, 67, 256, ApplicationImpl.ZEPP, R.string.tag_empty));
        wearDeviceEntities.add(new WearDevice("Amazfit Bip U", R.drawable.amazfit_bip_u, 70, 259, ApplicationImpl.ZEPP, R.string.tag_empty));
        wearDeviceEntities.add(new WearDevice("Amazfit Bip U Pro", R.drawable.amazfit_bip_u, 69, 257, ApplicationImpl.ZEPP, R.string.tag_empty));

        // Amazfit GTR
        wearDeviceEntities.add(new WearDevice("Amazfit GTR 42", R.drawable.amazfit_gtr_42, 37, 256, ApplicationImpl.ZEPP, R.string.tag_empty));
        wearDeviceEntities.add(new WearDevice("Amazfit GTR 42", R.drawable.amazfit_gtr_42, 38, 257, ApplicationImpl.ZEPP, R.string.tag_global));
        wearDeviceEntities.add(new WearDevice("Amazfit GTR 42 SWK", R.drawable.amazfit_gtr_42, 51, 260, ApplicationImpl.ZEPP, R.string.tag_empty));
        wearDeviceEntities.add(new WearDevice("Amazfit GTR 42 SWK", R.drawable.amazfit_gtr_42, 52, 261, ApplicationImpl.ZEPP, R.string.tag_global));
        wearDeviceEntities.add(new WearDevice("Amazfit GTR 47 Disney", R.drawable.amazfit_gtr, 54, 259, ApplicationImpl.ZEPP, R.string.tag_empty));
        wearDeviceEntities.add(new WearDevice("Amazfit GTR 47", R.drawable.amazfit_gtr, 35, 256, ApplicationImpl.ZEPP, R.string.tag_empty));
        wearDeviceEntities.add(new WearDevice("Amazfit GTR 47", R.drawable.amazfit_gtr, 36, 256, ApplicationImpl.ZEPP, R.string.tag_global));
        wearDeviceEntities.add(new WearDevice("Amazfit GTR 47 Lite", R.drawable.amazfit_gtr, 46, 258, ApplicationImpl.ZEPP, R.string.tag_global));
        wearDeviceEntities.add(new WearDevice("Amazfit GTR 2", R.drawable.amazfit_gtr_2, 244, 258, ApplicationImpl.ZEPP, R.string.tag_new));
        wearDeviceEntities.add(new WearDevice("Amazfit GTR 2", R.drawable.amazfit_gtr_2, 63, 256, ApplicationImpl.ZEPP, R.string.tag_empty));
        wearDeviceEntities.add(new WearDevice("Amazfit GTR 2", R.drawable.amazfit_gtr_2, 64, 257, ApplicationImpl.ZEPP, R.string.tag_global));
        wearDeviceEntities.add(new WearDevice("Amazfit GTR 2e", R.drawable.amazfit_gtr_2e, 206, 256, ApplicationImpl.ZEPP, R.string.tag_empty));
        wearDeviceEntities.add(new WearDevice("Amazfit GTR 2e", R.drawable.amazfit_gtr_2e, 209, 257, ApplicationImpl.ZEPP, R.string.tag_global));
        wearDeviceEntities.add(new WearDevice("Amazfit GTR 2 eSIM", R.drawable.amazfit_gtr_2, 98, 256, ApplicationImpl.ZEPP, R.string.tag_empty));
        wearDeviceEntities.add(new WearDevice("Amazfit GTR 3", R.drawable.amazfit_gtr_3, 226, 256, ApplicationImpl.ZEPP, R.string.tag_empty));
        wearDeviceEntities.add(new WearDevice("Amazfit GTR 3", R.drawable.amazfit_gtr_3, 227, 257, ApplicationImpl.ZEPP, R.string.tag_global));
        wearDeviceEntities.add(new WearDevice("Amazfit GTR 3 Pro", R.drawable.amazfit_gtr_3, 229, 256, ApplicationImpl.ZEPP, R.string.tag_empty));
        wearDeviceEntities.add(new WearDevice("Amazfit GTR 3 Pro", R.drawable.amazfit_gtr_3, 230, 257, ApplicationImpl.ZEPP, R.string.tag_global));
        wearDeviceEntities.add(new WearDevice("Amazfit GTR 3 Pro", R.drawable.amazfit_gtr_3, 242, 257, ApplicationImpl.ZEPP, R.string.tag_limited));

        // Amazfit GTS
        wearDeviceEntities.add(new WearDevice("Amazfit GTS", R.drawable.amazfit_gts, 40, 256, ApplicationImpl.ZEPP, R.string.tag_empty));
        wearDeviceEntities.add(new WearDevice("Amazfit GTS", R.drawable.amazfit_gts, 41, 257, ApplicationImpl.ZEPP, R.string.tag_global));
        wearDeviceEntities.add(new WearDevice("Amazfit GTS 2", R.drawable.amazfit_gts_2, 245, 258, ApplicationImpl.ZEPP, R.string.tag_empty));
        wearDeviceEntities.add(new WearDevice("Amazfit GTS 2", R.drawable.amazfit_gts_2, 77, 256, ApplicationImpl.ZEPP, R.string.tag_empty));
        wearDeviceEntities.add(new WearDevice("Amazfit GTS 2", R.drawable.amazfit_gts_2, 78, 257, ApplicationImpl.ZEPP, R.string.tag_global));
        wearDeviceEntities.add(new WearDevice("Amazfit GTS 2 Mini", R.drawable.amazfit_gts_2_mini, 91, 256, ApplicationImpl.ZEPP, R.string.tag_empty));
        wearDeviceEntities.add(new WearDevice("Amazfit GTS 2 Mini", R.drawable.amazfit_gts_2_mini, 92, 257, ApplicationImpl.ZEPP, R.string.tag_global));
        wearDeviceEntities.add(new WearDevice("Amazfit GTS 2 Mini 2022", R.drawable.amazfit_gts_2_mini, 243, 256, ApplicationImpl.ZEPP, R.string.tag_empty));
        wearDeviceEntities.add(new WearDevice("Amazfit GTS 2e", R.drawable.amazfit_gts_2, 207, 256, ApplicationImpl.ZEPP, R.string.tag_empty));
        wearDeviceEntities.add(new WearDevice("Amazfit GTS 2e", R.drawable.amazfit_gts_2, 210, 257, ApplicationImpl.ZEPP, R.string.tag_global));
        wearDeviceEntities.add(new WearDevice("Amazfit GTS 3", R.drawable.amazfit_gts_3, 224, 256, ApplicationImpl.ZEPP, R.string.tag_empty));
        wearDeviceEntities.add(new WearDevice("Amazfit GTS 3", R.drawable.amazfit_gts_3, 225, 257, ApplicationImpl.ZEPP, R.string.tag_global));
        wearDeviceEntities.add(new WearDevice("Amazfit GTS 4 Mini", R.drawable.amazfit_gts_4_mini, 246, 256, ApplicationImpl.ZEPP, R.string.tag_empty));
        wearDeviceEntities.add(new WearDevice("Amazfit GTS 4 Mini", R.drawable.amazfit_gts_4_mini, 247, 259, ApplicationImpl.ZEPP, R.string.tag_global));

        // Amazfit Neo
        wearDeviceEntities.add(new WearDevice("Amazfit Neo", R.drawable.amazfit_neo, 62, 256, ApplicationImpl.ZEPP, R.string.tag_empty));

        // Amazfit T-Rex
        wearDeviceEntities.add(new WearDevice("Amazfit T-Rex", R.drawable.amazfit_t_rex, 50, 256, ApplicationImpl.ZEPP, R.string.tag_empty));
        wearDeviceEntities.add(new WearDevice("Amazfit T-Rex 2", R.drawable.amazfit_t_rex_2, 418, 256, ApplicationImpl.ZEPP, R.string.tag_empty));
        wearDeviceEntities.add(new WearDevice("Amazfit T-Rex 2", R.drawable.amazfit_t_rex_2, 419, 257, ApplicationImpl.ZEPP, R.string.tag_global));
        wearDeviceEntities.add(new WearDevice("Amazfit T-Rex Pro", R.drawable.amazfit_t_rex_pro, 83, 256, ApplicationImpl.ZEPP, R.string.tag_empty));
        wearDeviceEntities.add(new WearDevice("Amazfit T-Rex Pro", R.drawable.amazfit_t_rex_pro, 200, 257, ApplicationImpl.ZEPP, R.string.tag_global));

        // Amazfit Verge
        wearDeviceEntities.add(new WearDevice("Amazfit Verge Lite", R.drawable.amazfit_verge_lite, 30, 256, ApplicationImpl.ZEPP_LIFE, R.string.tag_global));

        // Amazfit X
        wearDeviceEntities.add(new WearDevice("Amazfit X", R.drawable.amazfit_x, 53, 256, ApplicationImpl.ZEPP, R.string.tag_empty));
        wearDeviceEntities.add(new WearDevice("Amazfit X", R.drawable.amazfit_x, 71, 257, ApplicationImpl.ZEPP, R.string.tag_global));

        // ZEPP E
        wearDeviceEntities.add(new WearDevice("Zepp E Circle", R.drawable.zepp_e_circle, 57, 256, ApplicationImpl.ZEPP, R.string.tag_empty));
        wearDeviceEntities.add(new WearDevice("Zepp E Circle", R.drawable.zepp_e_circle, 81, 257, ApplicationImpl.ZEPP, R.string.tag_global));
        wearDeviceEntities.add(new WearDevice("Zepp E Square", R.drawable.zepp_e_square, 61, 256, ApplicationImpl.ZEPP, R.string.tag_empty));
        wearDeviceEntities.add(new WearDevice("Zepp E Square", R.drawable.zepp_e_square, 82, 257, ApplicationImpl.ZEPP, R.string.tag_global));

        // ZEPP Z
        wearDeviceEntities.add(new WearDevice("Zepp Z", R.drawable.zepp_z, 56, 256, ApplicationImpl.ZEPP, R.string.tag_empty));
        wearDeviceEntities.add(new WearDevice("Zepp Z", R.drawable.zepp_z, 76, 257, ApplicationImpl.ZEPP, R.string.tag_global));

        // Amazfit Scale
        wearDeviceEntities.add(new WearDevice("Amazfit Smart Scale", R.drawable.amazfit_smart_scale, 104, 256, ApplicationImpl.ZEPP, R.string.tag_empty));
        return wearDeviceEntities;
    }
}
