DROP TABLE IF EXISTS employee;

CREATE TABLE employee (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  email_id VARCHAR(250) DEFAULT NULL
);

INSERT INTO employee (first_name, last_name, email_id) VALUES
  ('Aliko', 'Dangote', 'adangote@gmail.com'),
  ('Bill', 'Gates', 'bgates@gmail.com'),
  ('Folrunsho', 'Alakija', 'falakija@gmail.com');