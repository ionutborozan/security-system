package jdbc;

public class JDBCConstants {

     public static String INSERT_INTO_USER_TABLE = "insert into user (first_name, last_name, age,weight) VALUES (?,?,?,?)";

     public static String DELETE_FROM_USER_BY_NAME = "delete from user where first_name = ? and last_name = ?";

     public static String UPDATE_WEIGTH_FOR_USER = "UPDATE SET weight = ? where first_name = ? and last_name = ?";

     public static String INSERT_INTO_USERLOGIN_TABLE = "insert into user_login (username,password) VALUES(?,?)";

//     public static String UPDATE_USER_CREDENTIALS = "UPDATE SET username = ? or password = ? where username = ? "



}
