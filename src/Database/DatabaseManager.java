package Database;
import characters.Warrior;
import characters.Magician;
import characters.Character;
import java.sql.*;

public class DatabaseManager {
    /**
     * Cette classe permet de faire le lien avec la base de données.
     */

    private static final String URL = "jdbc:mysql://localhost:3306/Characters?serverTimezone=UTC";
    private static final String USER = "javauser";
    private static final String PASSWORD = "Java123!";

    private Connection connection;

    public DatabaseManager() {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connexion réussie à la base de données.");
        } catch (SQLException e) {
            System.err.println("Échec de la connexion : " + e.getMessage());
        }
    }

    public void getHeroes() {
        String query = "SELECT * FROM `Character`";

        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                int id = rs.getInt("Id");
                String type = rs.getString("Type");
                String name = rs.getString("Name");
                int lifePoints = rs.getInt("LifePoints");
                int strength = rs.getInt("Strength");
                String offensive = rs.getString("OffensiveEquipment");

                System.out.println(id + " | " + type + " | " + name + " | " +
                        lifePoints + " LP | " + strength + " STR | " +
                        offensive);
            }

        } catch (SQLException e) {
            System.err.println("Erreur lors de la requête SELECT : " + e.getMessage());
        }
    }


    public void createHero(Character character) {
        String query = "INSERT INTO `Character`(Type, Name, LifePoints, Strength, OffensiveEquipment) VALUES('Warrior', '1', 2, 3, '4')";


        if (character instanceof Warrior) {
            if (((Warrior) character).hasSword) {
                 query = "INSERT INTO `Character`(Type, Name, LifePoints, Strength, OffensiveEquipment) VALUES('Warrior', '" + character.charName + "', " + character.life + ", " + character.attack + ", 'Sword')";
            }
            if (((Warrior) character).hasClub) {
                 query = "INSERT INTO `Character`(Type, Name, LifePoints, Strength, OffensiveEquipment) VALUES('Warrior', '" + character.charName + "', " + character.life + ", " + character.attack + ", 'Club')";
            }
            if (!((Warrior) character).hasSword && !((Warrior) character).hasClub) {
                query = "INSERT INTO `Character`(Type, Name, LifePoints, Strength, OffensiveEquipment) VALUES('Warrior', '" + character.charName + "', " + character.life + ", " + character.attack + ", 'none')";
            }
        } else if (character instanceof Magician) {
            if (((Magician) character).hasLightning) {
                 query = "INSERT INTO `Character`(Type, Name, LifePoints, Strength, OffensiveEquipment) VALUES('Magician', '" + character.charName + "', " + character.life + ", " + character.attack + ", 'Lightning')";
            }
            if (((Magician) character).hasFireball) {
                 query = "INSERT INTO `Character`(Type, Name, LifePoints, Strength, OffensiveEquipment) VALUES('Magician', '" + character.charName + "', " + character.life + ", " + character.attack + ", 'Fireball')";
            }
            if (!((Magician) character).hasLightning && ! ((Magician) character).hasFireball) {
                 query = "INSERT INTO `Character`(Type, Name, LifePoints, Strength, OffensiveEquipment) VALUES('Magician', '" + character.charName + "', " + character.life + ", " + character.attack + ", 'none')";
            }
        } else {
            System.out.println("Y'a un problème de classe dans la requette d'ajout du perso dans la base");
        }

        try (Statement stmt = connection.createStatement()) {
            stmt.executeUpdate(query);
            // traite le résultat ici si besoin
        } catch (SQLException e) {
            e.printStackTrace(); // ou log / afficher un message utilisateur
        }

    }

    public void close() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Connexion fermée.");
            }
        } catch (SQLException e) {
            System.err.println("Erreur lors de la fermeture de la connexion : " + e.getMessage());
        }
    }
}
