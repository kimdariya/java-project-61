setup:
	cd code/app && ./gradlew clean install

run-dist:
	./code/app/build/install/game_of_mind/bin/game_of_mind

test:
	cd code/app && ./gradlew test