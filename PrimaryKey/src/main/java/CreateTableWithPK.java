
import Util.ConnectionUtil;
import Util.FileUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * SQL sublanguage: DDL (Data Definition Language)
 *
 * A primary key is a constraint that we can add to a column that labels that column as the unique identifier for a record in the table.
 *
 * Primary Keys are UNIQUE and NOT NULL implicitly.
 *
 * There are 3 types of Primary Keys:
 *  - Surrogate Key: The primary key is autogenerated by the database (this is the type of primary key we will be working with).
 *  - Natural Key: The primary key is naturally generated by the outside world.
 *  - Composite Key: They combination of 2 or more columns generates a unique identifier which you can utilize as the primary key.
 *
 * Since we will only be utilizing surrogate keys throughout pre-training, lets look at how the syntax will be.
 *
 * Let's say we want to create a "site_user" table that has the following columns:
 *      |   id  |      username        |        password         |
 *      ----------------------------------------------------------
 *      |1      |"user1"               |"pass123"                |
 *      |2      |"user2"               |"pass123"                |
 *      |3      |"user3"               |"pass123"                |
 *
 *      The SQL syntax would be as follows:
 *      CREATE TABLE site_user (
 *          id SERIAL PRIMARY KEY,
 *          username varchar(100),
 *          password varchar(100)
 *      );
 *
 *      The datatype "SERIAL" is an int that will autogenerate a unique number for us.
 *      The constraint "PRIMARY KEY" identifies the id column as the primary key column.
 *
 *      Additional reference material if needed: https://www.w3schools.com/sql/sql_primarykey.asp
 */
public class CreateTableWithPK {

    /**
     *      song table
     *      |   id  |      title        |        artist         |
     *      -----------------------------------------------------
     *      |1      |'Let it be'        |'Beatles'              |
     *      |2      |'Hotel California' |'Eagles'               |
     *      |3      |'Kashmir'          |'Led Zeppelin'         |
     */
    public void problem1(){

        /**
         * Assignment: create a table in problem1.sql called "song" that has 3 columns listed above
         *
         * NOTE: The "id" column is what we are going to define as the primary key.
         */
        String sql = FileUtil.parseSQLFile("problem1.sql");

        try {
            Connection connection = ConnectionUtil.getConnection();
            Statement s = connection.createStatement();
            s.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println("problem1: " + e.getMessage() + '\n');
        }
    }
   
    
}
