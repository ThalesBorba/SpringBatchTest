package com.batch.spring.batch.util;

import io.github.cdimascio.dotenv.Dotenv;
import lombok.experimental.UtilityClass;

import java.util.TimeZone;

@UtilityClass
public class DotenvClass {

    static Dotenv dotenv = Dotenv.load();
    static String dbHost = dotenv.get("DB_HOST");
    static String dbPort = dotenv.get("DB_PORT");
    static String dbName = dotenv.get("DB_NAME");
    static String dbUser = dotenv.get("DB_USER");
    static String dbPassword = dotenv.get("DB_PASSWORD");

    public static void loadDotenv() {
        System.setProperty("spring.datasource.url", "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName);
        System.setProperty("spring.datasource.username", dbUser);
        System.setProperty("spring.datasource.password", dbPassword);
        TimeZone.setDefault(TimeZone.getTimeZone("America/Sao_Paulo"));
    }
}
