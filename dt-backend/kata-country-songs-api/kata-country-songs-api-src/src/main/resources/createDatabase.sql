DROP TABLE IF EXISTS songs;

CREATE TABLE songs (
	name	VARCHAR(30) NOT NULL,
	artist	VARCHAR(30) NOT NULL,
	album	VARCHAR(30) NOT NULL,
	release_year	VARCHAR(30) NOT NULL
);

ALTER TABLE songs ADD CONSTRAINT p_songs PRIMARY KEY (name);

INSERT INTO songs (name, artist, album, release_year) VALUES('Jolene', 'Dolly Parton', 'Jolene', '1974');
INSERT INTO songs (name, artist, album, release_year) VALUES('Mama Tried', 'Merle Haggard', 'Killers Three', '1968');