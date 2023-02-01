SELECT * FROM table_right RIGHT OUTER JOIN table_left ON class_title = table_right.textbook;





--Problem 2: In problem2.sql, Use a RIGHT OUTER JOIN to combine the class (left side) and textbook
    --(right side) tables using the class_title column as the join on column. This means that when no class
    --exists for a textbook, a row with a NULL class will be in the resulting query.
    --Hint: You should start with "SELECT * FROM class"