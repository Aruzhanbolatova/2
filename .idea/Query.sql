
DROP TABLE IF EXISTS pet;
DROP TABLE IF EXISTS shelter;

CREATE TABLE shelter (
                         shelter_id SERIAL PRIMARY KEY,
                         name       VARCHAR(100) NOT NULL,
                         location   VARCHAR(150),
                         capacity   INT CHECK (capacity >= 0)
);

CREATE TABLE pet (
                     pet_id     SERIAL PRIMARY KEY,
                     name       VARCHAR(100) NOT NULL,
                     type       VARCHAR(50),
                     age        INT CHECK (age >= 0),
                     status     VARCHAR(30),
                     shelter_id INT,
                     CONSTRAINT fk_shelter
                         FOREIGN KEY (shelter_id)
                             REFERENCES shelter (shelter_id)
                             ON DELETE SET NULL
);

INSERT INTO shelter (name, location, capacity)
VALUES ('Happy Paws', 'Astana', 50);


INSERT INTO pet (name, type, age, status, shelter_id)
VALUES (
           'Luna',
           'Cat',
           2,
           'available',
           (SELECT shelter_id FROM shelter WHERE name = 'Happy Paws' LIMIT 1)
       );

SELECT * FROM shelter;
SELECT * FROM pet;




