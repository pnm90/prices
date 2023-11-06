DROP SCHEMA IF EXISTS PRICES;

CREATE SCHEMA PRICES;

DROP TABLE IF EXISTS PRICES.BRANDS;

CREATE TABLE PRICES.BRANDS (
                        ID INT AUTO_INCREMENT PRIMARY KEY,
                        NAME VARCHAR(255) NOT NULL,
                        Description TEXT
);

DROP TABLE IF EXISTS PRICES.PRICES;

CREATE TABLE PRICES.PRICES (
                        ID INT AUTO_INCREMENT PRIMARY KEY,
                        BRAND_ID INT,
                        START_DATE TIMESTAMP,
                        END_DATE TIMESTAMP,
                        PRICE_LIST INT,
                        PRODUCT_ID INT NOT NULL ,
                        PRIORITY INT,
                        PRICE DECIMAL(10, 2) NOT NULL ,
                        CURR VARCHAR(3) NOT NULL ,
                        CREATED_AT TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                        LAST_UPDATED TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                        FOREIGN KEY (BRAND_ID) REFERENCES BRANDS(ID)
);



