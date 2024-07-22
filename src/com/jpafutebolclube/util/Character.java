package com.jpafutebolclube.util;

/**
 *
 * @author leandro
 */
public class Character {
    public static String CharacterRemove(String text) {
        return text.replace(".", "").replace("-", "");
    }
}
