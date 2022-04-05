
create database if not exists Musikvoting;


CREATE TABLE IF NOT EXISTS T_Gaste (
    Name VARCHAR(250) NOT NULL PRIMARY KEY
);

CREATE TABLE IF NOT EXISTS T_Musikwunsche (
    P_song_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    Songtitle VARCHAR(255) NOT NULL,
    band VARCHAR(255) NOT NULL,
    genre VARCHAR(255) NOT NULL
);
CREATE TABLE IF NOT EXISTS T_Votes (
    P_Vote_id INT NOT NULL AUTO_INCREMENT,
    PF_Name VARCHAR(250) NOT NULL,
    PF_Song_id INT NOT NULL,
    PRIMARY KEY (P_Vote_id , PF_Name , PF_Song_id),
    FOREIGN KEY (PF_Name)
        REFERENCES T_Gaste (Name),
    FOREIGN KEY (PF_Song_id)
        REFERENCES T_Musikwunsche (P_song_id)
);




 