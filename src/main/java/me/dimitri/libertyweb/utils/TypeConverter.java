package me.dimitri.libertyweb.utils;

import space.arim.libertybans.api.PunishmentType;

public class TypeConverter {
    public static PunishmentType getType(String type) {
        return PunishmentType.valueOf(type.toUpperCase());
    }
}
