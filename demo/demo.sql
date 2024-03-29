SET DB_CLOSE_DELAY -1;         
;              
CREATE USER IF NOT EXISTS "ROOT" SALT '9cefe1dea57d42cb' HASH '47125198169f800ae8107b918da5712e979890a7e0f27db8c4f31a68e1863454' ADMIN;        
CREATE MEMORY TABLE "PUBLIC"."ITEM"(
    "GUID" VARCHAR(255) NOT NULL,
    "DESCRIPTION" CLOB NOT NULL,
    "IMAGE_CONTENT_TYPE" VARCHAR(255) NOT NULL,
    "IMAGE_URL" VARCHAR(255) NOT NULL,
    "LINK" VARCHAR(255) NOT NULL,
    "PUB_DATE" TIMESTAMP NOT NULL,
    "TITLE" VARCHAR(255) NOT NULL
);       
ALTER TABLE "PUBLIC"."ITEM" ADD CONSTRAINT "PUBLIC"."CONSTRAINT_2" PRIMARY KEY("GUID");        