package org.gradle;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Test {
    public static void main(String[] args) {
        FullNameDto fullNameDto = new FullNameDto("Olena", "Zavada");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        System.out.println(gson.toJson(fullNameDto));
    }
}
