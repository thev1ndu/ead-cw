package com.quizly.Util;

import java.awt.Font;
import java.io.InputStream;

public class CinzelB {
    public static Font getFont(int size) {
        Font cinzelFont;
        try (InputStream is = CinzelB.class.getResourceAsStream("/fonts/Cinzel-Bold.ttf")) {
            // Load the Cinzel font from the resource
            cinzelFont = Font.createFont(Font.TRUETYPE_FONT, is);
            // Derive the font with the specified size
            cinzelFont = cinzelFont.deriveFont((float) size);
        } catch (Exception e) {
            // Fallback to a default font in case of an error
            cinzelFont = new Font("Serif", Font.PLAIN, size);
            e.printStackTrace();
        }
        return cinzelFont;
    }
}
