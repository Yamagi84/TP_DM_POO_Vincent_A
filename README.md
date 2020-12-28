# TP2

### ETAPE 5
Spring Web : 
Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.


Spring Data JPA (contain hibernate) : 
Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate.

H2 Database : 
Provides a fast in-memory database that supports JDBC API and R2DBC access, with a small (2mb) footprint. Supports embedded and server modes as well as a browser based console application.

Spring Boot DevTools : 
Provides fast application restarts, LiveReload, and configurations for enhanced development experience.

Thymeleaf : 
A modern server-side Java template engine for both web and standalone environments. Allows HTML to be correctly displayed in browsers and as static prototypes.


### ETAPE 13

L'url d'appel "/greeting" est paramétré par : "@RequestParam(name="nameGET", required=false, defaultValue="World")"

Le fichier HTML que l'on souhaitera afficher est choisi via la ligne : "@GetMapping("/greeting")"

C'est dans le "@RequestParam" que l'on va envoyer le nom à qui nous disons bonjour ici, et d'autres paramètres en général


### ETAPE 17

La table ADDRESS a été crée avec les différents paramètres entrés dans le model.


### ETAPE 20

On voit bien le contenu que l'on a rentré dans data.sql :

SELECT * FROM ADDRESS;
ID  	AUTHOR  			CONTENT  								CREATION  
1		Vincent AGUEDA		57 boulevard demorieux					2020-12-28 11:28:12.002525
2		Maxime LEPAGE		51 allee du gamay, 34080 montpellier	2020-12-28 11:28:12.008509
(2 rows, 11 ms)


### ETAPE 23

@Autowired


###ETAPE 30

Pour ajouter Bootstrap au projet, j'ai simplement téléchargé le dossier correspondant pour le placer dans le dossier "resources" du projet.





# TP4

### ETAPE 6

 - Il est nécessaire d'avoir une clé API pour appeler "OpenWeatherMap".

 - Ici, étant donné que l'on cherche à connaitre la météo à partir de coordonnées géographique, on appelle l'URL : 
	api.openweathermap.org/data/2.5/weather?lat={lat}&lon={lon}&appid={API key}
	avec entre {} les paramètres correspondants.
	
 - On utilise la méthode getForEntity() de la classe RestTemplate dont on en a crée une instance juste avant.
 
 - Le premier paramètre est un string contenant l'URL de l'API que l'on veut appeler, et le second est la classe correspondant au format de la réponse de l'API.
	Et la méthode retourne un objet ResponseEntity<Classe retournée par l'API> correspondant à la réponse de l'API.

 - Soit responseAdresse et responseMeteo les réponses des API pour respectivement l'adresse et la météo :
	1 - responseMeteo.getBody().getMain().getTemp();
	2 - responseMeteo.getBody().getWeather().get(0).getMain();
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
