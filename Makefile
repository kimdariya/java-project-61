setup:
	cd app && ./gradlew clean install

run-dist:
	./app/build/install/brain-game/bin/brain-game

test:
	cd app && ./gradlew test