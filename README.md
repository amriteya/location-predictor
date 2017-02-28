# location-predictor
Predict location of restaurants

Inject logic in `LocationFinderBI.java`

To run the project:  `mvn clean spring-boot:run -DzomatoToken=<Zomato-api-token>`

You can get your token [here](https://developers.zomato.com/api)

Sample API hit: `curl -X GET -H "http://localhost:8080/v0.1/api/predict?lat=13.0849120000&lon=80.2612210000"`

Null response for now.
