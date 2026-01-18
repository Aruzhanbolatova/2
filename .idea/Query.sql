CREATE TABLE shelter (
                         shelter_id SERIAL PRIMARY KEY,
                         name VARCHAR(100) NOT NULL,
                         location VARCHAR(150),
                         capacity INT CHECK (capacity >= 0)
);
SELECT ALL FROM shelter;
CREATE TABLE pet
(
    pet_id     SERIAL PRIMARY KEY,
    name       VARCHAR(100) NOT NULL,
    type       VARCHAR(50),
    age        INT CHECK ( age >= 0 ),
    status     VARCHAR(30),
    shelter_id INT,
    CONSTRAINT fk_shelter
        FOREIGN KEY (shelter_id)
            REFERENCES shelter (shelter_id)
            ON DELETE SET NULL
);
SELECT ALL FROM pet;

INSERT INTO shelter (name, location, capacity)
VALUES ('Happy Paws', 'Astana', 50);

INSERT INTO pet (name, type, age, status, shelter_id)
VALUES ('Luna', 'Cat', 2, 'available', 1);
SELECT name, location FROM shelter;
SELECT  name, type, status FROM pet;

