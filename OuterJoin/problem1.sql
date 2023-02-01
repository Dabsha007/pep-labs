SELECT * FROM table_left LEFT OUTER JOIN table_right ON class_title = table_right.student;

 --SELECT * FROM table_left
 --FULL OUTER JOIN table_right ON table_left.character = table_right.character



--In problem1.sql, use a LEFT OUTER JOIN to combine the class (left side) and student
--(right side) tables using the class_title column as the join on column. This means that when no student
        --exists for a class, a row with a NULL student will be in the resulting query.
        -- Hint: You should start with "SELECT * FROM class"
        