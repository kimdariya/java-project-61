setup:
	cd code/app && ./gradlew clean install

run-dist:
	./code/app/build/install/brain-games/bin/brain-games

test:
	cd code/app && ./gradlew test
