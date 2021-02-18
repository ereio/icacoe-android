# icacoe - Kotlin

a tictactoe app created as an Android App example using Kotlin and Redux

## Overview

This is actually my first time ever using Kotlin. Much of what I know about Android comes from development starting way back in 2014 when I studied developing android using Java and BOTH Eclipse and Android Studio. Though I prefer declarative UI, I n

## Steps

0. create stubbed views based on estimated screens needed
0. added navigation library to navigate between screens
0. added style library to style navigation buttons and future components
0. routed navigation through stubbed routes
0. successfully navigated through app flow
0. added state management library (redux) for immutable state pattern (well known / documented pattern)
0. [flipper install in podfile causes issues in react native v0.63, macos only?](https://github.com/facebook/react-native/issues/30836) commented out flipper in podfile
0. create redux stores for a game and a board
0. create the board component and the nested components to create the rows and columns to tic-tac-toe
0. hook up the board to the redux store
0. create actions to handle in the incoming player moves (swapping users as we go)
0. edge case testing

## Improvements (with more time)

With additional time, I would have liked to add the following:

- eslintrc.js with rules formatted to desired code styling (editor agnostic code styleguide)
  - airbnb's probably
- Pick which user goes first on home screen
- See how many times each player type has won (or tied) on score board
- Clean up some rough domain logic 
- Testing domain logic (within the redux store and actions)
- extract react-navigation out to an isolated component alongside the view as index.js (similar to the store index.js)
- setup dotenv for development or staging environment config (if remote apis or demo data was available)
- add a nice icon
- actual UI/UX stuff