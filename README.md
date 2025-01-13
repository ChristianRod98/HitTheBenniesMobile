Hit the Bennies Mobile Application By: Jeniffer Jimenez, Cole Ledford, John Mullis, and Christian Rodriguez
 
HittheBennies is an Android mobile application, inspired by the whack a mole game, that displays squirrels for the player to hit to increase their score within the given time restraints. There are three time levels: easy (30 sec), medium (15 sec), and hard (10 sec).
Once you select your prefered difficulty, the desired time will start once the play button is pressed. Once you start hitting the Bennies, they will groan from pain and appear and disappear depending on which button you press. 

This Application was created using the Android Studio IDE, and development using Java13.0. To download this application, click on the code button, scroll down to download into zip file, and open the extracted folder in android studio.

# Code Layout
1. **Main Activity**- sets the app bar with the actions of stop, start, and the dialog fragment. ImageButtons are set up here and given id's to be used in timers and given fade affects. Sound is also implemented here and assigned to the image button ids. Finally, the timer for the game difficulty is set here.
2. **Game Difficulty Dialog Fragment**- holds the time-array to be used in the dialog fragment
3. **Activity Main**- arrages and defines 12 image buttons 
4. **Activity Help**- arranges and degines the help menu
5. **Appbar Menu**- organizes the actions (difficulty, help, difficutly explained) to take place 

