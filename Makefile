build:
	./mvnw clean package

docker_build:
	docker build --tag=hex-arch-demo:latest .

docker_up: build docker_build
	docker run -p8080:8080 hex-arch-demo:latest