package org.example.userservice.migrations;

import org.flywaydb.core.api.migration.BaseJavaMigration;
import org.flywaydb.core.api.migration.Context;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

@Component
public class V2__create_todos extends BaseJavaMigration {
    @Override
    public void migrate(Context context) throws Exception {
        Connection postgres = DriverManager.getConnection("jdbc:postgresql://localhost:5432/g38", "postgres", "1223");


        System.out.println("aksjaksjab");

        Statement statement = postgres.createStatement();
        statement.execute("create table todos(id serial,name text, mail text)");
        statement.close();
        postgres.close();

    }
}
