CREATE TABLE Users (
  user_id INT PRIMARY KEY,
  username VARCHAR(255),
  email VARCHAR(255),
  password VARCHAR(255)
);

CREATE TABLE Posts (
  post_id INT PRIMARY KEY,
  user_id INT,
  content VARCHAR(255),
  timestamp TIMESTAMP,
  FOREIGN KEY (user_id) REFERENCES Users(user_id)
);

CREATE TABLE Comments (
  comment_id INT PRIMARY KEY,
  post_id INT,
  user_id INT,
  content VARCHAR(255),
  timestamp TIMESTAMP,
  FOREIGN KEY (post_id) REFERENCES Posts(post_id),
  FOREIGN KEY (user_id) REFERENCES Users(user_id)
);
