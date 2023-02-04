            CREATE VIEW firstname_lastname AS SELECT (firstname and lastname columns) FROM site_user;




*The syntax for creating a view is as follows:
 * CREATE VIEW view_name AS sql_statement;

 *So the syntax for creating the 'steve table' table above would be:
 * CREATE VIEW stevesview AS SELECT * FROM site_user WHERE firstname = 'Steve';
 
 *This is beneficial because we can now execute SQL queries on this view instead of the entire table.
 * For example if I wanted to get the average ages of all the steves, I can do that with this new view and the aggregate function AVG() like so:
 * SELECT AVG(age) from stevesview;

 *roblem1: Create a view called "firstname_lastname" in problem1.sql from the site_user table that only has the firstname and lastname columns.
         * NOTE: This table should NOT have the id and age.