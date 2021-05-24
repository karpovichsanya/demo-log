DROP TABLE IF EXISTS test_log;

CREATE TABLE test_log
(
    id            INT AUTO_INCREMENT PRIMARY KEY,
    column_first  VARCHAR(250) NOT NULL,
    column_second VARCHAR(250) NOT NULL
);
INSERT INTO test_log (column_first, column_second)
VALUES ('Aliko', 'Dangote'),
       ('Bill', 'Gates'),
       ('Folrunsho', 'Alakija');