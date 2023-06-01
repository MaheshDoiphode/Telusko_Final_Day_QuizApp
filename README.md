# Telusko_Final_Day_QuizApp

## `QUIZ APP`

## Database 
``` 
`https://www.cloudclusters.io/`
`https://clients.cloudclusters.io/`
`pa.x.t.onsau.nde.r.s6@gmail.com`

SSL Shell
`psql -h postgresql-129056-0.cloudclusters.net -p 17532 -U admin -d Quiz`
12345678

Host - `postgresql-129056-0.cloudclusters.net`   
Port - 17532
IP Address - 172.106.0.61
_____
CREATE TABLE tech_stacks (
    id INT PRIMARY KEY AUTO_INCREMENT,
    tech_stack_name TEXT
);

CREATE TABLE questions (
    id INT PRIMARY KEY AUTO_INCREMENT,
    question TEXT,
    option1 TEXT,
    option2 TEXT,
    option3 TEXT,
    option4 TEXT,
    correct_answer TEXT,
    tech_stack_id INT,
    FOREIGN KEY (tech_stack_id) REFERENCES tech_stacks(id)
);

CREATE TABLE users (
    username TEXT PRIMARY KEY,
    role TEXT
);

CREATE TABLE player_scores (
    id INT PRIMARY KEY AUTO_INCREMENT,
    score INT,
    completion_time TIMESTAMP,
    user_id TEXT,
    tech_stack_id INT,
    FOREIGN KEY (username) REFERENCES users(username),
    FOREIGN KEY (tech_stack_id) REFERENCES tech_stacks(id)
);


``` 
## DB Dummy Data
```
-- Insert dummy data into the TechStacks table
INSERT INTO tech_stacks (tech_stack_name) VALUES
    ('Java'),
    ('Blockchain'),
    ('Angular'),
    ('Python');

-- Insert dummy data into the Questions table
INSERT INTO questions (question, option1, option2, option3, option4, correct_answer, tech_stack_id) VALUES
    ('What is the capital of France?', 'Paris', 'London', 'Berlin', 'Madrid', 'Paris', 1),
    ('What is a distributed ledger technology?', 'Bitcoin', 'Ethereum', 'Hyperledger', 'Ripple', 'Hyperledger', 2),
    ('What is a component in Angular?', 'HTML template', 'JavaScript function', 'CSS style', 'Database query', 'HTML template', 3),
    ('What is the main difference between a list and a tuple in Python?', 'Lists are mutable and tuples are immutable', 'Lists are immutable and tuples are mutable', 'Lists and tuples are both mutable', 'Lists and tuples are both immutable', 'Lists are mutable and tuples are immutable', 4);

-- Insert dummy data into the Users table
INSERT INTO users (username, role) VALUES
    ('admin', 'Admin'),
    ('player1', 'Player'),
    ('player2', 'Player'),
    ('player3', 'Player');

-- Insert dummy data into the PlayerScores table
INSERT INTO player_scores (username, tech_stack_id, score) VALUES
    ('player1', 1, 8),
    ('player2', 1, 6),
    ('player1', 2, 9),
    ('player3', 4, 10);
    
 ```
 
## Running the Angular App
```
Open your terminal and navigate to the project directory.
Run the command `npm install` to install the required dependencies.
Run the command `npm start` to start the React app.
The angular app will be accessible at `http://localhost:4200`
```

## Running the Spring Boot Application
```
Open your preferred IDE and import the Spring Boot project.
Ensure that the necessary dependencies are installed and configured correctly.
Start the Spring Boot application by running the `main` class.
The Spring Boot app will be accessible at `http://localhost:8080`
```


## Application Flow
```
Once both the Angular app and Spring Boot app are running, the application flow works as follows:
Users interact with the Angular app's user interface.
When a user performs an action, the angular app sends an HTTP request to the Spring Boot app.
The Spring Boot app receives the request, processes it, and performs the required operations.
The Spring Boot app interacts with the online PostgreSQL database to store and retrieve data.
After processing the request, the Spring Boot app sends back a response to the React app.
The React app receives the response and updates its user interface accordingly.
```
