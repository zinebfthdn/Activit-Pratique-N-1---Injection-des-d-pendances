# Activité Pratique N°1 - Injection des Dépendances

## Réalisé par : **Zineb Feth-Eddine**

### Introduction
Ce projet met en œuvre les concepts fondamentaux d'injection de dépendances (IoC - Inversion of Control) en Java. L'objectif principal est d'illustrer comment réduire le couplage entre les composants d'une application en utilisant des techniques comme :
- L'instanciation statique.
- L'instanciation dynamique.
- L'utilisation du framework **Spring** avec des configurations XML et annotations.

---

### Structure du Projet

Voici l'organisation des packages et des classes principales dans ce projet :
<img src="Screens/str.png.png" alt="Page de connexion" />


#### **1. Package `dao`**
- **`IDao`** : Interface définissant une méthode `getData()` pour récupérer des données.
- **`DaoImpl`** : Implémentation de l'interface `IDao`.
- **`ext.DaoImpl2` et `ext.DaoImplVWS`** : Extensions supplémentaires de `IDao`.

#### **2. Package `metier`**
- **`IMetier`** : Interface définissant une méthode `calcul()` pour effectuer un calcul basé sur les données fournies par `IDao`.
- **`MetierImpl`** : Implémentation de `IMetier` utilisant un couplage faible avec `IDao`.

#### **3. Package `pres` (présentation)**
- **`Presentation`** : Exemple d'injection de dépendances par instanciation statique.
- **`pres2`** : Exemple d'injection par instanciation dynamique.
- **`presSpringXML`** : Exemple d'utilisation de Spring avec configuration XML.
- **`presSpringAnnotations`** : Exemple d'utilisation de Spring avec annotations.

#### **4. Classe principale**
- **`ma.mundia.Main`** : Classe principale pour tester les différentes techniques d'injection.

---

### Fonctionnalités Implémentées

1. **Injection par Instanciation Statique**  
   Dans la classe `Presentation`, les objets `DaoImpl` et `MetierImpl` sont instanciés et reliés manuellement.

2. **Injection par Instanciation Dynamique**
   Utilise la réflexion Java pour instancier les dépendances dynamiquement, ce qui réduit le couplage.

3. **Injection avec Spring**  
   - **Version XML** : La configuration des beans est effectuée dans un fichier XML.
   - **Version Annotations** : Les dépendances sont gérées via des annotations telles que `@Component` et `@Autowired`.

---

### Ressources Vidéo Utilisées

- [Partie 1](https://www.youtube.com/watch?v=08eEhNKOw7I) : Introduction aux concepts de l'injection des dépendances.  
- [Partie 2](https://www.youtube.com/watch?v=oP-6ly2Zt5E) : Utilisation de Spring pour gérer les dépendances.

---

### Commandes de Test

1. **Exécuter les tests unitaires** : 
   mvn test
<img src="Screens/test.png.png" alt="Page de connexion" />
<img src="Screens/test (2).png" alt="Page de connexion" />

