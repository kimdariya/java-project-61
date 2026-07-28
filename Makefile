setup:
	cd app && ./gradlew clean install

run-dist:
	./app/build/install/brain-games/bin/brain-games
