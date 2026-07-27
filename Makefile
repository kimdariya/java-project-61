setup:
	./gradlew clean install

run-dist:
	./build/install/brain-games/bin/brain-games

test:
	./gradlew test