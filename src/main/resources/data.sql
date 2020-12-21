DROP TABLE IF EXISTS task;

CREATE TABLE task (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  email VARCHAR(300) NOT NULL,
  description VARCHAR(250) NOT NULL
);

INSERT INTO task (name, email, description) VALUES
  ('name1', 'abc@gmail.com', 'This is name 1'),
  ('name2', 'abc@yahoo.com', 'This is name 2'),
  ('name3', 'abc@admin.com', 'This is name 3');