--liquibase formatted sql

--changeset cristian:2.0
CREATE TABLE payment (
    payment_id INT PRIMARY KEY,
    user_id INT REFERENCES user(user_id) ON DELETE CASCADE,
    amount DECIMAL(10, 2) NOT NULL,
    payment_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    status VARCHAR(20) NOT NULL
);


--rollback DROP TABLE payment;