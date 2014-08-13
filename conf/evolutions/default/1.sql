# Slides schema

# --- !Ups

CREATE SEQUENCE slide_id_seq;
CREATE TABLE slide (
    id integer NOT NULL DEFAULT nextval('slide_id_seq'),
    markdown text
);

# --- !Downs

DROP TABLE slide;
DROP SEQUENCE slide_id_seq;