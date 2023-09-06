# How To Run:

1. Clone / download repo
2. From within the REST folder run this command in terminal: "mvn package". This should generate the jar file.
3. Run: "docker build -t triangle_api . " within the same terminal to build the Docker image
4. Finally run: "docker run -p :8000:8080 triangle_api" to run the program


