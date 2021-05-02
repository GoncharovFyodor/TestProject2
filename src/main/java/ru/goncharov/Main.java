package ru.goncharov;

import ru.goncharov.utils.PostgreSQLConnection;
import ru.goncharov.view.TableStudents;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Connection connection = PostgreSQLConnection.getConnection();
        TableStudents.run(args,connection);
    }
}
